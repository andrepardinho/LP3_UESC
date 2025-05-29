package andrePardinho.treinos;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }
}

class Gerente extends Funcionario {
    double bonusGerencial;

    public Gerente(String nome, double salarioBase, double bonusGerencial) {
        super(nome, salarioBase);
        this.bonusGerencial = bonusGerencial;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Bônus Gerencial: " + bonusGerencial);
    }
}


class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 3000);
        funcionario.exibirDados();

        Gerente gerente = new Gerente("Maria", 5000, 1000);
        gerente.exibirDados();
    }
}
