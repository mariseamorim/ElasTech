package elastech.java.exercicios.looparray.dia19out;

import java.util.Arrays;


public class ExercicioArray {
    //Exercicio 01
    public static void listaNomesCidade(String[] cidades){
        for(var i = 0 ; i < cidades.length ; i++){
            System.out.println(cidades[i]);
        }
    }
    //Exercicio 02
    public static void somaValoresArray(int[] numeros){
        int soma = 0;
        for(var i = 0 ; i < numeros.length ; i++){
             soma += numeros[i];

        }
        System.out.println(soma);
    }

    //Exercicio 03
    public static void listaMenorValor(int[] numeros){

        int menor = numeros[0];

        for (var i = 0;  i < numeros.length ; i++) {
            if(menor > numeros[i]){
                menor = numeros[i];
            }
        }
        System.out.println("O menor valor é " + menor);
    }


    public static void main(String[] args) {
        String[] cidade = {"Joinville", "São Paulo","Belo Horizonte"};
        listaNomesCidade(cidade);

        int[] numeros = {5, 5, 5, 5, 5};
        somaValoresArray(numeros);

        int vetor[] = {5, 3, 1,0, 11, 18, 10};
        listaMenorValor(vetor);

    }
}
