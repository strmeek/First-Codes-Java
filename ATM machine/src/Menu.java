import java.util.Scanner;

public class Menu extends Conta {

    public Menu(String idCliente, double saldoConta, double saldoPoupanca) {
        super(idCliente, saldoConta, saldoPoupanca);
    }

    public static Cliente login() {
        Scanner loginInput = new Scanner(System.in);

        System.out.println("-Login-");

        int opcao;

        System.out.println("""
                Digite o número da opção desejada:
                1. Cadastrar uma conta!
                2. Já tenho uma conta!
                3. Sair!""");

        opcao = loginInput.nextInt();

        switch (opcao) {
            case 1:
                cadastrarConta();
                break;
            case 2:
                fazerLogin();
                break;
            case 3:
                break;
            default:
                System.out.print("Número inválido");
                login();
        }
        return null;
    }

    public static void menu() {
        Scanner menuInput = new Scanner(System.in);

        System.out.println("-Menu-");

        int opcao;

        System.out.println("""
                Digite o número da opção desejada:
                1. Conta Corrente
                2. Conta Poupança
                3. Sair""");

        opcao = menuInput.nextInt();

        switch (opcao) {
            case 1:
                contaCorrente();
                break;
            case 2:
                contaPoupanca();
                break;
            case 3:
                Menu.login();
                break;
            default:
                System.out.print("Número inválido");
                menu();

        }
    }

    public static void contaCorrente() {
        Scanner menuInput = new Scanner(System.in);

        System.out.println("-Conta Corrente-");

        int opcao;

        System.out.println("""
                Digite o número da opção desejada:
                1. Ver Saldo
                2. Depositar
                3. Sacar
                4. Sair""");

        opcao = menuInput.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(getSaldoConta());
                contaCorrente();
                break;
            case 2:
                getContaDepositoInput();
                contaCorrente();
                break;
            case 3:
                getContaSaqueInput();
                contaCorrente();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.print("Número inválido");
                contaCorrente();
        }
    }
    public static void contaPoupanca() {
        Scanner menuInput = new Scanner(System.in);

        System.out.println("-Conta Poupança-");

        int opcao;

        System.out.println("""
                Digite o número da opção desejada:
                1. Ver Saldo
                2. Depositar
                3. Sacar
                4. Sair""");

        opcao = menuInput.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(getSaldoPoupanca());
                contaPoupanca();
                break;
            case 2:
                getPoupancaDepositoInput();
                contaPoupanca();
                break;
            case 3:
                getPoupancaSaqueInput();
                contaPoupanca();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.print("Número inválido");
                contaPoupanca();
        }
    }
}

