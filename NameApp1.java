/* NameApp1.java
*@author Diwan, S
* 08/02/2016
*/

import javax.swing.JOptionPane;

public class NameApp1{
	public static void main(String args[]){
		// declare variables
		String name;
		//get input
		name = JOptionPane.showInputDialog(null, "Please enter your name.");
		//print output
		JOptionPane.showMessageDialog(null, "Hello "+ name);
	}
}
