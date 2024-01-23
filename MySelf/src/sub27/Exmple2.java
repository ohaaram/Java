package sub27;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Exmple2 {
	List<Member> list=Arrays.asList(
			new Member("홍길동","개발자"),
			new Member("김나리","디자이너"),
			new Member("신용권","개발자"));
	
	Map<String, List<Member>> groupingMap = list.stream()
			.

}
