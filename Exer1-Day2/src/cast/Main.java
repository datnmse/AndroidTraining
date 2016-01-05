/**
 * 
 */
package cast;

import java.util.Scanner;

/**
 * @author DATNM
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanin  = new Scanner(System.in); 
		int a;
		int b;
		//input
		System.out.println("Input number a: ");
		a = scanin.nextInt();
		System.out.println("Input number b: ");
		b = scanin.nextInt();	
		
		//widening conversion
		double d = (double)a/b;
		System.out.println("Casting windening conversion is: "+d);
		//narrow conversion
		float f= 40.021312f;
		int narrow = (int)f+2;
		System.out.println("castiong narrow conversion is: "+narrow);
		
	}
}
