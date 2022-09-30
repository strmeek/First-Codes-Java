public class Cliente {
    public static String idCliente;
    private static String senhaCliente;
    public static double saldoConta = 0;
    public static double saldoPoupanca = 0;

    public static String getIdCliente() {
        return idCliente;
    }

    public static String setIdCliente(String idCliente) {
        return idCliente;
    }

    public Cliente(String idCliente, double saldoConta,double saldoPoupanca) {
        this.idCliente = idCliente;
        this.saldoConta = saldoConta;
        this.saldoPoupanca = saldoPoupanca;
    }

    public static String getSenhaCliente() {

        return senhaCliente;
    }

    public static String setSenhaCliente(String senhaCliente) {
        return senhaCliente;

    }

    public static double getSaldoConta() {
        return saldoConta;
    }

    public static void setSaldoConta(double saldoConta) {
        Conta.saldoConta = saldoConta;
    }

    public static double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public static void setSaldoPoupanca(double saldoPoupanca) {
        Conta.saldoPoupanca = saldoPoupanca;
    }
}
