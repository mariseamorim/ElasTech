package elastech.java.exercicios.dia14out;

import java.util.Scanner;

public class Training1 {
    //Atributo
    public int salario;

    //Método
    public int informeValorDoImposto() {
        if (salario > 5000) {
            return 15;
        } else {
            return 5;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int salario;
        System.out.print("Digite o valor do Salario Minimo:");
        salario = teclado.nextInt();

        Training1 valor = new Training1();
        valor.salario = salario;
        System.out.print(valor.informeValorDoImposto());

    }
}






