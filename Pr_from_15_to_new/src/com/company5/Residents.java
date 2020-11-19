package com.company5;


public class Residents {
    private String inn_id;
    private String NSL;
    int money;

    public Residents(String new_inn_id, String NSL, int money) {
        this.inn_id = new_inn_id;
        this.NSL = NSL;
        this.money = money;
    }

    public String  getINN() {
        return inn_id;
    }

    public String getNSL() {
        return NSL;
    }
}