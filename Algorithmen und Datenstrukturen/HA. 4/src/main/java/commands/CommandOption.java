package commands;

public class CommandOption {

	/*
	 * Which list is selected
	 */
	private static boolean whichList = false;
	private static boolean whichSort = false;

	public static boolean isWhichList() {
		return whichList;
	}

	public static void setWhichList(boolean whichList) {
		CommandOption.whichList = whichList;
	}

	public static boolean isWhichSort() {
		return whichSort;
	}

	public static void setWhichSort(boolean whichSort) {
		CommandOption.whichSort = whichSort;
	}

}
