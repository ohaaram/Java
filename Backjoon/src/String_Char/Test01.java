package String_Char;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("단어를 입력하세요:"); 
		String a = sc.next();
		
		System.out.println("숫자를 입력하세요:");
		int num=sc.nextInt();
		
		
		//String b = sc.next();
		
		System.out.println(a.charAt(num-1));
	}

}
