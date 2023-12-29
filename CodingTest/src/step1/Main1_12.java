package step1;

import java.util.Scanner;

public class Main1_12 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int h= sc.nextInt();//입력받은 시간(23시간)
		int m=sc.nextInt();//입력받은 분(59분)

		if(m-45<0 && h==0)
		{
			h=23;
			m+=15;
		}
		else if(m-45<0)
		{
			m+=15;
			h--;
		}
		else
			m-=45;		
		
		System.out.println(h+" "+m);
	
	}

}
