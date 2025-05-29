package Model;

public class PessoaFisica extends ContatoBase {
    private String CPF;

    public PessoaFisica(String nome, String telefone, String email, String CPF) {
        super(nome, telefone, email);
        setCpf(CPF);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCpf(String cpf) {
        if (CPF != null && CPF.matches("\\d{11}")) {
            this.CPF = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos numéricos.");
        }
    }
}