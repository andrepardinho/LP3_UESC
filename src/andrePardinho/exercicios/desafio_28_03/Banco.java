package andrePardinho.exercicios.desafio_28_03;

public class Banco {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("André Pardinho", 1000.00);

        conta1.ExibirInformacoes();

        /*conta1.Depositar(200.00);
        conta1.ExibirInformacoes();

        conta1.Sacar(300.00);
        conta1.ExibirInformacoes();

        conta1.Sacar(1000.00);*/

        ContaBancaria conta2 = new ContaBancaria("Maria", 550.00);
        conta2.ExibirInformacoes();

        conta1.TransferirValor(conta2, 250.00);
        conta1.ExibirInformacoes();
        conta2.ExibirInformacoes();
    }

}
