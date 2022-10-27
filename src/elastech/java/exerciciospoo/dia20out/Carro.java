package elastech.java.exerciciospoo.dia20out;

import elastech.java.fundamentosexercicios.dia14out.Training2;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Carro {
    private int numPortas;
    private int ano;

    private double preco;
    private int Km;
    private String marca;

    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getKm() {
        return Km;
    }

    public void setKm(int km) {
        Km = km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Carro() {

    }

    public Carro(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }


    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setNumPortas(4);
        carro1.setAno(2018);
        carro1.setMarca("Fiat");
        carro1.setCor("Azul");
        System.out.println("Marca: "+ carro1.getMarca() + " Número de portas:  " + carro1.getNumPortas() + " Ano: "
                + carro1.getAno() + " Cor " + carro1.getCor());

        Carro carro2 = new Carro("Fiat", "Vermelho");
        System.out.println("Marca: "+ carro2.marca + " Cor " + carro2.cor);

    }


}
