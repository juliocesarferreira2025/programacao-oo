public class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int novoHp) {
        this.hp = novoHp;
    }

    public int getAtaqueBase() {
        return ataqueBase;
    }

    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca causando " + ataqueBase + " de dano.");
        inimigo.defender(ataqueBase);
    }

    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " sofreu " + dano + " de dano. HP atual: " + hp);
    }

    public void usarHabilidadeEspecial(Personagem[] inimigos) {
        System.out.println(nome + " usa uma habilidade genérica.");
    }

    public void status() {
        System.out.println(nome + " - HP: " + hp + " | Ataque: " + ataqueBase);
    }
}
