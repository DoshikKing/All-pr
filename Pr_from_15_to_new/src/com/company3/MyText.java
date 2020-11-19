package com.company3;


import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MyText {
    private final HashMap<String, Integer> wordsMap;
    String[] charExeption = {"(", ")", ".", ",", "!", "?", "\"", ":", ";", "<", ">", "[", "]"};

    public MyText(){
        wordsMap = new HashMap<>();
    }

    public ArrayList<String> fromTextToArray(String text){
        ArrayList<String> words = new ArrayList<>();

        String[] buffArray = text.split(" ");
        StringBuilder buffWord;

        int ind;

        for (String word: buffArray) {
            if (!word.equals("—") && !word.equals("-") && !word.equals("")) {
                buffWord = new StringBuilder(word);

                for (String s : charExeption) {
                    ind = buffWord.indexOf(s);
                    if (ind != -1)
                        buffWord.deleteCharAt(ind);
                }

                word = buffWord.toString();
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
            if (pair.getValue() > max.getValue())
                max = pair;

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

    public String replaceSpacebar(char replacement, String text){
        return text.replace(' ', replacement);
    }

    public void tenMostUsedWords(){
        HashMap<String, Integer> buff = new HashMap<>();
        String buffKey = "";
        Integer buffValue = 0;

        for (int i = 0; i < 10; i++){
            buffValue = 0;
            for (HashMap.Entry<String, Integer> pair : wordsMap.entrySet()){
                if (!buff.containsKey(pair.getKey()) && pair.getValue() > buffValue){
                    buffKey = pair.getKey();
                    buffValue = pair.getValue();
                }
            }
            buff.put(buffKey, buffValue);
            System.out.println(i + 1 + ". \"" + buffKey + "\" " + buffValue);
        }
    }

    public void textReader(String path){
        try {
            FileReader fileReader = new FileReader(path);
            Scanner sc = new Scanner(fileReader);

            while (sc.hasNextLine())
                wordsCounter(fromTextToArray(sc.nextLine()));

            fileReader.close();
        }
        catch (IOException ignored){}
    }

    public void replaceSpacebarFile(String path){
        try {
            FileReader fileReader = new FileReader(path);
            FileWriter fileWriter = new FileWriter("/home/doshikking/JavaProjects/Java/Pr_from_15_to_new/src/com/company3/textout.txt");
            Scanner sc = new Scanner(fileReader);

            while (sc.hasNextLine())
                fileWriter.write(replaceSpacebar('#', sc.nextLine()));

            fileReader.close();
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException ignored){}
    }
}