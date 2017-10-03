package iterator;

/**
 * Created by User on 03.10.2017.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyListImpl implements MyList, ListIterable {
    private Object [] array = new Object[5];
    private int capacity = 0;

    public int size(){
        return capacity;
    }

    @Override
    public String toString(){
        String str = "[";
        for(int i = 0; i < capacity; i++){
            if (i != capacity-1){
                str+=array[i]+", ";
            }
            else
                str+=array[i];
        }
        return str + "]";
    }

    public Object[] toArray() {
        Object [] arr = new Object[capacity];
        System.arraycopy(array, 0, arr, 0, arr.length);
        return arr;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public void add(Object e){

        if (capacity == array.length){
            Object [] arr = new Object[array.length + 5];

            System.arraycopy(array, 0, arr, 0, array.length);
            array = arr;
            array[capacity] = e;
        }

        array[capacity] = e;
        capacity++;
    }

    public void clear(){
        array = new Object[]{};
        capacity = 0;
    }

    public void shift(Object[] array, int startPosition, int length){
        for (int j = startPosition; j < length; j++){
            array[j] = array[j+1];
        }
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public boolean remove (Object o){
        boolean found = false;
        for (int i = 0; i < capacity; i++){
            if(array[i] == null){
                if(array[i] == o){
                    found = true;
                    capacity--;
                    shift(array, i, capacity);
                    return found;
                }
            }
            else if (array[i].equals(o)){
                found = true;
                capacity--;
                shift(array, i, capacity);
                return found;
            }
        }
        return found;
    }

    public boolean contains(Object o){
        boolean found = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                if(array[i] == o){
                    found = true;
                    return found;
                }
            }
            else if(array[i].equals(o)){
                found = true;
                return found;
            }
        }
        return found;
    }

    public boolean containsAll(MyList c) throws Exception{
        //less array can`t contain bigger one
        if (this.capacity<c.size()){
            throw new Exception("Array`s compared with bigger one!");
        }

        for (int i = 0; i < c.size(); i++){
            if(!contains(c.toArray()[i])){
                return false;
            }
        }
        return true;
    }

    //Iterator implementation
    class IteratorImpl implements Iterator<Object> {
        private final Object[] objects;//we can`t change collection when we use iterator
        private int index;

        public IteratorImpl(){
            objects = new Object[]{};
            index = 0;
        }

        public IteratorImpl(Object[] objects){
            this.objects = objects;
            index = 0;
        }

        public Object next() throws NoSuchElementException {
            if (hasNext()) {
                return objects[index++];
            }
            else
                throw new NoSuchElementException();
        }

        public void remove() throws IllegalStateException{
            try{
                MyListImpl.this.remove(objects[--index]);
            }
            catch(IndexOutOfBoundsException e){
                throw new IllegalStateException();
            }
        }

        public boolean hasNext(){
            //use capacity
            return index != MyListImpl.this.size();
        }
    }

    public Iterator<Object> iterator(){
        return new IteratorImpl(array);
    }

    //list iterator
    private class ListIteratorImpl extends IteratorImpl implements iterator.ListIterator {
        private final Object[] objects;
        private int index;

        public ListIteratorImpl(){
            objects = new Object[]{};
            index = 0;
        }

        public ListIteratorImpl(Object[] objects){
            this.objects = objects;
            index = 0;
        }

        //override `cause polymorphism does not work for fields
        public Object next() throws NoSuchElementException{
            if (hasNext()) {
                return objects[index++];
            }
            else
                throw new NoSuchElementException();
        }

        public boolean hasNext(){
            return index != MyListImpl.this.size();
        }

        public boolean hasPrevious(){
            return index >= 0;
        }

        public Object previous() throws IndexOutOfBoundsException{
            if(!hasPrevious()){
                throw new IndexOutOfBoundsException();
            }
            //ERROR!!!
            // error, index = -1, may be should be index--
            return --index;
            //ERROR!!!
        }

        public void set(Object e){
            if (index < 0){ // if we in the very front of the array
                index++;
                objects[index] = e; //first element
            }
            else
                objects[--index] = e;
        }

        public void remove(){
            super.remove();
        }
    }

    public ListIterator listIterator(){
        return new ListIteratorImpl(array);
    }
}

