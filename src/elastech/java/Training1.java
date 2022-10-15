package elastech.java;

import java.util.Scanner;

public class Training1 {
    //Atributo
    public int salario;

    //Método
    public void informeValorDoImposto() {
        if (salario > 5000) {
            System.out.println(15);
        } else {
            System.out.println(5);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int salario;
        System.out.print("Digite o valor do Salario Minimo:");
        salario = teclado.nextInt();

        Training1 valor = new Training1();
        valor.salario = salario;
        valor.informeValorDoImposto();


    }
}






