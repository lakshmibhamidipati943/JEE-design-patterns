package template;

public abstract class HouseTemplate {

	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		//buildWindows();
		System.out.println("House is built");
	}
	private void buildFoundation() {
		System.out.println("Building foundation with cement, iron rods and sand");
	}
	public abstract void buildWalls();
	public abstract void buildPillars();
}
