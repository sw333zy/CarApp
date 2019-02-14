package com.company;
//part of composition exercise
public abstract class Person{
    //person has a name and a title the title will end up coming from driver.java
    private String name;
    private String title;

    public Person(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
