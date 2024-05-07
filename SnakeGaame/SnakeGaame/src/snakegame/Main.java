package snakegame;
import java.awt.Color;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("SNAKE GAME");
        frame.setBounds(350,80,910,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();
        panel.setBackground(Color.black);
        frame.add(panel);
        
        frame.setVisible(true);

    }
}