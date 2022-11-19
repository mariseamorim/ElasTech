package elastech.java.exercicios.enums.dia09nov;

public  class Main {

    public static void main(String[] args) {
        for (DiasSemana p : DiasSemana.values()) {
            System.out.printf("%s%n", p);
        }

        for (Meses p : Meses.values()) {
            System.out.printf("%s%n", p);
        }

        Meses mes = Meses.valueOf("JANEIRO");

        switch (mes){
            case JANEIRO -> System.out.println(Meses.JANEIRO);
            case FEVEREIRO -> System.out.println(Meses.FEVEREIRO);
            case MARÇO -> System.out.println(Meses.MARÇO);
            case ABRIL -> System.out.println(Meses.ABRIL);
            case MAIO -> System.out.println(Meses.MAIO);
            case JUNHO -> System.out.println(Meses.JUNHO);
            case JULHO -> System.out.println(Meses.JULHO);
            case AGOSTO -> System.out.println(Meses.AGOSTO);
            case SETEMBRO -> System.out.println(Meses.SETEMBRO);
            case OUTUBRO -> System.out.println(Meses.OUTUBRO);
            case NOVEMBRO -> System.out.println(Meses.NOVEMBRO);
            case DEZEMBRO -> System.out.println(Meses.DEZEMBRO);

        }

        System.out.println(Meses.ABRIL.getOrdem());
        Meses mesTeste = Meses.MAIO;
        switch (mes){
            case JANEIRO -> {
                System.out.println(Meses.JANEIRO.getOrdem()) ;break;
            }
            case FEVEREIRO -> {
                System.out.println(Meses.FEVEREIRO.getOrdem()) ;break;
            }
            case MARÇO -> {
                System.out.println(Meses.MARÇO.getOrdem()) ;break;
            }
            case MAIO -> {
                System.out.println(Meses.MAIO.getOrdem()) ;break;
            }
            case JUNHO -> {
                System.out.println(Meses.JUNHO.getOrdem()) ;break;
            }
            case JULHO -> {
                System.out.println(Meses.JULHO.getOrdem()) ;break;
            }
            case AGOSTO -> {
                System.out.println(Meses.AGOSTO.getOrdem()) ;break;
            }
            case SETEMBRO -> {
                System.out.println(Meses.SETEMBRO.getOrdem()) ;break;
            }
            case OUTUBRO -> {
                System.out.println(Meses.OUTUBRO.getOrdem()) ;break;
            }
            case NOVEMBRO -> {
                System.out.println(Meses.NOVEMBRO.getOrdem()) ;break;
            }
            case DEZEMBRO -> {
                System.out.println(Meses.DEZEMBRO.getOrdem()) ;break;
            }
        }
    }
}
