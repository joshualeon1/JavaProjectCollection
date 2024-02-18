import javax.swing.JOptionPane;

public class GUIExample {

	public static void main(String[] args) {

		//	The first line outputs a small "box" that prompts the user for their name. We then display our message using the second line.
		String name = JOptionPane.showInputDialog("Enter your name:");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		//	We repeat what we did before but this time we took age.
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
		JOptionPane.showMessageDialog(null, "Your height is: " + height);

	}//end Main

}//end Class
