package andrePardinho.exercicios.desafio_28_03;

public class ContaBancaria {
    private String titular;
    private double saldo;

    //construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void ExibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    public void Depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Valor de R$ " + valor + " depositado com sucesso");
        } else {
            System.out.println("O valor do deposito precisa ser maior que 0");
        }
    }

    public void Sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Valor de R$ " + valor + " sacado com sucesso");
        } else if (valor <= 0) {
            System.out.println("Valor de saque precisa ser maior que 0");
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
    }

    public void TransferirValor(ContaBancaria destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Valor de R$ " + valor + " transferido com sucesso");
        } else if (valor <= 0) {
            System.out.println("Valor da transf precisa ser maior que 0");
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
    }
}
