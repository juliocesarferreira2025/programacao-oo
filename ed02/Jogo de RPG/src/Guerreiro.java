public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 150, 20);
    }


    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca com espada causando " + ataqueBase + " de dano.");
        inimigo.defender(ataqueBase);
    }


    public void defender(int dano) {
        int reduzido = dano / 2;
        hp -= reduzido;
        System.out.println(nome + " defende com escudo. Dano reduzido para " + reduzido + ". HP atual: " + hp);
    }


    public void usarHabilidadeEspecial(Personagem[] inimigos) {
        int dano = ataqueBase * 2;
        System.out.println(nome + " usa Golpe Duplo! Causa " + dano + " de dano em um inimigo.");
        if (inimigos.length > 0) {
            inimigos[0].defender(dano);
        }
    }
}
