import java.util.Scanner;

public class Main {
    private static Placar placar = new Placar();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        Jogador jogador = new Jogador(scanner.nextLine());
        Jogo jogo = new Jogo(jogador);

        System.out.println("Adivinhe o número secreto entre 1 e 20.");
        while (true) {
            System.out.print("Tentativa: ");
            int tentativa = scanner.nextInt();
            String resultado = jogo.jogar(tentativa);
            if (resultado.equals("acertou")) {
                System.out.println("Parabéns! Você acertou o número secreto.");
                System.out.println("Tentativas: " + jogador.getTentativas());
                System.out.println("Sua pontuação foi: " + jogador.getPontuacao());
                placar.adicionarJogador(jogador);
                break;
            } else {
                System.out.println("Tente um número " + resultado + ".");
            }
        }

        placar.mostrarRanking();
        scanner.close();
    }
}