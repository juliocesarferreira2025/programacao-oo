public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return  salarioBase + 300.0;
    }
}
