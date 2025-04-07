package andrePardinho.listas.cap3;

public class DateTest {

    public static void main(String[] args) {

        // Testando com data válida
        Date data1 = new Date(7, 4, 2025);
        System.out.println("Data 1: " + data1);

        // Testando com data inválida
        Date data2 = new Date(13, 30, 2024);
        System.out.println("Data 2: " + data2);

        // Testando setters
        data2.setDate(2, 29, 2023); // ano não bissexto com 29 dias
        System.out.println("Data 2: " + data2);

        data2.setDate(2, 29, 2024); // agora sim é bissexto
        System.out.println("Data 2 corrigida: " + data2); // deve imprimir 29/02/2024


    }
}
