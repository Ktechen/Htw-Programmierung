package commands.sort;

import commands.ICommand;
import data.Elements;

public class ShowData implements ICommand {

	@Override
	public void execute() {
		for (int i = 0; i < Elements.student.length; i++) {
			System.out.println(Elements.student[i]);
		}
	}

	@Override
	public String toString() {
		return "ShowData";
	}
}
