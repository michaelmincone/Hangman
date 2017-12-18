
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dashes extends JPanel {

    JLabel label;
    String word;
    String guess = "";
    HangMan hang;

    public Dashes(String word, HangMan hang) {

        this.word = word;
        this.hang = hang;
        for (int i = 0; i < word.length(); i++) {
            guess += " ";
        }
        word = word.toUpperCase();
        Dimension dim = new Dimension(1500, 300);
        this.setPreferredSize(dim);

        this.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        drawDashes(g2d);

    }

    private void drawDashes(Graphics2D g2d) {

        for (int i = 0; i < word.length() * 50; i += 50) {
            g2d.draw(new Line2D.Double(100.0 + i, 200.0, 125.0 + i, 200.0));

            for (int j = 0; j < guess.length(); j++) {
                g2d.drawString(guess.charAt(j) + "", 108 + j * 50, 198);
            }
            // g2d.drawString("m", 108 + i, 198);
        }

    }

    public void update(String str) {
        for (int i = 0; i < word.length(); i++) {
            if (str.equals(word.charAt(i) + "")) {

                guess = guess.substring(0, i) + str + guess.substring(i + 1);

            }

        }

        CharSequence c = str;
        if (!this.word.contains(c)) {
            hang.incrementCounter();
        }

    }

}
