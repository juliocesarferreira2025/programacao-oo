public class ContaCorrente extends Conta {
    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo *= 1.001;
        System.out.printf("Juros 0.1%% aplicados à conta de %s. Novo saldo: R$%.2f%n", cliente, saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("[Conta Corrente] Cliente: %s | Saldo: R$%.2f%n", cliente, saldo);
    }
}


