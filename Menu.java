package practicejava;

// Name : Manab Seal
// 2. Write a program to Menu driven program using 
// switch statement ( Find addition, subtraction, 
// multiplication and division of to integer numbers )

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		while (true) {

			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 to exit");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();

			System.out.println("Enter the first number");
			int a = sc.nextInt();
			System.out.println("Enter the second number");
			int b = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Addition is: " + (a + b));
				break;
			case 2:
				System.out.println("Subtraction is: " + (a - b));
				break;
			case 3:
				System.out.println("Multiplication is : " + (a * b));
				break;
			case 4:
				System.out.println("Division is : " + ((double) a / (double) b));
				break;
			case 5:
				System.out.println("Exiting......");
				return;
			default:
				System.out.println("Enter a valid choice");

			}
		}
	}
}
