package com.example.springDemo.bean;

public class Dog {
    private String name;
    private int id;

    public Dog(){

    }
    public Dog(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
