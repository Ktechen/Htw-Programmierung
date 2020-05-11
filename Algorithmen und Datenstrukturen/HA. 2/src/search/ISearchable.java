package search;

import list.Listable;

public interface ISearchable<T> {
	public Listable<T> searchString(Listable<T> list, String search, Options option);

	public Listable<T> searchInteger(Listable<T> list, int search, Options option);

	public enum Options {
		prename, surname, course, matriculationNumber
	};

}
