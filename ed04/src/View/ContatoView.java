package View;

import Model.Contato;

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
        System.out.printf("%-20s %-15s %-25s\n", "Nome", "Telefone", "Email", "CPF", "CNPJ");
        for (Contato contato : contatos) {
            System.out.printf("%-20s %-15s %-25s\n", contato.getNome(), contato.getTelefone(), contato.getEmail(), contato.getCPF(), contato.getCNPJ());
        }
    }
}
