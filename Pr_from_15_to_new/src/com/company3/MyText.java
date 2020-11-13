package com.company3;


import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyText {
    private final HashMap<String, Integer> wordsMap;
    String[] charExeption = {"(", ")", ".", ",", "!", "?", "\"", ":", ";", "<", ">"};

    public MyText(){
        wordsMap = new HashMap<>();
    }

    public ArrayList<String> fromTextToArray(String text){
        ArrayList<String> words = new ArrayList<>();

        String[] buffArray = text.split(" ");
        StringBuilder buff;

        int ind;

        for (String word: buffArray) {
            if (!word.equals("—")) {
                buff = new StringBuilder(word);

                for (String s : charExeption) {
                    ind = buff.indexOf(s);
                    if (ind != -1)
                    {
                        buff.deleteCharAt(ind);
                    }
                }
                word = buff.toString();
                words.add(word);
            }
        }
        return words;
    }

    public String getMostUsedWord(){
        return this.getMostUsedWordPair().getKey();
    }

    public int getMostUsedWordCounter(){
        return this.getMostUsedWordPair().getValue();
    }

    public Map.Entry<String, Integer> getMostUsedWordPair(){
        HashMap.Entry<String, Integer> max = new AbstractMap.SimpleEntry<String, Integer>("", 0);

        for (HashMap.Entry<String, Integer> pair : wordsMap.entrySet())
        {
            if (pair.getValue() > max.getValue())
            {
                max = pair;
            }
        }
        return max;
    }

    public void wordsCounter(ArrayList<String> words){
        for (String word: words){
            word = word.toLowerCase();
            wordsMap.computeIfPresent(word, (key, value) -> value + 1);
            wordsMap.putIfAbsent(word, 1);
        }
    }

    public void wordsCounter(String word){
        word = word.toLowerCase();
        wordsMap.computeIfPresent(word, (key, value) -> value + 1);
        wordsMap.putIfAbsent(word, 1);
    }

    public void wordsCounterOutput(){
        String key;
        Integer value;

        for (HashMap.Entry<String, Integer> pair : wordsMap.entrySet()) {
            key = pair.getKey();
            value = pair.getValue();
            System.out.println(key + ": " + value);
        }
    }

    public String replaceSpace(char replacement, String text){
        return text.replace(' ', replacement);
    }
}
