package operator;

import java.util.Scanner;

public class FixOperator {
	private static final Scanner mScanner = new Scanner(System.in); //Các biến private nên thêm tiền tố m, vì mScanner chỉ khởi tạo 1 lần và k đổi nên để final 
	private static int a;
	private static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Menu: ");
		System.out.println("1. Number Operator");
		System.out.println("2. Bit Operator");
		System.out.println("3. Exit");

		System.out.println("Please choice: ");
		int choice = Integer.parseInt(mScanner.nextLine());
		switch (choice) {
			case 1:
				input();
				testNumberOperator();
				break;
			case 2:
				input();
				testBitOperator();
				break;
			default:                //Trong switch nên có default.
				System.exit(0);
				break;
		}
	}

	private static void input() {
		System.out.println("nhap so nguyen a: ");
		a = mScanner.nextInt();

		System.out.println("nhap so nguyen b: ");
		b = mScanner.nextInt();
	}

	private static void testNumberOperator() {
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

	private static void testBitOperator() {
		int moveleft;
		int moveright;
		moveleft = a << 4;
		moveright = b >> 3;
		System.out.println("The value after moveleft: " + moveleft);
		System.out.println("The value after moveright: " + moveright);
	}

}
