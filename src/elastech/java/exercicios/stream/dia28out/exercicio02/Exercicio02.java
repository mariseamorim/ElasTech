package elastech.java.exercicios.stream.dia28out.exercicio02;

import java.util.ArrayList;
import java.util.stream.Collectors;

/*2) Crie uma classe PessoaColaboradora, que possua uma String "nome" e um parâmetro decimal (escolha o tipo),
que representa o salário. Crie uma lista com alguns PessoaColaboradoras e, através de Streams,
aplique um aumento de 15% para todas as pessoas.
 */

/*3) Altere a classe PessoaColaboradora, incluindo um novo valor de idade.
Crie uma lista com alguns PessoaColaboradoras e, através de Streams,
aplique um aumento de 20% para todas as pessoas colaboradoras que tem mais de 30 anos.*/
public class Exercicio02 {
    public static void main(String[] args) {
        ArrayList<PessoaColaboradora> colaborador = new ArrayList<PessoaColaboradora>();
        colaborador.add(new PessoaColaboradora("Maria", 5000));
        colaborador.add(new PessoaColaboradora("João", 1500));
        colaborador.add(new PessoaColaboradora("Larissa", 2000));
        colaborador.add(new PessoaColaboradora("Antonio", 3000));
        colaborador.add(new PessoaColaboradora("Leonel", 4000));

        ArrayList<PessoaColaboradora> lista = (ArrayList) colaborador.stream().map(c ->{
            c.setSalario((float) (c.getSalario() + (c.getSalario() * 0.15)));
            return c;

        }).collect((Collectors.toList()));

        lista.forEach(c-> System.out.println(c.getNome() + " " + c.getSalario()));

        System.out.println("*****************************************");

        ArrayList<PessoaColaboradora> listaPessoa = new ArrayList<PessoaColaboradora>();
        listaPessoa.add(new PessoaColaboradora("Maria", 5000, 25));
        listaPessoa.add(new PessoaColaboradora("João", 1500, 18));
        listaPessoa.add(new PessoaColaboradora("Larissa", 2000, 33));
        listaPessoa.add(new PessoaColaboradora("Antonio", 3000, 20));
        listaPessoa.add(new PessoaColaboradora("Leonel", 4000, 35));


        ArrayList<PessoaColaboradora> listaPessoaAumento = (ArrayList) listaPessoa.stream()
                .filter(i -> i.getIdade() > 30).map(m -> {
                    m.setSalario((float) (m.getSalario() + (m.getSalario() * 0.2)));
                    return m;
                }).collect(Collectors.toList());

        listaPessoaAumento.forEach(p -> System.out.println(p.getNome() +" - " + p.getSalario()));

    }
}
