package command;

public class CommandPattern {

	public static void main(String[] args) {
		Light livingRoomLight=new Light();
		Command turnOn=new TurnOnLightCommand(livingRoomLight);
		Command turnOff=new TurnOffLightCommand(livingRoomLight);
		RemoteControl remote=new RemoteControl();
		remote.setCommand(turnOn);
		remote.pressButton();
		remote.setCommand(turnOff);
		remote.pressButton();
	}
}
