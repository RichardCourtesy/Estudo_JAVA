package Programas.Casa;

public class Casa {
    private String endereco;
    private int numeroDeQuartos;
    private int numeroDeBanheiros;

public Casa(String endereco, int numeroDeQuartos, int numeroDeBanheiros) {
        this.endereco = endereco;
        this.numeroDeQuartos = numeroDeQuartos;
        this.numeroDeBanheiros = numeroDeBanheiros;
    }

public void exibirInformacoes(){
    System.out.println("endereço: " + endereco);
    System.out.println("Numero de quartos: " + numeroDeQuartos);
    System.out.println("Numero de banheiros: " + numeroDeBanheiros);
}

public static void main(String args[]) {
    Casa casa1 = new Casa("Rua Oliveira Pinto", 4, 44);

    casa1.exibirInformacoes();
}

}