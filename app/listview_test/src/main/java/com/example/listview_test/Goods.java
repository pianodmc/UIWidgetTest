package com.example.listview_test;

public class Goods {

    private int id;
    private String name;
    private String price;

    public Goods(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Goods(String name, int id, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
