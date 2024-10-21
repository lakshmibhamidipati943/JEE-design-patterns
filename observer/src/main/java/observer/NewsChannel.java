package observer;

public class NewsChannel implements Observer{

	private String name;
	public NewsChannel(String name) {
		this.name=name;
	}
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(name+" received news update: "+message);
	}

}
