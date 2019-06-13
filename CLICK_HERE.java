import javax.swing.*;

public class Window {
	
	private static JButton button;
	private static JTextField textField;
  
  // methods .setBounds(x, y, width ,height) and .add(Compenent c) must be used to set and add the Object to the JFrame
  // ex: button.setBounds(100,100,300,300)...
  
	public static void main(String[] args) {
		JFrame frame = new JFrame("This is a window");	// creates the JFrame and titles it
		
		frame.setSize(400,400);	// sets the size of the frame
    frame.setLayout(null);	// sets layout   
		frame.setVisible(true);	// sets JFrame to be visible
	
	}
}
