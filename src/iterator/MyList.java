package iterator;

public interface MyList extends Iterable<Object>{   
	public void add(Object e);  // appends the specified element to the end of this list
	public void clear();   // removes all of the elements from this list
	public boolean remove(Object o);   // removes the first occurrence of the specified element from this list
	public Object[] toArray();   // returns an array containing all of the elements in this list in proper sequence
	public int size();     // returns the number of elements in this lis
	public boolean contains(Object o);  // returns true if this list contains the specified element
	public boolean containsAll(MyList c);  // returns true if this list contains all of the elements of the specified list
}

