package step1;

import java.util.Scanner;

public class Main1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int A = (num2 / 100);
		int B = ((num2 / 10) % 10);
		int C = (num2 % 10);

		System.out.println(num1 * C);
		System.out.println(num1 * B);
		System.out.println(num1 * A);
		System.out.println(num1 * num2);

	}

}
