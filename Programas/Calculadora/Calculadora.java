package Programas.Calculadora;

public class Calculadora {
    int numero1;
    int numero2;

    public Calculadora(int numero1Arg, int numero2Arg) {
        numero1 = numero1Arg;
        numero2 = numero2Arg;
    }

    public int soma() {
        return numero1 + numero2;
    }

    public int subtracao() {
        return numero1 - numero2;
    }

    public int multiplicacao() {
        return numero1 * numero2;
    }

    public int divisao() {
        return numero1 / numero2;
    }

    public void exibirResultados() {
        System.out.println("A soma de: " + numero1 + " + " + numero2 + " é igual a: " + soma());
        System.out.println("A subtração de: " + numero1 + " - " + numero2 + " é igual a: " + subtracao());
        System.out.println("A multiplicação de: " + numero1 + " * " + numero2 + " é igual a: " + multiplicacao());
        System.out.println("A divisão de: " + numero1 + " / " + numero2 + " é igual a: " + divisao());
    }

    public static void main(String args[]){

        int numero1 = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[1]);

        Calculadora calculadora = new Calculadora(numero1, numero2);

        calculadora.exibirResultados();

    }
}
