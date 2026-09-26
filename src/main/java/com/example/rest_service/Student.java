package com.example.rest_service;

public class Student {
    private long id;
    private String name;
    private String branch;

    public Student(){

    }

    public Student(long id, String name, String branch){
        this.id = id;
        this.name=name;
        this.branch = branch;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
