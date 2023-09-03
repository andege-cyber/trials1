/*Java Program to display text using label*/
import javax.swing.*;
import java.awt.*;
class Frame_Label
{
	//Driver function
	public static void main(String args[])
	{
		//Create a frame
		JFrame frame=new JFrame("Java frame");
		frame.setSize(500,500);/*sets the height and width of the frame*/
		frame.setBackground(Color.red);/*sets the background color of the frame */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*this is a default close operation for the frame */
		frame.setLayout(null);
		//Create a Label
		JLabel label=new JLabel();/*creates a new label */
		label.setBounds(0,100,100%,50%);/*sets the position of the label */
		frame.add(label);/*adds the label to the frame */
		//Write text to the label
		String str="This text is written using a label";/*the text to be added to the label */
		label.setText(str);/*adds text to the label */
		//Create a button
		JButton button = new JButton(); /*creates a new button */ 
        button.setText("Button");
		frame.add(button);/*adds a button to the frame */
		//Display the frame
		frame.setVisible(true);/*used to display the frame. The frame will display with the text “This text is written using a label” which is added to the label */
	}
}