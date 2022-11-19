package elastech.java.exercicios.exception.dia01nov;

public class SaqueInsuficienteException extends Exception{



    public SaqueInsuficienteException() {
        super("Não foi possível fazer saque, pois seu saldo ficará negativo");

    }
}
