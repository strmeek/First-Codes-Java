import java.text.DecimalFormat;
import java.util.Scanner;

public class Conta extends Cadastro {
    static Scanner input = new Scanner(System.in);
    static DecimalFormat realFormat = new DecimalFormat("'R$'###,##0.00");

    public Conta(String idCliente, double saldoConta, double saldoPoupanca) {
        super(idCliente, saldoConta, saldoPoupanca);
    }

    public static double contaDeposito(double deposito) {
        saldoConta = saldoConta + deposito;
        return saldoConta;
    }

    public static double poupancaDeposito(double deposito) {
        saldoPoupanca = saldoPoupanca + deposito;
        return saldoPoupanca;
    }

    public static double contaSaque(double saque) {
        saldoConta = saldoConta - saque;
        return saldoConta;
    }

    public static double poupancaSaque(double saque) {
        saldoPoupanca = saldoPoupanca - saque;
        return saldoPoupanca;
    }

    public static void getContaDepositoInput(Cliente.saldoConta()) {
            System.out.println("Saldo da Conta Corrente: " + realFormat.format(saldoConta));
            System.out.print("Depósito:");
            double deposito = input.nextDouble();

            if ((saldoConta + deposito) >= 0) {
                contaDeposito(deposito);
                setSaldoConta(saldoConta);
                System.out.println("Novo saldo: " + realFormat.format(saldoConta));
            } else {
                System.out.println("Saldo não pode ser negativo.");
            }
    }

    public static void getPoupancaDepositoInput() {
        System.out.println("Saldo da Poupanca: " + realFormat.format(saldoPoupanca));
        System.out.print("Depósito:");
        double deposito = input.nextDouble();

        if ((saldoPoupanca + deposito) >= 0) {
            poupancaDeposito(deposito);
            setSaldoPoupanca(saldoPoupanca);
            System.out.println("Novo saldo: " + realFormat.format(saldoPoupanca));
        } else {
            System.out.println("Saldo não pode ser negativo.");
        }
    }

    public static void getContaSaqueInput() {
        System.out.println("Saldo da Conta Corrente: " + realFormat.format(saldoConta));
        System.out.print("Saque:");
        double saque = input.nextDouble();

        if ((saldoConta - saque) >= 0) {
            contaSaque(saque);
            setSaldoConta(saldoConta);
            System.out.println("Novo saldo: " + realFormat.format(saldoConta));
        }
        else {
            System.out.println("Saldo não pode ser negativo.");
        }
    }
    public static void getPoupancaSaqueInput() {
        System.out.println("Saldo da Poupanca: " + realFormat.format(saldoPoupanca));
        System.out.print("Depósito:");
        double saque = input.nextDouble();

        if ((saldoPoupanca - saque) >= 0) {
            poupancaSaque(saque);
            setSaldoPoupanca(saldoPoupanca);
            System.out.println("Novo saldo: " + realFormat.format(saldoPoupanca));
        }
        else {
            System.out.println("Saldo não pode ser negativo.");
        }
    }
}

