package b15_�������̽�;

public class LGRemotecontrol {
	private Switch powerSwitch = new SwitchImpl();
	private Switch volumeSwitch = new SwitchImpl2();
	
	public LGRemotecontrol() {}
	
	public void powerSwitchController(int flag) {
		if(flag ==1) {
			powerSwitch.on();
		}else if(flag == 0) {
			powerSwitch.off();
		}else {
			System.out.println("�߸��� ���� ���޹޾ҽ��ϴ�.");
		}
	}	
	public void volumeSwitchController(int flag) {
		if(flag ==1) {
			volumeSwitch.on();
		}else if(flag == 0) {
			volumeSwitch.off();
		}else {
			System.out.println("�߸��� ���� ���޹޾ҽ��ϴ�.");
		}
	}	
}
