package elastech.java.exercicios.stream.dia28out.exercicio01;

import java.util.ArrayList;

public class Exercicio01 {
    public static void main(String[] args) {

        ArrayList<Cidade> lista = new ArrayList<Cidade>();
        lista.add(new Cidade(500000, "Joinville"));
        lista.add(new Cidade(150000, "Floripa"));
        lista.add(new Cidade(80000, "Rio Negrinho"));
        lista.add(new Cidade(90000, "São Bento"));

        lista.stream().filter((c -> c.qtdeHabitantes < 100000)).forEach(c-> System.out.println(c.getNome()));

        for (Cidade cidade : lista){
            if(cidade.getQtdeHabitantes() > 100000)
                System.out.println(cidade.getNome());
        }

    }
}
