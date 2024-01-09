package sub10;

public class SmartTelevision implements RemoteControl3, Searchable {

	@Override
	public void serch(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}

}
