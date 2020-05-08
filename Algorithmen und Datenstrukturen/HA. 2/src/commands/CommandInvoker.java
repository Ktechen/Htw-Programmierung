package commands;

import java.util.LinkedList;

import cli.Console;

public class CommandInvoker {

	private final transient LinkedList<ICommand> commands;
	private final transient Console console;

	private String headline = "Select list type before starting the main menu: ";
	private String footer = "Please enter an option: ";
	private final String errorMessage = "Input is not valid !";
	private String title = null;

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public CommandInvoker(LinkedList<ICommand> commands, Console console, String headline, String title,
			String footer) {
		super();
		this.commands = commands;
		this.console = console;
		this.headline = headline;
		this.title = title;
		this.footer = footer;
	}

	public CommandInvoker() {
		super();
		this.commands = null;
		this.console = null;
		this.headline = null;
		this.footer = null;
		this.title = null;
	}

	/*
	 * execution of console menu
	 */
	public void run() {
		do {
			// header
			System.out.println(headline + "\n");
			System.out.println(title + "\n");

			// body

			ICommand cmd = selectCommandByCommandLine();
			cmd.execute();

		} while (true);
	}

	private ICommand selectCommandByCommandLine() {
		do {
			// print all element of list
			printList();

			// wait for input
			int index = console.readIntegerFromStdin(footer, errorMessage);
			if (isValidOption(index, 0, commands.size())) {
				return commands.get(index);
			}
		} while (true);
	}

	private void printList() {
		for (int i = 0; i < commands.size(); i++) {
			System.out.println(i + ". " + commands.get(i));
		}
		System.out.println();
	}

	/*
	 * Check valid option min >= 0 and max = size() -1
	 */
	private boolean isValidOption(int x, int min, int max) {
		return x >= min && x < max;

	}
}
