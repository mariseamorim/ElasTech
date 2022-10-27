package elastech.java.exerciciospoo.dia20out;

public class Predio {
    private  String endereco;
    private String cidade;
    private String estado;
    private int numAptos;


    private String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumAptos() {
        return numAptos;
    }

    public void setNumAptos(int numAptos) {
        if(numAptos > 0)
            this.numAptos = numAptos;
        else
            System.out.println("Número de apartamentos inválido");
    }

    public Predio(){

    }

    @Override
    public String toString() {
        return "Predio " +
                "endereco=' " + endereco + '\'' +
                ", cidade=' " + cidade + '\'' +
                ", estado=' " + estado + '\'' +
                ", numAptos= " + numAptos ;
    }

    public static void main(String[] args) {
        Predio predio1 = new Predio();
        predio1.setEndereco("Rua dois");
        predio1.setCidade("Joinville");
        predio1.setEstado("SC");
        predio1.setNumAptos(5);

        System.out.println("Endereço: " + predio1.getEndereco() + " -Cidade: " + predio1.getCidade()
                + " -Estado: " + predio1.getEstado() + " -Números de apartamentos: " +predio1.getNumAptos());

        System.out.println(predio1.toString());
    }

}
