/**
 * 
 */
package operator;

import java.awt.List;
import java.util.Scanner;

/**
 * @author DATNM
 *
 */
public class MainOperator {

	/**
	 * @param args
	 */
	static Scanner scanin = new Scanner(System.in);
	public static int a;
	public static int b;

	public static void Input() {

		System.out.println("nhap so nguyen a: ");
		a = scanin.nextInt();
		System.out.println("nhap so nguyen b: ");
		b = scanin.nextInt();

	}

	public static void NumberOperator() {
		int c, d, e;
		double f, mod;
		c = a + b;
		System.out.println("addition operator:" + c);

		d = a - b;
		System.out.println("subtraction operator:" + d);

		e = a * b;
		System.out.println("multiplication operator: " + e);

		f = a / b;
		System.out.println("division operator: " + f);

		mod = a % b;
		System.out.println("Mod operator: " + mod);

		a++;
		System.out.println("The new number a: " + a);
		b--;
		System.out.println("The new number b:" + b);
	}

	public static void LogicAndRelationalOperator() {
		// input total average of student
		double aver;
		String name;
		System.out.println("Input name of student: ");
		name = scanin.next();
		System.out.println("Input averare grade of student: ");
		aver = scanin.nextDouble();

		if (aver == 10) {
			System.out.println("THe student " + name + " achieving Excellent level");
		} else if (7.5 <= aver && aver <= 9.9) {
			System.out.println("THe student " + name + " achieving Good Level");
		} else if (6 <= aver && aver <= 7.4) {
			System.out.println("THe student " + name + " achieving Medium Level");
		} else if (0 < aver && aver <= 5.9) {
			System.out.println("THe student " + name + " achieving Poor Level");
		}
	}

	public static void BitOperator() {
		int moveleft;
		int moveright;
		moveleft = a << 4;
		moveright = b >> 3;
		System.out.println("The value after moveleft: " + moveleft);
		System.out.println("The value after moveright: " + moveright);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		while (true) {

			System.out.println("Menu: ");
			System.out.println("1. Number Operator");
			System.out.println("2. Logic And Ralational Operator");
			System.out.println("3. Bit Operator");
			System.out.println("4. Exit");

			System.out.println("Please choice: ");
			choice = Integer.parseInt(scanin.nextLine());

			if (choice == 4)
				break;
			switch (choice) {
				case 1: {
					Input();
					NumberOperator();
					break;
				}
				case 2: {
					LogicAndRelationalOperator();
					break;
				}
				case 3: {
					Input();
					BitOperator();
					break;
				}
			}
		}
	}
}
