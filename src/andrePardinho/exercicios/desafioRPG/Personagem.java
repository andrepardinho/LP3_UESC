package andrePardinho.exercicios.desafioRPG;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int forca;

    public Personagem(String nome, int vida, int forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public int getForca() { return forca; }

    public void setVida(int vida) {
        this.vida = Math.max(vida, 0); // Garante que a vida não fique negativa
    }

    public abstract int atacar(Personagem Alvo);
    public abstract int defender(int danoRecebido);

    public void mostrarStatus() {
        System.out.println(nome + " [Vida: " + vida + " | Força: " + forca  + "]");
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
