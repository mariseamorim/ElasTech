package elastech.java;

import java.util.Scanner;

public class Training1 {

    public void informeValorDoImposto(int salario) {
        if (salario > 5000) {
            System.out.println("15");
        } else {
            System.out.println("5");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int salario;
        System.out.print("Digite o valor do Salario Minimo:");
        salario = teclado.nextInt();

        Training1 c = new Training1();
        c.informeValorDoImposto(salario);


    }
}






