package Assignment07;

public class TVRemoteControllerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVRemoteController remote = new TVRemoteController();
		
		for(int i = 0; i < 10; i++) {
			remote.channelUp();
			System.out.println("MSG: " + remote.help);
		}
		for(int i = 0; i < 10; i++) {
			remote.channelDn();
			System.out.println("MSG: " + remote.help);
		}
		for(int i = 0; i < 5; i++) {
			remote.volUp();
			System.out.println("MSG: " + remote.help);
		}
		for(int i = 0; i < 5; i++) {
			remote.volDn();
			System.out.println("MSG: " + remote.help);
		}
	}

}
