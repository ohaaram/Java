package sub22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		
		//ArrayList에 객체 넣음
		startTime=System.nanoTime();
		for(int i=0;i<1000;i++) {
			list1.add(0,String.valueOf(i));//인덱스 0번에 숫자 i를 문자로 바꿔서 계속 저장함.
			System.out.println(list1.get(0));
		}
		endTime=System.nanoTime();
		System.out.printf("%-17s %8d ns \n","ArrayList 걸린 시간: ",(endTime-startTime));
		
		
		
		
		//LinkedList에 객체 넣음		
		startTime=System.nanoTime();
		for(int i=0;i<1000;i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.printf("%-17s %8d ns \n","LinkedList 걸린 시간: ",(endTime-startTime));
	}

}
