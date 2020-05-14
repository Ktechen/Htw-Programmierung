package commands;

import java.util.LinkedList;

import commands.stack.actions.ClearAction;
import commands.stack.actions.IfOnStackAction;
import commands.stack.actions.PeekAction;
import commands.stack.actions.PopAction;
import commands.stack.actions.PrintAction;
import commands.stack.actions.PushAction;
import commands.stack.actions.SizeAction;
import commands.system.ExitCmd;
import data.Student;
import stack.Stack;

public class CommandFactory {

	/*
	 * Start Options
	 * 
	 * @return list of options
	 */
	public static LinkedList<ICommand> createCommandList() {
		LinkedList<ICommand> list = new LinkedList<ICommand>();
		list.add(new PushAction());
		list.add(new PopAction());
		list.add(new PeekAction());
		list.add(new IfOnStackAction());
		list.add(new ClearAction());
		list.add(new PrintAction());
		list.add(new SizeAction());
		list.add(new ExitCmd());
		return list;
	}

	@Override
	public String toString() {
		return "CommandFactory";
	}
}
