package com.company6;

import java.util.ArrayList;
import java.util.Arrays;

public class Transfer {
    public <E> ArrayList<E> fromArrayToList(E[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}