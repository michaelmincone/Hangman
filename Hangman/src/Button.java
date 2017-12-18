
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Button extends JPanel {

    JButton[] grid = new JButton[26];

    Dashes dash;
   

    public Button(String str, Dashes dash) {

        this.dash = dash;
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Dimension dim = new Dimension(360, 360);
        this.setPreferredSize(dim);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String action = e.getActionCommand();

                
                dash.update(action);
                dash.repaint();
                /*
                        add(new JLabel(action + ""));
                        setVisible(true);
                 */

            }
        };

        for (int i = 0; i < grid.length; i++) {
            grid[i] = (JButton) this.add(new JButton(alphabet.charAt(i) + ""));
            grid[i].addActionListener(listener);
            this.setVisible(true);
        }

    }

}
