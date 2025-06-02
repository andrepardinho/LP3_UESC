package andrePardinho.exercicios.desafioRPG;

public class Arqueiro extends Personagem implements HabilidadeEspecial {
    private int flechas;

    public Arqueiro(String nome, int vida, int forca, int flechas) {
        super(nome, vida, forca);
        this.flechas = flechas;
    }

    @Override
    public int atacar(Personagem alvo) {
        if (flechas <= 0) {
            System.out.println(nome + " está sem flechas!");
            return 0;
        }

        flechas--;
        int danoTotal = forca + 3; // Arqueiro causa dano adicional com flechas
        System.out.println(nome + " atira uma flecha em " + alvo.getNome() + " e causa " + danoTotal + " de dano!");
        return danoTotal;
    }

    @Override
    public int defender(int danoRecebido) {
        if (flechas > 0) {
            flechas--; // Gasta uma flecha para reduzir o dano
            System.out.println(nome + " usa uma flecha para reduzir o dano recebido!");
            danoRecebido -= 2; // Reduz o dano em 2
        }
        setVida(vida - danoRecebido);
        System.out.println(nome + " recebeu " + danoRecebido + " de dano! (Flechas restantes: " + flechas + ")");
        return danoRecebido;
    }

    @Override
    public void usarHabilidadeEspecial() {
        if(flechas >= 3) {
            flechas -= 3;
            System.out.println(nome + " usou CHUVA DE FLECHAS! Gastou 3 flechas atacar todos os inimigos!");
        } else {
            System.out.println(nome + " não tem flechas suficientes para usar CHUVA DE FLECHAS!");
        }
    }
}
