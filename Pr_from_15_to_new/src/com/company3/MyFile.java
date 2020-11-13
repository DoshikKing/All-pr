package com.company3;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
    private final String path;

    public MyFile(String path){
        this.path = path;
    }

    public void write(String end, boolean append){
        try {
            FileWriter fileWriter = new FileWriter(path, append);
            String line;
            boolean first = false;
            Scanner sc = new Scanner(System.in);

            line = sc.nextLine();
            while (!line.equals(end)) {
                if (first)
                    fileWriter.write("\n");
                fileWriter.write(line);
                line = sc.nextLine();
                first = true;
            }

            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException ignored){}
    }

//    public void reWrite(String end){
//        try {
//            FileWriter fileWriter = new FileWriter(path, false);
//            String line = "";
//            Scanner sc = new Scanner(System.in);
//
//            line = sc.nextLine();
//            while (!line.equals(end)) {
//                fileWriter.write(line);
//                line = sc.nextLine();
//            }
//            fileWriter.flush();
//            fileWriter.close();
//        }
//        catch (IOException ex){}
//    }

    public void output() {
        try {
            FileReader fileReader = new FileReader(path);
            Scanner sc = new Scanner(fileReader);

            System.out.print("\"");
            while (sc.hasNextLine()) {
                System.out.print(sc.nextLine());
                if (sc.hasNextLine())
                    System.out.print("\n");
                else
                    System.out.print("\"");
            }

            fileReader.close();
        }
        catch (IOException ignored){}
    }
}