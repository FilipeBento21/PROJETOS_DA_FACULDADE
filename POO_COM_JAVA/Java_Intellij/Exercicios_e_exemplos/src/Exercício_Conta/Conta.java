//public class Conta {
//    private String titular;
//    private double saldo;
//    private int num;
//
//    // Construtor
//    public Conta(String titular, double saldoInicial, int num) {
//        this.titular = titular;
//        this.saldo = saldoInicial;
//        this.num = num;
//    }
//
//    // Getters e Setters
//    public String getTitular() {
//        return titular;
//    }
//
//    public void setTitular(String titular) {
//        this.titular = titular;
//    }
//
//    public double getSaldo() {
//        return saldo;
//    }
//
//    public void setSaldo(double saldo) {
//        this.saldo = saldo;
//    }
//
//    public int getNum() {
//        return num;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }
//
//    /**
//     * Deposita um valor, caso seja positivo.
//     * @param valor valor a depositar
//     * @return true se o depósito foi efetuado; false caso contrário
//     */
//    public boolean depositar(double valor) {
//        if (valor > 0) {
//            this.saldo += valor;
//            return true;
//        }
//        return false;
//    }
//
//    /**
//     * Versão sobrecarregada: tenta depositar e,
//     * em caso de sucesso, imprime o valor e a origem.
//     * @param valor  valor a depositar
//     * @param origem descrição da origem do depósito
//     * @return true se o depósito foi efetuado; false caso contrário
//     */
//    public boolean depositar(double valor, String origem) {
//        boolean sucesso = depositar(valor);
//        if (sucesso) {
//            System.out.printf("Depósito de %.2f realizado. Origem: %s%n", valor, origem);
//        }
//        return sucesso;
//}
//}