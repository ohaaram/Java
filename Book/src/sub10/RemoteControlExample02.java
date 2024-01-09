package sub10;

public class RemoteControlExample02 {
	public static void main(String[] args) {
		
		RemoteControl2 rc;
		
		rc= new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		RemoteControl2.changeBattery();
	}
	

}
