
import javax.swing.*;
import java.awt.*;

public class Client extends JFrame {

	public static void initalizeFrame(JFrame window) {

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("Hang Man!");
		window.setSize(2000, 1000);
		window.setLayout(new FlowLayout());
		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}

	public static void main(String[] args) {
		JFrame jf = new JFrame();

		HangMan man = new HangMan(150, 150);
		boolean isWord = false;
		String word = "";
		
			word = JOptionPane.showInputDialog("Player 1: Please enter a word.");
			word = word.toUpperCase();
			while(!isValidWord(word)){
				JOptionPane.showMessageDialog(null, "Cannot contain numbers or symbols!");
				word = JOptionPane.showInputDialog("Player 1: Please enter a word.");
				word = word.toUpperCase();

			}
		
			

		

		Label p = new Label(word.length(), word);

		Dashes lines = new Dashes(word, man);
		Button mike = new Button(word, lines);

		jf.getContentPane().add(man);
		jf.getContentPane().add(p);
		jf.getContentPane().add(mike);
		jf.getContentPane().add(lines);

		initalizeFrame(jf);

	}
	
	static boolean isValidWord(String str){
		for (int i = 0; i < str.length(); ++i) {
			if(!Character.isLetter(str.charAt(i))) {
			return false;
			}
	}
		return true;
	}

}
