package View;

import Model.Contato;
import Model.PessoaJuridica;
import Model.PessoaFisica;

import java.util.List;

public class ContatoView {
    public void exibirMenu() {
        System.out.println("Agenda de Contatos:");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Listar Contatos");
        System.out.println("3. Remover Contato");
        System.out.println("0. Sair");
    }

    public void mostrarContatos(List<Contato> contatos) {
        System.out.println("\n ++++++++++++++++++++++       LISTA DE CONTATOS       +++++++++++++++++++++++++");
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            System.out.printf("%-25s %-20s %-30s %-20s\n", "Nome", "Telefone", "Email", "CPF/CNPJ");
            System.out.println("|-----------------|-------------------|-----------------------|-------------------------------|");

            for (Contato contato : contatos) {
                String id = "";
                if (contato instanceof PessoaFisica pf) {
                    id = pf.getCPF();
                } else if (contato instanceof PessoaJuridica pj) {
                    id = pj.getCnpj();
                }

                System.out.printf("%-25s %-20s %-30s %-20s\n", contato.getNome(), contato.getTelefone(), contato.getEmail(), id);
            }
        }
        System.out.println("|================== | =================== | =================| ===============================|\n");
    }
}