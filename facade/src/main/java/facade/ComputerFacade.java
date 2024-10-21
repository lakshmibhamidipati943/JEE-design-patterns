package facade;

public class ComputerFacade {

	private CPU cpu;
	private HardDrive hardDrive;
	private Memory memory;
	public ComputerFacade() {
		this.cpu=new CPU();
		this.hardDrive=new HardDrive();
		this.memory=new Memory();
	}
	public void startComputer() {
		cpu.freeze();
		memory.load(0L, hardDrive.read(0L, 1024));
		cpu.jump(0L);
		cpu.execute();
	}
}
