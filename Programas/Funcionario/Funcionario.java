package Programas.Funcionario;

public class Funcionario {
    // Esta variável de instância é visível para qualquer classe filha..
    public String nome;
    // Variável de salário é visível apenas na classe Funcionario.
    private double salario;

    // A variável "nome" é atribuída no construtor.
public Funcionario (String funcionarioNome) {
nome = funcionarioNome;
}

    // A variável de salário é atribuída a um valor.
    public void setSalario(double funcionarioSalario) {
        salario = funcionarioSalario;
    }

    // Este método imprime os detalhes do funcionário.
    public void printFuncionario() {
        System.out.println("nome: " + nome);
        System.out.println("salario:" + salario);
    }

    public static void main(String args[]) {
        Funcionario funcioarioUm = new Funcionario("Richard");
        funcioarioUm.setSalario(4444);
        funcioarioUm.printFuncionario();
    }
}
