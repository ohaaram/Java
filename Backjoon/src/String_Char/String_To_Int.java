package String_Char;

import java.util.Scanner;

public class String_To_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String answer ="";
		Scanner sc=new Scanner(System.in);

		System.out.print("아무 숫자나 입력: ");
		n=sc.nextInt();
		
		answer=""+n;
		
		//String answer = String.valueOf(n);
		//String answer = Integer.toString(n);

		System.out.printf("%s",answer);
	}
}
