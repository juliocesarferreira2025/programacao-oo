public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public  void exibirDados(){    //método
        System.out.println("Nome: "+ nome);   //atributo
        System.out.println("Salário Base: " + salarioBase);   //atributo
    }
    public abstract double calcularSalario();
}
