package Programas.Profissao;

public class Profissao {
    private String nome;
    private byte anosExperiencia;
    private int salario;
    private String descricao;

    public Profissao(String nome, byte anosExperiencia, int salario, String descricao) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.salario = salario;
        this.descricao = descricao;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Anos de Experiência: " + anosExperiencia);
        System.out.println("Salario: " + salario + " Reais");
        System.out.println("Descrição: \n" + descricao + "\n");
    }

    public static void main(String args[]) {
        Profissao profissao1 = new Profissao("RD", (byte) 69, 10, "Faço todo o trabalho da empresa e ainda sou criticado");

        profissao1.exibirInformacoes();
    }
}
