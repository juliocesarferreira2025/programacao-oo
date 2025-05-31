package Model;

import Controller.ContatoController;
import View.ContatoView;

import java.util.Scanner;

public class MainProgramaAgenda {
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        ContatoView view = new ContatoView();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.exibirMenu();
            System.out.print("\n\n ESCOLHA UMA DAS OPÇÕES ACIMA: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.print("Tipo (1-Física / 2-Jurídica): ");
                    String tipo = scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    try {
                        if ("1".equals(tipo)) {
                            System.out.print("CPF (11 dígitos): ");
                            String cpf = scanner.nextLine().replaceAll("\\D", ""); // remove não dígitos
                            controller.adicionar(new PessoaFisica(nome, telefone, email, cpf));
                        } else if ("2".equals(tipo)) {
                            System.out.print("CNPJ (14 dígitos): ");
                            String cnpj = scanner.nextLine().replaceAll("\\D", "");
                            controller.adicionar(new PessoaJuridica(nome, telefone, email, cnpj));
                        } else {
                            System.out.println("Tipo inválido.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro ao adicionar: " + e.getMessage());
                    }
                }

                case "2" -> {
                    System.out.println("\n\n >>>>>> Lista de Contato <<<<<<<");
                    view.mostrarContatos(controller.listar());
                }

                case "3" -> {
                    System.out.print("\nInforme: \n1-> CPF\nou\n2-> CNPJ\nPara remover: ");
                    String id = scanner.nextLine().replaceAll("\\D", "");
                    controller.remover(id);
                    System.out.println("\n\n Remoção concluída.");
                }

                case "0" -> {
                    System.out.println("\n\nENCERRANDO O PROGRAMA...");
                    scanner.close();
                    return;
                }

                default -> System.out.println("****Opção inválida. Tente novamente***.");
            }

            System.out.println(); // espaço entre operações
        }
    }
}