class ContaPoupanca {
    private Conta conta;

    public ContaPoupanca(String cliente, double saldoInicial) {
        this.conta = new Conta(cliente, saldoInicial);
    }

    public void depositar(double valor) {
        conta.depositar(valor);
    }

    public void sacar(double valor) {
        conta.sacar(valor);
    }

    public void transferir(ContaPoupanca destino, double valor) {
        conta.transferir(destino.getConta(), valor);
    }

    public void aplicarJurosDiarios() {
        conta.aplicarJuros(0.0008); // 0.08% ao dia
    }

    public void imprimirExtrato() {
        conta.imprimirExtrato("Conta Poupança");
    }

    public Conta getConta() {
        return conta;
    }

    public double getSaldo() {
        return conta.getSaldo();
    }
}
