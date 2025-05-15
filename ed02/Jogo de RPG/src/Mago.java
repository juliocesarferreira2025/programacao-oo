class Mago {
    private Personagem personagem;

    public Mago(String nome) {
        this.personagem = new Personagem(nome, 100, 25);
    }

    public void atacar(Personagem inimigo) {
        int dano = personagem.getAtaqueBase();
        System.out.println(personagem.getNome() + " lança magia causando " + dano + " de dano.");
        inimigo.setHp(inimigo.getHp() - dano);
    }

    public void defender(int danoRecebido) {
        personagem.setHp(personagem.getHp() - danoRecebido);
        System.out.println(personagem.getNome() + " sofre " + danoRecebido + " de dano. HP atual: " + personagem.getHp());
    }

    public void usarHabilidadeEspecial(Personagem[] inimigos) {
        int dano = personagem.getAtaqueBase();
        System.out.println(personagem.getNome() + " lança Bola de Fogo! Causa " + dano + " de dano em todos os inimigos.");
        for (Personagem inimigo : inimigos) {
            inimigo.setHp(inimigo.getHp() - dano);
        }
    }

    public void status() {
        personagem.status();
    }

    public Personagem getPersonagem() {
        return personagem;
    }
}


