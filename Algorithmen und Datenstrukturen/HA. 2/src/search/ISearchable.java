package search;

import list.Listable;

public interface ISearchable<T> {
	public Listable<T> search(Listable<T> list, String search, SearchOptions option);

	public Listable<T> search(Listable<T> list, int search, SearchOptions option);

}
