package com.company3;

public class Pr20 {
    public static void main(String[] args) {
        MyText myText = new MyText();

        myText.textReader("/home/doshikking/JavaProjects/Java/Pr_from_15_to_new/src/com/company3/text.txt");
        myText.tenMostUsedWords();
        myText.replaceSpacebarFile("/home/doshikking/JavaProjects/Java/Pr_from_15_to_new/src/com/company3/text.txt");
    }
}