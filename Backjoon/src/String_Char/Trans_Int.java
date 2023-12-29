package String_Char;

import java.util.Scanner;

public class Trans_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int result=0;
		
		System.out.println("실수를 입력 : ");;
		double number = sc.nextDouble();
		
		result = (int)number;
		
		System.out.println("소수점을 떼고 출력 : "+result);		
	}
		
}
