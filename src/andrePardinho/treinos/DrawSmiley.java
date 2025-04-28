package andrePardinho.treinos;

// Figura 6.11: DrawSmiley.java
// Desenhando um rosto sorridente com cores e formas preenchidas.

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {

    // Método que desenha na tela
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Chama o paintComponent da superclasse

        // Desenha o rosto (círculo amarelo)
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        // Desenha os olhos (círculos pretos)
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30); // Olho esquerdo
        g.fillOval(135, 65, 30, 30); // Olho direito

        // Desenha a boca (ovalo preto)
        g.fillOval(50, 110, 120, 60);

        // Retoca a boca para criar um sorriso (parte amarela cobrindo)
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
} // fim da classe DrawSmiley
