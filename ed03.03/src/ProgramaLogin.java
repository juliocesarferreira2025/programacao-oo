public class ProgramaLogin {
    public static void main(String[] args) {
        Usuario admin = new Administrador("rootMaster", "masterSecure!9");
        Usuario visitante = new Visitante("guest", "qualquer");
        Usuario cliente = new Cliente("JULIO", "JCFS64970");

        // ADMINISTRADOR
        admin.exibirLogin();
        Autenticavel a1 = (Autenticavel) admin;
        System.out.println("Autenticação com 'masterSecure!9': " + a1.autenticar("masterSecure!9"));
        System.out.println("Autenticação com 'errada': " + a1.autenticar("errada"));

        Gerenciavel g1 = (Gerenciavel) admin;
        g1.alterarSenha("novaSenha");
        g1.bloquearUsuario();

        Logavel l1 = (Logavel) admin;
        l1.registrarLog("Exclusão de conta");

        System.out.println();

        // VISITANTE
        visitante.exibirLogin();

        System.out.println();

        // CLIENTE
        cliente.exibirLogin();
        Autenticavel a2 = (Autenticavel) cliente;
        System.out.println("Autenticação com 'JCFS64970': " + a2.autenticar("JCFS64970"));
        System.out.println("Autenticação com '12345': " + a2.autenticar("12345"));
    }
}
