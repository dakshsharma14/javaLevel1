 /*
 * Student Name: Daksh Sharma
 * lab Professor: Professor Fedor Ilitchev
 * Due date: 10th June, 2022
 * Modified: 9thth June, 2022
 * Description: Exercise 02
 */

/*Description: In this exercise we are working with the
 *             programming company for developing software 
 *             for a grocery store and told us to design simple 
 *             UML class diagrams, flowchart, Pseudocode, methods 
 *             and constructors.*/

import java.util.Scanner;                         //importing the scanner 
public class Exercise2 {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
	 
		System.out.println("Enter weight = ");           //getting weight input from the user
		double inputWeight = userinput.nextDouble();
	
		System.out.println("Enter cost per kilogram = "); //getting price input from the user 
		double inputCost = userinput.nextDouble();
		
		Cabbage cabbage = new Cabbage();         //calling the Cabbage class  
		
		//setter
		cabbage.setWeight(inputWeight);    
		cabbage.setCostPerKilogram(inputCost);
		
		System.out.println("cabbage.getWeight() is: "+ cabbage.getWeight());
		System.out.println("cabbage.getCostPerKilogram() is: "+ cabbage.getCostPerKilogram());
		
		//calling calculate price worker method from Cabbage class
		double price = cabbage.calculateprice();     
	    System.out.println("cabbage.calculatePrice() is: " +price);
			    
		
		//print report		
        System.out.println("cabbage.printReport() is:");
		cabbage.printReport();
		
		
	    //Testing another overloaded method  
	    System.out.println("Testing overloaded constructor with ");
	    
	    
	    System.out.println("anotherCabbage");
	  
	    Cabbage cabbage2 = new Cabbage(3.5, 2.25);                        
	    System.out.println("Weight "+ cabbage2.getWeight()+ ", cost per kilogram "+ cabbage2.getCostPerKilogram());
	     
	    
	    System.out.println("anothercabbage.printReport() is: ");
	    cabbage2.printReport();                                         //another cabbage print Report
	    
	    System.out.println("Program Implemented by Daksh Sharma");
		}

}
