package andrePardinho.exercicios.desafioRPG;

public class Guerreiro extends Personagem implements HabilidadeEspecial {
     private int escudo;

     public Guerreiro(String nome, int vida, int forca, int escudo) {
         super(nome, vida, forca);
         this.escudo = escudo;
     }

    @Override
    public int atacar(Personagem alvo) {
        int danoTotal = forca + 5;
        System.out.println(nome + " ataca " + alvo.getNome() + "e causa " + danoTotal + " de dano!");
        return danoTotal;
    }

    @Override
    public int defender(int danoRecebido) {
        int danoEfetivo = Math.max(0, danoRecebido - escudo);
        setVida(vida - danoEfetivo);
        System.out.println(nome + " bloqueou " + escudo + " e recebeu " + danoEfetivo + " de dano!");
        return danoEfetivo;
    }

    @Override //investida
    public void usarHabilidadeEspecial() {
         forca *= 2;
         escudo = 0;
         System.out.println(nome + " usou INVESTIDA! Dano de ataque dobrado, e escudo quebrado.");
    }

}
