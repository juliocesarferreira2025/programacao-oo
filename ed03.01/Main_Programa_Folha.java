public class Main_Programa_Folha {
    public static void main(String[] args)
    //static: Permite que o método seja chamado sem instanciar a classe.
    {
        Funcionario funcionario1 = new FuncionarioCLT("Carlos", 2000.0);   
                // Instanciando a classe FuncionarioCLT. Isso cria um objeto real com nome "Carlos" e salário base 2000.0.
        
        Funcionario funcionario2 = new FuncionarioTemporario("Ana", 2000.0);    
                   // *Polimorfismo* - usa a referencia da plasse Pai para apontar objeto da classe filha, muda de acordo com o real tipo do objeto.
        
        funcionario1.exibirDados();
        System.out.println("salarioFinal" + funcionario1.calcularSalario()); 
        System.out.println();
        
        // funcionario1 é do tipo Funcionario (classe pai), mas apontam para objetos de subclasses diferentes. Calcular salario

        funcionario2.exibirDados();
        System.out.println("salarioFinal" + funcionario2.calcularSalario());  
        System.out.println();
        
         // funcionario2 é do tipo Funcionario (classe pai), mas apontam para objetos de subclasses diferentes. Calcular o salario.
    }
}
