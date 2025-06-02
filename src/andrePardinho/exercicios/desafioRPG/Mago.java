package andrePardinho.exercicios.desafioRPG;

public class Mago extends Personagem implements HabilidadeEspecial {
    private int mana;

    public Mago(String nome, int vida, int forca, int mana) {
        super(nome, vida, forca);
        this.mana = mana;
    }

    @Override
    public int atacar(Personagem alvo) {
        if(mana < 10) {
            System.out.println(nome + " não tem mana suficiente para atacar!");
            return 0;
        }

        mana -= 10;
        int danoTotal = forca * 2; // Mago causa mais dano
        System.out.println(nome + " lança um feitiço em " + alvo.getNome() + " e causa " + danoTotal + " de dano!");
        return danoTotal;
    }

    @Override
    public int defender(int danoRecebido) {
        setVida(vida - danoRecebido);
        mana += 5; // Mago recupera mana ao receber dano
        System.out.println(nome + " recebeu " + danoRecebido + " de dano e recuperou 5 de mana! (Mana: " + mana + ")");
        return danoRecebido;
    }

    @Override
    public void usarHabilidadeEspecial() {
        mana += 20;
        System.out.println(nome + " usou TELEPORTE! +20 de mana!");
    }
}