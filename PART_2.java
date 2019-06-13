import javax.swing.*;

public class Window {
	
	private static JButton button;
	private static JTextField textField;

	public static void main(String[] args) {
		JFrame frame = new JFrame("This is a window");	// creates the JFrame and titles it
		
		button = new JButton("hi");
		button.setBounds(100,100,100,100);
		frame.add(button);
		
		textField = new JTextField();
		textField.setBounds(250,100,100,25);
		frame.add(textField);
		
		
		frame.setSize(400,400);	// sets the size of the frame
        frame.setLayout(null);	// sets layout   
		frame.setVisible(true);	// sets JFrame to be visible
	
	}
}
