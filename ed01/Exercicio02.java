import java.util.ArrayList;

class Placar {
    private ArrayList<Jogador> ranking = new ArrayList<>();

    public void adicionarJogador(Jogador j) { ranking.add(j); }
    public void mostrarRanking() {
        ranking.sort((j1, j2) -> Integer.compare(j2.getPontuacao(), j1.getPontuacao()));
        for (Jogador jogador : ranking) {
            System.out.println(jogador.getNome() + " - Pontuação: " + jogador.getPontuacao());
        }
    }
}