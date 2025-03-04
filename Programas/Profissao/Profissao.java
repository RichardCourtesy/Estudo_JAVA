package Programas.Profissao;

public class Profissao {
    private String nome;
    private byte anosExperiencia;
    private int salario;
    private String descricao;
    public static int quantidade; // Variável estática para contar objetos

    // Construtor que aceita os parâmetros necessários
    public Profissao(String nome, byte anosExperiencia, int salario, String descricao) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.salario = salario;
        this.descricao = descricao;
        quantidade++; // Incrementa a variável estática
    }

    // Método para exibir as informações do objeto
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Anos de Experiência: " + anosExperiencia);
        System.out.println("Salário: " + salario + " Reais");
        System.out.println("Descrição: \n" + descricao + "\n");
    }

    public static void main(String args[]) {
        // Criando objetos da classe Profissao
        Profissao profissao1 = new Profissao("RD", (byte) 10, 5000, "Faço todo o trabalho da empresa e ainda sou criticado");
        Profissao profissao2 = new Profissao("Gerente", (byte) 15, 7000, "Supervisiona as operações");
        Profissao profissao3 = new Profissao("Engenheiro", (byte) 5, 4000, "Desenvolve projetos inovadores");
        Profissao profissao4 = new Profissao("Analista", (byte) 3, 3500, "Realiza análises e relatórios");

        // Exibindo as informações dos objetos
        profissao1.exibirInformacoes();
        profissao2.exibirInformacoes();
        profissao3.exibirInformacoes();
        profissao4.exibirInformacoes();

        // Exibindo a quantidade de objetos criados
        System.out.println("Quantidade de Funcionários: " + Profissao.quantidade);
    }
}
