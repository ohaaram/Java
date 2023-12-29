package step1;

import java.util.Scanner;

public class Main1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int result = 0;

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > 0 && y > 0) {
			result = 1;
		} else if (x < 0 && y > 0) {
			result = 2;
		} else if (x < 0 && y < 0) {
			result = 3;
		} else {
			result = 4;
		}

		System.out.println(result);
	}

}
