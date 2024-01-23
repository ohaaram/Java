package sub26;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Student01> totalList=new ArrayList<>();
		
		totalList.add(new Student01("홍길동", "남",92));
		totalList.add(new Student01("김수영", "여",87));
		totalList.add(new Student01("감자바", "남",95));
		totalList.add(new Student01("오해영", "여",93));
		
		//남학생만 묶어 List 생성
		/*
		 * List<Student>maleList=totalList.stream().
		 * filter(s->s.getSex().equals("남")).toList();
		 */
		
		List<Student01> maleList=
				totalList.stream()
				.filter(s->s.getSex().equals("남"))
				.toList();
		//toList() : 호출한 스트림의 요소 순서대로 저장됩니다
	
		maleList.stream().forEach(s->System.out.println(s.getName()));
		
		System.out.println();
		
		//학생 이름을 키,학생의 점수를 값으로 갖는 Map생성
		Map<String, Integer> map=totalList.stream()
				.collect(Collectors.toMap(s->s.getName(), s->s.getScore()));
		System.out.println(map);
				
	}

}
