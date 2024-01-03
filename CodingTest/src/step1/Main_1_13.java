package step1;

import java.util.Scanner;

public class Main_1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int in1 = sc.nextInt();
		int in2 = sc.nextInt();
		int in3 = sc.nextInt();
		int result = 0;

		if (in1 == in2 && in1 == in3) {
			result = 10000 + (in1) * 1000;
		} else if (in1 == in2 || in1 == in3 || in2 == in3) {
			if (in1 == in2 || in1 == in3)
				result = 1000 + (in1) * 100;
			else
				result = 1000 + in2 * 100;
		} else {
			if (in1 > in2 && in1 > in3)
				result = in1 * 100;
			else if (in2 > in1 && in2 > in3)
				result = in2 * 100;
			else
				result = in3 * 100;
		}
		System.out.println(result);
	}
}
