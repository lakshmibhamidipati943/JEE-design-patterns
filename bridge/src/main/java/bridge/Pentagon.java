package bridge;

public class Pentagon extends Shape{

	protected Pentagon(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("Pentagon filled with color");
		color.applyColor();
	}

}
