package andrePardinho.treinos.classesAbstratas;

public abstract class Pagamento {
    protected double valor;
    public abstract void processar();
}

class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    @Override
    public void processar() {
        System.out.println("Processando pagamento de " + valor + " via cartão: " + numeroCartao);
    }
}

class PagamentoBoleto extends Pagamento {
    private String codigoBarras;

    @Override
    public void processar() {
        System.out.println("Processando pagamento de " + valor + " via boleto: " + codigoBarras);
    }
}

class PagamentoPix extends Pagamento {
    private String chavePix;
    @Override
    public void processar() {
        System.out.println("Processando pagamento de " + valor + " via Pix: " + chavePix);
    }
}


class App {
    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoCartao();
        pagamento.valor = 160.0;
        pagamento.processar();

        pagamento = new PagamentoBoleto();
        pagamento.valor = 200.0;
        pagamento.processar();

        pagamento = new PagamentoPix();
        pagamento.valor = 300.0;
        pagamento.processar();
    }
}

