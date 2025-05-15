public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Thorgal");
        Mago mago = new Mago("Merlino");
        Arqueiro arqueiro = new Arqueiro("Legolis");

        System.out.println("\n=== STATUS INICIAL ===");
        guerreiro.status();
        mago.status();
        arqueiro.status();

        System.out.println("\n=== COMBATE ===");
        guerreiro.atacar(mago.getPersonagem());
        mago.defender(20);

        mago.usarHabilidadeEspecial(new Personagem[] {
                guerreiro.getPersonagem(), arqueiro.getPersonagem()
        });

        arqueiro.usarHabilidadeEspecial(guerreiro.getPersonagem());

        guerreiro.usarHabilidadeEspecial(mago.getPersonagem());

        System.out.println("\n=== STATUS FINAL ===");
        guerreiro.status();
        mago.status();
        arqueiro.status();
    }
}


