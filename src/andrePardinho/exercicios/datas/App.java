package andrePardinho.exercicios.datas;

public class App {
    public static void main(String[] args) {

        Data data1 = new Data();
        System.out.println("Data atual: " + data1.dia + "/" + data1.mes + "/" + data1.ano);

        Data data2 = new Data(19, 8, 2003);
        System.out.println("Data especifica: " + data2.dia + "/" + data2.mes + "/" + data2.ano);

        Data data3 = new Data("11/07/2001");
        System.out.println("Data String: " + data3.dia + "/" + data3.mes + "/" + data3.ano);

        //Teste data string com entrada do usuario

        System.out.println("Data 1 e Data 2 são iguais? " + Data.IsEqual(data1, data2));


    }
}
