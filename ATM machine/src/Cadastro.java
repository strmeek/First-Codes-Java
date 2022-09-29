import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Cadastro {
    static ArrayList<String> cadastros = new ArrayList<String>();
    static ArrayList<String> senhas = new ArrayList<String>();
    private String idCliente;
    private String senhaCliente;

    public String getIdCliente() {
        return idCliente;
    }

    public String setIdCliente(String idCliente) {
        this.idCliente = idCliente;
        return idCliente;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public String setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
        return senhaCliente;

    }
    public static void cadastrarConta() {
        Scanner input = new Scanner(System.in);
        String id,senha;

        System.out.print("Seu ID: ");
        id = input.next();

        System.out.print("Sua Senha: ");
        senha = input.next();

        cadastros.add(id);
        senhas.add(senha);
        login();
    }

    public static void fazerLogin() {
        Scanner input = new Scanner(System.in);
        String id,senha;
        int index;

        System.out.print("Digite seu ID: ");
        id = input.next();

        System.out.print("Digite sua Senha: ");
        senha = input.next();

        index = cadastros.indexOf(id);
        if (Objects.equals(senhas.get(index), senha)) {
            new Menu();
            Menu.menu();
        }
    }
    public static void login() {
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
    }
}

