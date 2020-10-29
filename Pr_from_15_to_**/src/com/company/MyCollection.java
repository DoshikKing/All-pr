package com.company;


public class MyCollection {
    private int size;
    private int[] array;

    public int getSize(){
        return size;
    }

    public  MyCollection(){
        array = new int[0];
    }

    public void add(int item){
        if (array.length == 0)
            array = new int[1];
        else {
            int[] buffArray = new int[array.length + 1];
            System.arraycopy(array, 0, buffArray, 0, buffArray.length - 1);
            array = new int[array.length + 1];
            System.arraycopy(buffArray, 0, array, 0, array.length);
        }
        array[array.length - 1] = item;
        size++;
    }

    public void delete(int ind){
        if (array.length == 0 || ind >= array.length || ind < 0)
            return;
        boolean check = false;
        array[ind] = Integer.MIN_VALUE;
        int[] buffArray = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] == Integer.MIN_VALUE)
                check = true;
            if (!check)
                buffArray[i] = array[i];
            else
                buffArray[i] = array[i + 1];
        }
        array = new int[array.length - 1];
        System.arraycopy(buffArray, 0, array, 0, array.length);
        size--;
    }

    public int searchByItem(int item){
        for (int i = 0; i < array.length; i++)
            if (array[i] == item)
                return i;
        return Integer.MIN_VALUE;
    }

    public int searchByInd(int ind){
        return (ind < array.length && ind >= 0) ? array[ind] : Integer.MIN_VALUE;
    }

    public int maxItem(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    public int minItem(){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++)
            if (array[i] < min)
                min = array[i];
        return min;
    }

    public double averageNumber(){
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return array.length > 0 ? (double)(sum / array.length) : 0;
    }
}
