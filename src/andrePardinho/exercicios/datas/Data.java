package andrePardinho.exercicios.datas;
import java.time.LocalDate;

public class Data {
    int dia;
    int mes;
    int ano;

    //Construtor p/ data atual do SO
    public Data() {
        LocalDate dataAtual = LocalDate.now();
        this.dia = dataAtual.getDayOfMonth();
        this.mes = dataAtual.getMonthValue();
        this.ano = dataAtual.getYear();
    }

    // Construtor p/ data de acordo com os parâmetros
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Construtor p/ data de acordo com a String
    public Data(String data) {
        String[] partes = data.split("/"); //

        if (partes.length == 3) {
            this.dia = Integer.parseInt(partes[0]);
            this.mes = Integer.parseInt(partes[1]);
            this.ano = Integer.parseInt(partes[2]);
        } else {
            System.out.println("Data inválida");
        }

    }


    private boolean DataValida(Data data) {
        if (data.mes < 1 || data.mes > 12 || data.dia < 1) {
            return false;
        }

        int[] diasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (anoBissexto(data.ano)) {
            diasNoMes[1] = 29; // Fevereiro em ano bissexto
        }

        return data.dia <= diasNoMes[data.mes - 1];

    }

    private static boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }


    public static boolean IsEqual(Data data1, Data data2) {
        return(data1.dia == data2.dia && data1.mes == data2.mes && data1.ano == data2.ano);
    }


}
