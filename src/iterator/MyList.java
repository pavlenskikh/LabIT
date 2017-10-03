package iterator;

public interface MyList extends Iterable<Object>{   
	public void add(Object e); 
	public void clear();  
	public boolean remove(Object o);  
	public Object[] toArray();  
	public int size();    
	public boolean contains(Object o); 
	public boolean containsAll(MyList c); 
}

