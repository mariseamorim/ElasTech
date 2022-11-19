package elastech.java.exercicios.estrurarepeticao.dia18out;

public class ListaImpares {
    public void listar(){
        int contador = 1;
        while(contador <= 100){
            if(contador %2 == 1  ){
                System.out.println(contador);
            }
            contador++;
        }
    }
    public static void main(String[] args) {
        var c = new ListaImpares();
        c.listar();

    }
}
