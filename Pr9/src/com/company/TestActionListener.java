package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ShapeCreation shape = new ShapeCreation();
    }
}