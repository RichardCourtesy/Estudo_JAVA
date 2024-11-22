package Programas.Aluno;
//variaveis locais precisão ter seu valor nulo escrito no código caso não o valor no terminal resulta em "idade + 7"
public class Aluno {

    public void Idade() {
        int idade = 0;
        idade = idade + 18;
        System.out.println("Sua idade é: " + idade);
    }

    public static void main(String args[]) {
        Aluno aluno1 = new Aluno();

        aluno1.Idade();
    }
}
