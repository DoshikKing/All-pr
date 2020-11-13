package com.company3;

public class Pr20 {
    public static void main(String[] args) {
        String text = "You can come across the little changes on the Wiki. We are updating the wiki and pages. Old pages and translated pages can be accessible on ";
        MyText myText = new MyText();

        myText.wordsCounter(myText.fromTextToArray(text));

        System.out.println("Самое частое слово: " + myText.getMostUsedWord() + ". Число повторений: " + myText.getMostUsedWordCounter());

        System.out.println(myText.replaceSpace('#', text));
    }
}
