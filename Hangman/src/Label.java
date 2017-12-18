
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Label extends JPanel {

    public String word;
    public int length;

    public Label(int length, String word) {

        //Border border = BorderFactory.createLineBorder(Color.BLACK);
        this.length = length;
        this.word = word;
        

       

    }

    public void printLabel(String str) {

       
            this.add(new JLabel(str));
            //setBorder(border);
            this.setVisible(true);
    }

}
