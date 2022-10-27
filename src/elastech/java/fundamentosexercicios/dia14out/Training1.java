package elastech.java.fundamentosexercicios.dia14out;

import java.util.Scanner;

public class Training1 {
    //Atributo
    public int salario;

    //Métodos
    public int informeValorDoImposto() {
        if (salario > 5000) {
            return 15;
        } else {
            return 5;
        }
    }

    public static String informeValorDoImpostoStatic(int salario) {
        if (salario > 5000) {
            return "15";
        } else {
            return "5";
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int salario;
        System.out.println("Digite o valor do Salario Minimo:");
        salario = teclado.nextInt();

        Training1 valor = new Training1();
        valor.salario = salario;
        System.out.println(valor.informeValorDoImposto());

        //utilizando método static não sendo necessário estanciar o objeto
        String temp = informeValorDoImpostoStatic(2000);
        System.out.println(temp);

        teclado.close();

    }
}






