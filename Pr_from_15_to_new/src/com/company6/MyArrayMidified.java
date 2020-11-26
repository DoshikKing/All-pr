package com.company6;

public class MyArrayMidified<E> {
    E[] array;

    public MyArrayMidified(E[] array){
        this.array = array;
    }

    public E[] getArray() {
        return array;
    }
    public E at(int ind) throws MyArrayIndexOutOfBoundsException {
        if (ind <= 0 || ind >= array.length)
            throw new MyArrayIndexOutOfBoundsException(ind);

        return array[ind];
    }
}
