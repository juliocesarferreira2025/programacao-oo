public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Alice", 1000);
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
        ContaSalario cs = new ContaSalario("Carlos", 1200);

        System.out.println("========== INÍCIO DAS OPERAÇÕES ==========\n");

        System.out.println("[Depósito] Alice deposita R$200,00");
        cc.depositar(200);
        System.out.printf("Saldo atual de Alice: R$%.2f\n\n", cc.getSaldo());

        System.out.println("[Saque] Bob realiza saque de R$100,00");
        cp.sacar(100);
        System.out.printf("Saldo atual de Bob: R$%.2f\n\n", cp.getSaldo());

        System.out.println("[Transferência] Carlos transfere R$300,00 para Alice");
        cs.transferir(cc, 300);
        System.out.printf("Saldo atual de Carlos: R$%.2f\n", cs.getSaldo());
        System.out.printf("Saldo atual de Alice após receber: R$%.2f\n\n", cc.getSaldo());

        System.out.println("[Juros] Aplicando juros diários:");
        cc.aplicarJurosDiarios();
        System.out.printf("Juros 0.1%% aplicados à conta de Alice. Novo saldo: R$%.2f\n", cc.getSaldo());

        cp.aplicarJurosDiarios();
        System.out.printf("Juros 0.08%% aplicados à conta de Bob. Novo saldo: R$%.2f\n", cp.getSaldo());

        cs.aplicarJurosDiarios();
        System.out.printf("Conta salário de Carlos não recebe juros. Saldo permanece: R$%.2f\n", cs.getSaldo());

        System.out.println("\n========== EXTRATOS FINAIS ==========\n");
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cs.imprimirExtrato();
    }
}
