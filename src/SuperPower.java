import javax.swing.JOptionPane;

public class SuperPower {

	public static void main(String[] args) {
		String power = JOptionPane.showInputDialog("WHAT IS YOUR SUPER POWER?");
		
		power = power.toUpperCase();
		JOptionPane.showMessageDialog(null,power+" TO THE RESCUE!");
	}

}
