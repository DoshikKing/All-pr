package com.company2;

import javax.swing.JOptionPane;

public class Game {

    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null,
                "Введите уровень сложности от одного до семи:",
                "Выбор сложности",
                1);
        int slogn = Integer.valueOf(str);
        if (slogn >= 1 && slogn <= 7) {
            Okno window = new Okno(slogn);
        }
    }

}

