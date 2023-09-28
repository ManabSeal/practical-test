package practicejava;
// Name : Manab Seal

// 1. Write a program to find the sum of even numbers 
// between 25 to 51.

public class SumEven {
	public static void main(String[] args) {
		int s = 0;
		for (int i = 25; i <= 51; i++) {
			if (i % 2 == 0) {
				s += i;
			}
		}
		System.out.println("The summation of even number is : " + s);
	}
}
