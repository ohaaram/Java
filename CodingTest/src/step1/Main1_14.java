package step1;

import java.util.Scanner;

public class Main1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int num1= sc.nextInt();
		
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d * %d = %d\n",num1,i,num1*i);
		}
	}

}
