package com.company;

import java.util.Scanner;

public abstract class Furniture
{
    private String name;
    private String ID;

    public String getName(){ return name; }
    public String getID(){ return ID; }

    public Furniture(String newID, String newName)
    {
        this.name = newName;
        this.ID = newID;
    }

    public abstract void displayInfo();
}

class Shell extends com.company.Furniture
{
    private String type;
    private String cells;
    public Shell(String newID, String newName, String newType, String newCells)
    {
        super(newID, newName);
        this.type = newType;
        this.cells = newCells;
    }

    public void displayInfo()
    {
        System.out.println("Name: " + super.getName() + "\nID: " + super.getID() + "\nType : " + type + "\nCells : " + cells);
    };
}
class Dish extends com.company.Furniture
{
    private String type;
    private String count;
    public Dish(String newID, String newName, String newType, String newCount)
    {
        super(newID, newName);
        this.type = newType;
        this.count = newCount;
    }

    public void displayInfo()
    {
        System.out.println("Name: " + super.getName() + "\nID: " + super.getID() + "\nType : " + type + "\nCount : " + count);
    };
}