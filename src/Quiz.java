import javax.swing.JOptionPane;
public class Quiz {

	public static void main(String[] args) {
		
		String question = "Which of the following applies to Java?'\n";
		
		question += "A. Java is a style language, which is a type of language you can "
				+ "\n use to describe the presentation of a markup language.\n\n";
		question += "B. Java is a language specifying the organization of databases.\n\n";
		question += "C. The Java programming language is a general purpose, concurrent,"
				+ "\n strongly typed, class-based object oriented language.\n\n";
		question += "D. Java is an interpreted, object oriented language, "
				+ "\n high level programming language with dynamic semantics. \n\n";
		question += "E. Java is a lightweight, interpreted, object-oriented "
				+ "\n language with first-class functions, and is best known as "
				+ "\n the scripting language for web pages, but it's used in many non-browser environments aswell.\n";
		
		while (true) {
			
		String answer = JOptionPane.showInputDialog(question);
		
		answer = answer.toUpperCase();
		
		if (answer.equals("C")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			break;
			
		} else if (answer.equals("A") || answer.equals("B") || answer.equals("D") || answer.equals("E") ) {
				JOptionPane.showMessageDialog(null,"Incorrect. Please try again.");
		}else {
			JOptionPane.showMessageDialog(null, "Invalid answer.Please enter A, B, C, D, E.");
			}
		}
	}

}
