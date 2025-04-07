package andrePardinho.treinos;
import javax.swing.JOptionPane;


public class Dialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual o seu nome?");

        String age = JOptionPane.showInputDialog("Qual a sua idade?");
        int ageInt = Integer.parseInt(age);

        String message = "Olá " + name + ", você tem " + ageInt + " anos.";

        JOptionPane.showMessageDialog(null, message);
    }
}