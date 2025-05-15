import java.util.Random;

class Arqueiro {
    private Personagem personagem;
    private Random rand = new Random();

    public Arqueiro(String nome) {
        this.personagem = new Personagem(nome, 120, 18);
    }

    public void atacar(Personagem inimigo) {
        int dano = personagem.getAtaqueBase();
        boolean critico = rand.nextInt(100) < 20; // 20% de chance de crítico
        if (critico) {
            dano *= 2;
            System.out.println(personagem.getNome() + " acerta um CRÍTICO com flecha! Dano dobrado: " + dano);
        } else {
            System.out.println(personagem.getNome() + " ataca com flecha causando " + dano + " de dano.");
        }
        inimigo.setHp(inimigo.getHp() - dano);
    }

    public void defender(int danoRecebido) {
        personagem.setHp(personagem.getHp() - danoRecebido);
        System.out.println(personagem.getNome() + " sofre " + danoRecebido + " de dano. HP atual: " + personagem.getHp());
    }

    public void usarHabilidadeEspecial(Personagem inimigo) {
        int totalDano = 0;
        int base = personagem.getAtaqueBase();
        System.out.println(personagem.getNome() + " usa Chuva de Flechas! Ataca 3 vezes.");
        for (int i = 1; i <= 3; i++) {
            int dano = base;
            System.out.println("→ Ataque " + i + ": causa " + dano + " de dano.");
            inimigo.setHp(inimigo.getHp() - dano);
            totalDano += dano;
        }
        System.out.println("Dano total causado: " + totalDano);
    }

    public void status() {
        personagem.status();
    }

    public Personagem getPersonagem() {
        return personagem;
    }
}
