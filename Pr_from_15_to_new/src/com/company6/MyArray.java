package com.company6;

public class MyArray<E> {
    E[] array;

    public MyArray(E[] array){
        this.array = array;
    }

    public E[] getArray() {
        return array;
    }
}