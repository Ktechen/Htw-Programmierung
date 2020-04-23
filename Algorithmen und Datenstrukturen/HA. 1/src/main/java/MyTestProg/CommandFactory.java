//@Author Kevin Techen

package MyTestProg;

public class CommandFactory {

	public ICommands createGCDSubItCmd() {
		return new GCDSubItCmd();
	}

	public ICommands createGCDSubRecCmd() {
		return new GCDSubRecCmd();
	}

	public ICommands createGCDDivRestItCmd() {
		return new GCDDivRestItCmd();
	}

	public ICommands createGCDDivRestRecCmd() {
		return new GCDDivRestRecCmd();
	}

	public ICommands createSieveOfEratosthanesCmd() {
		return new SiebDesEratosthene();
	}

}
