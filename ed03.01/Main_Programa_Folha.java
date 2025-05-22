public class Main_Programa_Folha {
    public static void main(String[] args){
        Funcionario funcionario1 = new FuncionarioCLT("Carlos", 2000.0);
        Funcionario funcionario2 = new FuncionarioTemporario("Ana", 2000.0);

        funcionario1.exibirDados();
        System.out.println("salarioFinal" + funcionario1.calcularSalario());
        System.out.println();

        funcionario2.exibirDados();
        System.out.println("salarioFinal" + funcionario2.calcularSalario());
        System.out.println();
    }
}