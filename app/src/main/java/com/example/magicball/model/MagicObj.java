package com.example.magicball.model;

import java.util.ArrayList;

public class MagicObj
{
    private String name;
    protected  ArrayList<String> good= new ArrayList<>(); // holds 10
    protected  ArrayList<String> neutral= new ArrayList<>(); //holds 5
    protected  ArrayList<String>  bad= new ArrayList<>(); //holds 5


    public void MagicObj(String name)
    {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createRandom()
    {

    }

    public String toString()
    {
        return "You are using: "+name;
    }






}

