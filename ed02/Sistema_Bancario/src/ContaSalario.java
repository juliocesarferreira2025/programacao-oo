public class ContaSalario extends Conta {
    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo);
    }


    public void aplicarJurosDiarios() {
        System.out.printf("Conta salário de %s não recebe juros. Saldo permanece: R$%.2f%n", cliente, saldo);
    }


    public void imprimirExtrato() {
        System.out.printf("[Conta Salário] Cliente: %s | Saldo: R$%.2f%n", cliente, saldo);
    }
}
