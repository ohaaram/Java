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
		//git에서 직접 수정이 되네?
		//한번 더 연습!
		
		System.out.println(a.charAt(num-1));
	}

}
