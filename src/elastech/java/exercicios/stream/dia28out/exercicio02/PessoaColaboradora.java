package elastech.java.exercicios.stream.dia28out.exercicio02;

/*2) Crie uma classe PessoaColaboradora, que possua uma String "nome" e um parâmetro decimal (escolha o tipo),
que representa o salário. Crie uma lista com alguns PessoaColaboradoras e, através de Streams,
aplique um aumento de 15% para todas as pessoas.
 */


public class PessoaColaboradora {
    String nome;
    float salario;

    int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public PessoaColaboradora(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public PessoaColaboradora(String nome, float salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }
}
