
package elastech.java.exercicios.exception.dia01nov;

public  class Banco
{
    public static void saque(double valor, Conta c) throws SaqueInsuficienteException {

        if(valor < c.getSaldo()){
            c.setSaldo(c.getSaldo()- valor);
        }
        else{
            throw new SaqueInsuficienteException();
        }
    }

    public static void main(String[] args)  {

        Conta c = new Conta();
        c.setSaldo(100);

        Conta c2 = new Conta();
        c2.setSaldo(100);

        try{
            saque(199, c);


        }catch (SaqueInsuficienteException e){
            System.out.println("Conta c1 " + e.getMessage());
        }

        try{
            saque(999, c2);

        }catch (SaqueInsuficienteException e){
            System.out.println("Conta c2 " + e.getMessage());
        }



    }

}
