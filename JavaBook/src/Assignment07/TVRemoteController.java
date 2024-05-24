package Assignment07;

public class TVRemoteController {
	int vol = 0;
	int channel = 0;
	String help;
	void volUp() {
		vol++;
		help = "현재 음량: " + vol;
	}
	void volDn() {
		vol--;
		help = "현재 음량: " + vol;
	}
	void channelUp() {
		channel++;
		help = "현재 채널: " + channel;
	}
	void channelDn() {
		channel--;
		help = "현재 채널: " + channel;
	}
}
