import java.util.Random;

class Jogo {
    private Jogador jogador;
    private int numeroSecreto = new Random().nextInt(20) + 1;

    public Jogo(Jogador jogador) { this.jogador = jogador; }

    public String jogar(int tentativa) {
        jogador.incrementarTentativas();
        if (tentativa < numeroSecreto) return "maior";
        else if (tentativa > numeroSecreto) return "menor";
        else {
            jogador.atualizarPontuacao(100 - jogador.getTentativas() * 10);
            return "acertou";
        }
    }
}