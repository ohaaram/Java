package String_Char;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String answer = " ";
		String my_string = new String();
		int k = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("너의 문자를 입력해: ");
		my_string = sc.nextLine();

		System.out.print("반복할 숫자를 입력해:");
		k = sc.nextInt();

		for (int i = 0; i < k; i++) {
			answer += my_string;
		}

		System.out.println(answer);
	}

}
