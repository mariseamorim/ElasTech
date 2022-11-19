package elastech.java.exercicios.estrurarepeticao.dia18out;

public class ListaPares {
    public void listar(){
        int contador = 1;
        while(contador <= 100){
            if(contador %2 == 2  ){
                System.out.println(contador);
            }
            contador++;
        }
    }
    public static void main(String[] args) {
        var c = new ListaPares();
        c.listar();


    }
}
