package elastech.java.exercicios.fundamentos.dia14out;

import java.util.Scanner;

public class Training3 {

    //atributo
    public int mes;
    //metodo
    public void escreverMesExtenso() {
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
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
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

        Training3 periodo = new Training3();
        periodo.mes = mes;
        periodo.escreverMesExtenso();

        teclado.close();
    }
}






