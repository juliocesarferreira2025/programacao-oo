public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 100, 25);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " lança magia causando " + ataqueBase + " de dano.");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void usarHabilidadeEspecial(Personagem[] inimigos) {
        System.out.println(nome + " lança Bola de Fogo! Dano em todos os inimigos.");
        for (Personagem inimigo : inimigos) {
            inimigo.defender(ataqueBase);
        }
    }
}


