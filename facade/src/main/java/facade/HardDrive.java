package facade;

public class HardDrive {

	public byte[] read(long lba, int size) {
		System.out.println("Reading "+size+" byest from LBA "+lba);
		return new byte[size];
	}
}
