package elastech.java.exercicios.looparray.dia26out;

public class Impressao {

    //Exercicio 01 -Crie uma classe chamada Impressao.
    //    Crie um método que imprima (utilize System.out.println) os números de 1 a 10
    //    usando o loop for.
    public static void imprimirFoor(){
        for (var i =1 ; i <= 10; i++){
            System.out.println(i);
        }
    }
    //Exercício 2- crie um método que imprima (utilize System.out.println)
    // os números de 1 a 10 usando o loop while.
    public static void imprimir(){
        int cont = 1;
        while (cont <= 10){
            System.out.println(cont);
            cont++;
        }
    }

    //Exercício 3 - crie um método que construa uma array de 5 espaços. Cada espaço deverá ter um número inteiro.
    // Dentro desse método, percorra o array imprimindo (utilize System.out.println)
    // todos os números usando o loop for-each.
    public static void imprimirForeach(){
        int[] vetor = {3,4,5,6,7};
        for (int count: vetor) {
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        imprimir();
        imprimirFoor();
        imprimirForeach();
    }
}
