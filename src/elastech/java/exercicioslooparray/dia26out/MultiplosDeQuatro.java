package elastech.java.exercicioslooparray.dia26out;

//Exercício 4 -Crie uma classe chamada MultiplosDeQuatro. Crie um método que imprima apenas os números múltiplos de 4 (aqueles que, quando divididos por 4, resultam em 0 no resto).
public class MultiplosDeQuatro {
    public static void imprimirMultiplos(){
        for (var i = 1 ; i < 100; i++){
            if(i %4 ==0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        imprimirMultiplos();
    }
}
