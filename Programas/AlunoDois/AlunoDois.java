package Programas.AlunoDois;

public class AlunoDois {
    public static int quantidade;

    public static final String CURSO = "JAVA";

    public AlunoDois() {
        quantidade = quantidade + 1;
    }

    public static void main(String args[]) {
        AlunoDois aluno = new AlunoDois();
        AlunoDois aluno2 = new AlunoDois();
        AlunoDois aluno3 = new AlunoDois();

        System.out.println("Quantidade de Alunos: " + AlunoDois.quantidade);
    }
}
