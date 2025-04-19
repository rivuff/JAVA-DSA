package LLD.Vector.Service;

import LLD.Vector.Iterator.VectorIterator;

public class VectorService<T> {
    private final VectorIterator vectorIterator;

    public VectorService(VectorIterator vectorIterator) {
        this.vectorIterator = vectorIterator;

    }

    public void addData(T value){
        if(vectorIterator.spaceLeft()){
            Object[] element = vectorIterator.getElements();
            element[vectorIterator.getIndex()] = value;
            vectorIterator.setIndex();
        }else {
            vectorIterator.setSize();
        }

    }

}
