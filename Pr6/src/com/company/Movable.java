package com.company;

public interface Movable {

    default String Movable(int stX, int stY, int speed){return "moved";};

}
