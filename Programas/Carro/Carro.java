package Programas.Carro;

public class Carro {
    String modelo;
    String cor;
    int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano + "\n");
    }

    public static void main(String args[]) {
        Carro Carro1 = new Carro("Ronaldo Vergulinni", "Preto", 1666);
        Carro Carro2 = new Carro("Toyota", "Red", 9999);
        Carro Carro3 = new Carro("Reginaldo Mc'queen", "Green", 1666);

        Carro1.exibirInformacoes();
        Carro2.exibirInformacoes();
        Carro3.exibirInformacoes();
    }
}
