package step1;

import java.util.Scanner;

public class Main1_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 갯수를 입력, 그만큼 입력 받아서 각각 수를 더하기

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int A = 0;
		int B = 0;

		int arr[] = new int[num];// 입력받은 만큼 배열을 생성

		for (int i = 0; i < arr.length; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			arr[i] = A + B;
		}
		for (int i : arr)
			System.out.println(i);
	}

}
