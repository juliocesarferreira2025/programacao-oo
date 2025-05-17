public class ContaPoupanca extends Conta {
    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }


    @Override
    public void aplicarJurosDiarios() {
        saldo *= 1.0008;
        System.out.printf("Juros 0.08%% aplicados à conta de %s. Novo saldo: R$%.2f%n", cliente, saldo);
    }

@Override
    public void imprimirExtrato() {
        System.out.printf("[Conta Poupança] Cliente: %s | Saldo: R$%.2f%n", cliente, saldo);
    }
}

