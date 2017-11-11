import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String in = JOptionPane.showInputDialog("What height are you in inches?");
		int i = Integer.parseInt(in);
		if (i > 48) {
			JOptionPane.showMessageDialog(null, "You may ride the rollercoaster. Have fun!!");
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, you cannot ride the rollercoaster. Come again next time!");
		}

	}
}
