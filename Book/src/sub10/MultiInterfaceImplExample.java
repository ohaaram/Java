package sub10;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		RemoteControl3 rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		searchable.serch("https://www.youtube.com");
	}
}
