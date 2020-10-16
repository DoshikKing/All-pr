package com.company;


import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUI extends JFrame {
    String[] planets = {"Не выбрано", "Меркурии", "Венере", "Земле", "Марсе", "Юпитере", "Сатурне", "Уране", "Нептуне"};

    public GUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Гравитация");
        setSize(300, 300);
        setResizable(false);

        JLabel text = new JLabel("Гравитация на ");
        JComboBox planetSelector = new JComboBox(planets);
        JLabel gravityLabel = new JLabel();

        planetSelector.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String planet = (String) planetSelector.getSelectedItem();
                switch(planet){
                    default:
                        gravityLabel.setVisible(false);
                        break;
                    case "Меркурии":
                        gravityLabel.setText("g = " + Planet.MERCURY.getGravity() + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Венере":
                        gravityLabel.setText("g = " + Planet.VENUS.getGravity() + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Земле":
                        gravityLabel.setText("g = " + Planet.EARTH.getGravity() + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Марсе":
                        gravityLabel.setText("g = " + Planet.MARS.getGravity() + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Юпитере":
                        gravityLabel.setText("g = " + Planet.JUPITER.getGravity() + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Сатурне":
                        gravityLabel.setText("g = " + Planet.SATURN.getGravity() + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Уране":
                        gravityLabel.setText("g = " + Planet.URANUS.getGravity() + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                    case "Нептуне":
                        gravityLabel.setText("g = " + Planet.NEPTUNE.getGravity() + " м/с^2");
                        gravityLabel.setVisible(true);
                        break;
                }
            }
        });

        text.setBounds(5, 10, 180, 20);
        planetSelector.setBounds(185, 10, 95, 20);
        gravityLabel.setBounds(5, 40, 200, 200);

        add(text);
        add(planetSelector);
        add(gravityLabel);

        setVisible(true);
    }
}