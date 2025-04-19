package LLD.Vector.Iterator;

public class VectorIterator<T> implements Iterator{
    private T[] elements;
    private int size;
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex() {
        this.index = index+1;
    }

    public T[] getElements() {
        return elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(){
        this.size = size+5;
    }

    public VectorIterator(){
        elements = (T[]) new Object[10];
        this.size = 10;
        this.index = 0;
    }

    @Override
    public boolean spaceLeft() {
        return elements[elements.length-1] == null;
    }
}
