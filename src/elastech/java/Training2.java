package elastech.java;

import java.util.Scanner;

public class Training2 {

    public void verificaPeriodo(int hora) {
        if (hora >= 0 && hora <= 5) {
            System.out.println("Madrugada");
        } else if (hora > 5 && hora < 12) {
            System.out.println("Manhã");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Tarde");
        } else {
            System.out.println("Noite");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora;
        System.out.print("Digite a hora:");
        hora = teclado.nextInt();

        Training2 c = new Training2();
        c.verificaPeriodo(hora);


    }
}






