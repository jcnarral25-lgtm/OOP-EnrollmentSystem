package org.example.model;


public abstract class Person {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String getRole();

    public String getID() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}