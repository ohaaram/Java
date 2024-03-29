package sub23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample01 {
	public static void main(String[] args) {
		//list 컬렉션 생성
		List<Product> list = new ArrayList<>();
		for(int i=1;i<=5;i++) {
			Product product = new Product(i, "상품"+i, "멋진회사", (int)(1000*Math.random()));
		list.add(product);
		}
		
		//객체 스트림 얻기
		Stream<Product> stream = list.stream();
		stream.forEach(p->System.out.println(p));
	}

}
