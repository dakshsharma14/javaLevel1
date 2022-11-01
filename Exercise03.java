/*
 * Student Name: Daksh Sharma
 * Lab Professor: Professor Fedor Ilitchev
 * Due Date: 24 june 2022
 * Description: Exercise 03 
 */
/*
 * This class contains method main, and is used to run
 * the application.
 */
import java.util.Scanner;
public class Exercise03 {
    /*
	 *Method main creates an instance of class RightAngleTraingle
	 *as well as class Main.We have adjacent 
	 *as well as the opposite sides of right-angle triangle.
	 *output hypotenuse, perimeter and Area.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		RightAngleTraingle triangle = new RightAngleTraingle();
		double  AdjacentSide;
		double  OppositeSide;
		
		System.out.println("Right angle triangle program");
		System.out.println("Enter adjacent length: ");
	    AdjacentSide = keyboard.nextDouble();
		
		System.out.println("Enter opposite length: ");
	    OppositeSide = keyboard.nextDouble();
		
		triangle.setAdjacent(AdjacentSide);
		triangle.setOpposite(OppositeSide);
		
		triangle.createReport();
		System.out.printf("Hypotenues = %.4f %n",triangle.calculateHypotenuse());
		System.out.printf("Perimeter = %.4f %n",triangle.calculatePerimeter());
		System.out.printf("Area = %.4f %n",triangle.calculateArea());
	    System.out.println("Program Implemented by Daksh Sharma");
	 }
}
