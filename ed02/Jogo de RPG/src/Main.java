public class Main {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        System.out.println("\n=== STATUS INICIAL ===");
        g.status();
        m.status();
        a.status();

        System.out.println("\n=== COMBATE ===");
        g.atacar(m);
        m.defender(20);

        m.usarHabilidadeEspecial(new Personagem[]{g, a});
        a.usarHabilidadeEspecial(new Personagem[]{g});
        g.usarHabilidadeEspecial(new Personagem[]{m});

        System.out.println("\n=== STATUS FINAL ===");
        g.status();
        m.status();
        a.status();
    }
}


