package elastech.java.exercicios.looparray.dia19out;

public class ExercicioLoop {

    public static void escreverTabuada(){
        for (var i = 0 ; i <= 10 ; i++){
            System.out.println("2 x " + i + " = " + 2 * i);
        }
    }
    public static void escreverTodasTabuada(){
        for(var x = 1 ; x <= 9 ; x++){
            for (var i = 0 ; i <= 10 ; i++){
                System.out.println( x +" x " + i + " = " + x * i);
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        }

    }

    public static void main(String[] args) {
        //escreverTabuada();
        escreverTodasTabuada();
    }
}
