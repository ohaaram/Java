package sub26;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> studentList=Arrays.asList(
				new Student("홍길동",92),
				new Student("신용권",95),
				new Student("감자바",88)
				);
		
		//방법1
		int sum1=studentList.stream().mapToInt(Student::getScore).sum();
		
		//방법2
		int sum2=studentList.stream().map(Student::getScore).reduce(0, (a,b)->a+b);
		//결과값이 없으면 0을 return 시킨다.
		
		System.out.println("sum1:"+sum1);
		System.out.println("sum2:"+sum2);
				
	}

}
