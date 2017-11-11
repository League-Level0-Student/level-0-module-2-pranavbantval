import javax.swing.JOptionPane;

public class votingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int x = Integer.parseInt(age);
		if (x >= 18) {
			JOptionPane.showInputDialog("Who do you think should be the next president?");
			JOptionPane.showMessageDialog(null, "That's a good choice.");
		} else {
			JOptionPane.showMessageDialog(null, "You're not old enough to vote.");
		}
	}
}
