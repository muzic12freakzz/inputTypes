/* NameApp1.java
*@author Diwan, S
* 08/02/2016
*/

import java.util.Scanner;

public class NextLine{
	public static void main(String args[]){
		// declare variables
		String name;
		// declare objects
		Scanner keyboard;
		// create objects
		keyboard= new Scanner(System.in);
		//get input
		System.out.println("Please enter your name");
		name = keyboard.nextLine();
		//print output
		System.out.println("Hello "+name);
	}
}
