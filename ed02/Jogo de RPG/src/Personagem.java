class Personagem {
    private String nome;
    private int hp;
    private int ataqueBase;

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

    public int getAtaqueBase() {
        return ataqueBase;
    }

    public void setHp(int novoHp) {
        this.hp = novoHp;
    }

    public void status() {
        System.out.println(nome + " - HP: " + hp + " | Ataque: " + ataqueBase);
    }
}
