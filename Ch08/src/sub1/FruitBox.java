package sub1;

public class FruitBox<T> {//<T> -> 제네릭 변수를 가지고 있다고 선언해주기
	private T fruit;//치환변수로 바꿈 Apple에서...
	
	
	public T getFruit() {
		return fruit;
	}
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
