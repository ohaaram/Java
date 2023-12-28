package sub1;
/*
 * 날짜 : 2023/12/28
 * 이름 : 오아람
 * 내용 : 배열 실습하기
 */
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {1,2,3,4,5};
		char [] arr2= {'A','B','C'};
		String [] arr3 = {"서울","대전","대구","부산","광주"};
		//원소 출력
		
		System.out.println("arr1[0] : "+arr1[0]);
		System.out.println("arr1[2] : "+arr1[2]);
		System.out.println("arr1[3] : "+arr1[3]);
		System.out.println("arr2[2] : "+arr2[2]);
		System.out.println("arr3[3] : "+arr3[3]);

		//배열 길이
		System.out.println("arr1 원소갯수 : "+arr1.length);
		System.out.println("arr2 원소갯수 : "+arr2.length);
		System.out.println("arr3 원소갯수 : "+arr3.length);
		
		//배열 반복문
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		for(int n:arr1) {//배열의 길이만큼 반복한다.반복시 배열의 원소를 n에 넣어준다.
			System.out.print(n+" ");
		}
		System.out.println();
		for(char n:arr2) {
			System.out.print(n+" ");
		}
		System.out.println();
		for(String n:arr3) {
			System.out.print(n+" ");
		}
		System.out.println();
		//1차원
		int[] scores = {80,60,78,62,92};//배열 이름정할 때 끝에 s붙여주기!(규칙임) 
		int total=0;
		
		for(int s:scores) {
			total+=s;
		}
		System.out.println("전체 합 : "+total);
		//2차원배열
		int[][] arr2d= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		System.out.print(arr2d[0][2]+" ");
		System.out.print(arr2d[1][0]+" ");
		System.out.print(arr2d[2][2]+" ");
		System.out.println();
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("arr2d["+i+"]["+j+"] : "+arr2d[i][j]+"\t");
			}
			System.out.println();
		}	
		//3차원 배열
		int[][][] arr3d= {{{1,2,3},{4,5,6},{7,8,9}},
							{{10,11,12},{13,14,15},{16,17,18}},
							{{19,20,21},{22,23,24},{25,26,27}}};//몇번째,행,열
		System.out.println("arr3d[][][] : "+arr3d[0][1][1]);
		System.out.println("arr3d[][][] : "+arr3d[1][2][1]);
		System.out.println("arr3d[][][] : "+arr3d[2][2][0]);
		
		for(int i=0;i<arr3d.length;i++) {
			for(int j=0;j<arr3d.length;j++) {
				for(int k=0;k<arr3d.length;k++) {
					System.out.printf("arr3d[%d][%d][%d] : %d",i,j,k,arr3d[i][j][k]);
					System.out.println();
					
					
					
					
				}
			}
		}
	}
}
