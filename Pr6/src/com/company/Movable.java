package com.company;

public interface Movable {
    default int getMovableStart (int speed, int direction) {
        return speed*direction;
    }
}
