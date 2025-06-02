package andrePardinho.exercicios.desafioRPG;

public class Main {
    public static void main(String[] args){
        Personagem guerreiro = new Guerreiro("Guerreiro", 100, 20, 10);
        Personagem arqueiro = new Arqueiro("Arqueiro", 80, 15, 5);
        Personagem mago = new Mago("Mago", 60, 10, 30);

        // Exibir status inicial
        guerreiro.mostrarStatus();
        arqueiro.mostrarStatus();
        mago.mostrarStatus();

        // Simular ataques e defesas
        int danoRecebido = arqueiro.atacar(guerreiro);
        guerreiro.defender(danoRecebido);

        danoRecebido = mago.atacar(arqueiro);
        arqueiro.defender(danoRecebido);

        // Usar habilidades especiais
        if (guerreiro instanceof HabilidadeEspecial) {
            ((HabilidadeEspecial) guerreiro).usarHabilidadeEspecial();
        }
        if (arqueiro instanceof HabilidadeEspecial) {
            ((HabilidadeEspecial) arqueiro).usarHabilidadeEspecial();
        }
        if (mago instanceof HabilidadeEspecial) {
            ((HabilidadeEspecial) mago).usarHabilidadeEspecial();
        }

        // Exibir status final
        guerreiro.mostrarStatus();
        arqueiro.mostrarStatus();
        mago.mostrarStatus();
    }
}
