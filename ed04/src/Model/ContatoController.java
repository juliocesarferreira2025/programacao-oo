package Controller;

import Model.Contato;
import Model.PessoaFisica;
import Model.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;

public class ContatoController {
    private final List<Contato> contatos = new ArrayList<>();

    public void adicionar(Contato contato) {
        if (contato instanceof PessoaFisica pf) {
            for (Contato c : contatos) {
                if (c instanceof PessoaFisica && c.getCPF().equals(pf.getCPF())) {
                    System.out.println("Contato com este CPF já existe.");
                    return;
                }
            }
        } else if (contato instanceof PessoaJuridica pj) {
            for (Contato c : contatos) {
                if (c instanceof PessoaJuridica && ((PessoaJuridica) c).getCnpj().equals(pj.getCnpj())) {
                    System.out.println("Contato com este CNPJ já existe.");
                    return;
                }
            }
        }
        contatos.add(contato);
        System.out.println("\n >> Contato adicionado com sucesso <<.");
    }

    public void remover(String identificador) {
        contatos.removeIf(c -> (c instanceof PessoaFisica && ((PessoaFisica) c).getCPF().equals(identificador)) ||
                (c instanceof PessoaJuridica && ((PessoaJuridica) c).getCnpj().equals(identificador)));
    }

    public List<Contato> listar() {
        return contatos;
    }
}