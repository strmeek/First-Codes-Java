import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Cadastro extends Cliente{
    static ArrayList<String> cadastros = new ArrayList<String>();
    static ArrayList<String> senhas = new ArrayList<String>();

    public Cadastro(String idCliente, double saldoConta, double saldoPoupanca) {
        super(idCliente, saldoConta, saldoPoupanca);
    }

    public static void cadastrarConta() {
        Scanner input = new Scanner(System.in);
        String id, senha;

        System.out.print("Seu ID: ");
        id = input.next();
        setIdCliente(id);

        System.out.print("Sua Senha: ");
        senha = input.next();
        setSenhaCliente(senha);

        cadastros.add(id);
        senhas.add(senha);
        Cliente[] cliente = new Cliente[3];
        cliente[cadastros.indexOf(id)] = new Cliente(getIdCliente(),getSaldoConta(),getSaldoPoupanca());
        Menu.login();
    }

    public static String fazerLogin() {
        Scanner input = new Scanner(System.in);
        String id, senha;
        int index;

        System.out.print("Digite seu ID: ");
        id = input.next();
        setIdCliente(id);

        System.out.print("Digite sua Senha: ");
        senha = input.next();
        setIdCliente(senha);

        index = cadastros.indexOf(id);
        if (Objects.equals(senhas.get(index), senha)) {
            new Menu(getIdCliente(),getSaldoConta(),getSaldoPoupanca());
            Menu.menu();
        }
        return idCliente;
    }
}


