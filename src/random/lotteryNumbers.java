package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {
	public static void main(String[] args) {
		Random r = new Random();
		JOptionPane.showMessageDialog(null, "The winning lottery numbers are ...");
		String lottery = " ";
		for (int i = 0; i < 5; i++) {

			int n = r.nextInt(10);
			String x = Integer.toString(n);
			lottery = lottery + " " + x;

		}
		JOptionPane.showMessageDialog(null, lottery);
	}
}
