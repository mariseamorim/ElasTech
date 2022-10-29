package elastech.java.exercicios.stream.dia28out.exercicio01;

public class Cidade {
    public int getQtdeHabitantes() {
        return qtdeHabitantes;
    }

    public void setQtdeHabitantes(int qtdeHabitantes) {
        this.qtdeHabitantes = qtdeHabitantes;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    int qtdeHabitantes;
    String Nome;

    public Cidade(int qtdeHabitantes, String nome) {
        this.qtdeHabitantes = qtdeHabitantes;
        Nome = nome;
    }
}
