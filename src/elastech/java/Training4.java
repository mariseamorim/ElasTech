package elastech.java;

import java.util.Scanner;

public class Training4 {

    public void informeValorDoImposto(int salario) {

        System.out.println((salario > 5000) ? "15" : "5");

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int salario;
        System.out.print("Digite o valor do Salario Minimo:");
        salario = teclado.nextInt();

        Training4 c = new Training4();
        c.informeValorDoImposto(salario);


    }
}






