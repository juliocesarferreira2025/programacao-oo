class Guerreiro {
    private Personagem personagem;

    public Guerreiro(String nome) {
        this.personagem = new Personagem(nome, 150, 20);
    }

    public void atacar(Personagem inimigo) {
        int dano = personagem.getAtaqueBase();
        System.out.println(personagem.getNome() + " ataca com espada causando " + dano + " de dano.");
        inimigo.setHp(inimigo.getHp() - dano);
    }

    public void defender(int danoRecebido) {
        int danoReduzido = danoRecebido / 2;
        personagem.setHp(personagem.getHp() - danoReduzido);
        System.out.println(personagem.getNome() + " defende com escudo. Dano reduzido para " + danoReduzido + ". HP atual: " + personagem.getHp());
    }

    public void usarHabilidadeEspecial(Personagem inimigo) {
        int dano = personagem.getAtaqueBase() * 2;
        System.out.println(personagem.getNome() + " usa Golpe Duplo! Causa " + dano + " de dano em " + inimigo.getNome() + ".");
        inimigo.setHp(inimigo.getHp() - dano);
    }

    public void status() {
        personagem.status();
    }

    public Personagem getPersonagem() {
        return personagem;
    }
}
