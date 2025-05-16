public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Alice", 1000);
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
        ContaSalario cs = new ContaSalario("Carlos", 1200);

        System.out.println("========== INÍCIO DAS OPERAÇÕES ==========");

        cc.depositar(200);
        cp.sacar(100);
        cs.transferir(cc, 300);

        System.out.println("[Juros] Aplicando juros diários:");
        cc.aplicarJurosDiarios();
        cp.aplicarJurosDiarios();
        cs.aplicarJurosDiarios();

        System.out.println("\n========== EXTRATOS FINAIS ==========");
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cs.imprimirExtrato();
    }
}
