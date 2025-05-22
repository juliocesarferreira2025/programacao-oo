public abstract class Conta {
    protected String cliente;
    protected double saldo;

    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("[Depósito] %s deposita R$%.2f%n", cliente, valor);
        System.out.printf("Saldo atual de %s: R$%.2f%n%n", cliente, saldo);
    }

    public void sacar(double valor) {
        saldo -= valor;
        System.out.printf("[Saque] %s realiza saque de R$%.2f%n", cliente, valor);
        System.out.printf("Saldo atual de %s: R$%.2f%n%n", cliente, saldo);
    }

    public void transferir(Conta destino, double valor) {
        saldo -= valor;
        destino.saldo += valor;
        System.out.printf("[Transferência] %s transfere R$%.2f para %s%n", cliente, valor, destino.cliente);
        System.out.printf("Saldo atual de %s: R$%.2f%n", cliente, saldo);
        System.out.printf("Saldo atual de %s após receber: R$%.2f%n%n", destino.cliente, destino.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void aplicarJurosDiarios(); {
        // Método genérico para sobrescrita
    }

    public abstract void imprimirExtrato(); {
        // Método genérico para sobrescrita
    }
}
