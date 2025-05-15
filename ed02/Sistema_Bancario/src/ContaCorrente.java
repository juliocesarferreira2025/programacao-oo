class ContaCorrente {
    private Conta conta;

    public ContaCorrente(String cliente, double saldoInicial) {
        this.conta = new Conta(cliente, saldoInicial);
    }

    public void depositar(double valor) {
        conta.depositar(valor);
    }

    public void sacar(double valor) {
        conta.sacar(valor);
    }

    public void transferir(ContaCorrente destino, double valor) {
        conta.transferir(destino.getConta(), valor);
    }

    public void aplicarJurosDiarios() {
        conta.aplicarJuros(0.001); // 0.1% ao dia
    }

    public void imprimirExtrato() {
        conta.imprimirExtrato("Conta Corrente");
    }

    public Conta getConta() {
        return conta;
    }

    public double getSaldo() {
        return conta.getSaldo();
    }
}


