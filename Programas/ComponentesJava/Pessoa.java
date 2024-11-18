package Programas.ComponentesJava;

public class Pessoa {
    // Nome e Idade são variáveis de instância (estado do futuro objeto)
    String nome;
    int idade;

    // Método (comportamento ao criar um novo objeto)
    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método (comportamento) para exibir as informações das pessoas/objetos da class Pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + "\n" );
    }

    public static void main(String args[]) {
        // class -> nome da class -> valor das variaveis de instancia
        Pessoa pessoa0 = new Pessoa("Maria", 20);
        Pessoa pessoa1 = new Pessoa("Henrique", 27);
        Pessoa pessoa2 = new Pessoa("Richard", 18);

        pessoa0.exibirInformacoes();
        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();
    }
}