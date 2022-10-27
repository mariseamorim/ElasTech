package elastech.java.estrurarepeticao.dia18out;

import elastech.java.fundamentosexercicios.dia14out.Training4;

import java.util.Scanner;

public class Curso {

    //método
    public void escreverNome() {
        int contador = 1;
        while(contador <= 5){
            System.out.println("Elas Tech");
            contador++;
        };

    }


    public static void main(String[] args) {
        var c = new Curso();
        c.escreverNome();

    }
}
