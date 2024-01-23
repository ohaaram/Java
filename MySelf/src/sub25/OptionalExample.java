package sub25;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;


//예외발생이 되지않게 평균값을 구하지 못하였을 경우 지정해둔 0.0을 출력시키는 예제
public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		//예외발생(java.util.NoSuchElementException)
		/*
		 * double avg=list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		 */
		
		//방법1
		OptionalDouble optional=list.stream().mapToInt(Integer::intValue).average();
		//mapToInt : 문자열을 int(정수형으로)바꿔줌.
		
		if(optional.isPresent()) {//집계값이 있는 경우 ()안에서 처리
			System.out.println("방법1_평균:"+optional.getAsDouble());
		}else {
			System.out.println("방법1_평균 : 0.0");
		}
		
		//방법2
		double avg = list.stream().mapToInt(Integer::intValue).average()
				.orElse(0.0);//집계값이 없을경우를 대비해 디폴트값을 정해놓는다.
		System.out.println("방법2_평균: "+avg);
	
		//방법3
		list.stream().mapToInt(Integer::intValue).average().
				ifPresent(a->System.out.println("방법3_평균: "+a));
		//집계값이 있을 경우에만 동작
		
		
	}
}
