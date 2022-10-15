package elastech.java.exercicios.dia14out;

import java.util.Scanner;

public class Training4 {

    public int salario;

    public void informeValorDoImposto() {
        System.out.println((salario > 5000) ? 15 : 5);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int salario;
        System.out.print("Digite o valor do Salario Minimo:");
        salario = teclado.nextInt();

        Training4 valor = new Training4();
        valor.salario = salario;
        valor.informeValorDoImposto();

    }
}






