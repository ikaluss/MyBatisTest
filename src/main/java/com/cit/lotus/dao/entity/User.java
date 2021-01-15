package com.cit.lotus.dao.entity;

public class User {
    private Integer ID;
    private String NAME1;
    private Integer AGE;

    public int getID(){
        return ID;
    }

    public void setID(int id){
        this.ID = id;
    }

    public String getNAME1(){
        return NAME1;
    }

    public void setNAME1(String name1){
        this.NAME1 = name1;
    }

    public int getAGE(){
        return AGE;
    }

    public void setAGE(int age){
        this.AGE = age;
    }
}
