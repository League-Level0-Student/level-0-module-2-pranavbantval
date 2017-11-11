package methods;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 * 
		 */
		String a = JOptionPane
				.showInputDialog("Please choose from the animals followed. Cow, duck, dog, cat, and llama.");
		if (a.equalsIgnoreCase("cow")) {
			playMoo();
		} else if (a.equalsIgnoreCase("duck")) {
			playQuack();
		} else if (a.equalsIgnoreCase("dog")) {

			playWoof();
		} else if (a.equalsIgnoreCase("cat")) {
			playMeow();

		} else if (a.equalsIgnoreCase("llama")) {
			playLlama();
		} else {
			JOptionPane.showMessageDialog(null, "Check your spelling. That animal is not available.");
		}
		/* 2. Make it so that the user can keep entering new animals. */
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
