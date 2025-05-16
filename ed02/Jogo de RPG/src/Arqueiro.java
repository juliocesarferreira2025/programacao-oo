import java.util.Random;

public class Arqueiro extends Personagem {
    private Random rand = new Random();

    public Arqueiro(String nome) {
        super(nome, 120, 18);
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = ataqueBase;
        boolean critico = rand.nextInt(100) < 20;
        if (critico) {
            dano *= 2;
            System.out.println(nome + " acerta um CRÍTICO! Dano: " + dano);
        } else {
            System.out.println(nome + " dispara flecha causando " + dano + " de dano.");
        }
        inimigo.defender(dano);
    }

    @Override
    public void usarHabilidadeEspecial(Personagem[] inimigos) {
        System.out.println(nome + " usa Chuva de Flechas! 3 ataques consecutivos no primeiro inimigo.");
        if (inimigos.length > 0) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("→ Ataque " + i + ": " + ataqueBase + " de dano.");
                inimigos[0].defender(ataqueBase);
            }
        }
    }
}
