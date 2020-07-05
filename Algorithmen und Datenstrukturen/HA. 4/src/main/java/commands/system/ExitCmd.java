package commands.system;

import commands.ICommand;

public class ExitCmd implements ICommand {

	private String message = "Exit program";
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void execute() {
		System.out.println(message + " ... ");
		System.exit(0);
	}

	@Override
	public String toString() {
		return message;
	}
}
