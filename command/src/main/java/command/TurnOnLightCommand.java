package command;

public class TurnOnLightCommand implements Command {

	private Light light;
	public TurnOnLightCommand(Light light) {
		this.light=light;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.turnOn();
	}

}
