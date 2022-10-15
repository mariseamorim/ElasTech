package elastech.java;

import java.util.Scanner;

public class Training3 {

    public void escreverMesExtenso(int mes) {
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes;
        System.out.print("Informe o mes:");
        mes = teclado.nextInt();

        Training3 c = new Training3();
        c.escreverMesExtenso(mes);


    }
}






