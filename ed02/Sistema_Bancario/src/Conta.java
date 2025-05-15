class Conta {
    private String cliente;
    private double saldo;

    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    public String getCliente() { return cliente; }

    public double getSaldo() { return saldo; }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public void imprimirExtrato(String tipoConta) {
        System.out.printf("[%s] Cliente: %s | Saldo: R$%.2f\n", tipoConta, cliente, saldo);
    }

    public void aplicarJuros(double percentual) {
        saldo += saldo * percentual;
    }
}

