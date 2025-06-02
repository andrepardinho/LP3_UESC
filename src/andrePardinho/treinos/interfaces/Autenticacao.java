package andrePardinho.treinos.interfaces;

interface Autenticacao {
    public boolean autenticar(String senha);
}

interface CRAA {
    public double CalcularCRAA();
}

abstract class Usuario {
    protected String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    protected boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }
}

class Professor extends Usuario implements Autenticacao {

    public Professor(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public boolean autenticar(String senha){
        return verificarSenha(senha);
    }
}

class Aluno extends Usuario implements CRAA, Autenticacao {
    public String matricula;

    public Aluno(String nome, String matricula, String senha) {
        super(nome, senha);
        this.matricula = matricula;

    }

    @Override
    public boolean autenticar(String senha) {
        return verificarSenha(senha);
    }

    @Override
    public double CalcularCRAA() {
        // Implementação fictícia para o cálculo do CRAA
        return 0.0; // Exemplo de retorno
    }
}

class APP {
    public static void main(String[] args){
        Professor Helder = new Professor("Hélder", "senha123");
        Aluno Andre = new Aluno("André", "123456", "senha456");

        if(Helder.autenticar("senha123")) {
            System.out.println("Professor autenticado com sucesso!");
        } else {
            System.out.println("Falha na autenticação do professor.");
        }

        if(Andre.autenticar("senha45")) {
            System.out.println("Aluno autenticado com sucesso!");
        } else {
            System.out.println("Falha na autenticação do aluno.");
        }

        System.out.println("Professor: " + Helder.nome);
        System.out.println("Aluno: " + Andre.nome + " - Matrícula: " + Andre.matricula);

    }
}

