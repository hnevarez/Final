package com.example.magicball.model;

import java.util.ArrayList;

public class MagicObj
{
    private String name;
    protected ArrayList<String> good= new ArrayList<>(); // holds 10
    protected ArrayList<String> neutral= new ArrayList<>(); //holds 5
    protected ArrayList<String>  bad= new ArrayList<>(); //holds 5


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

    public void createRandom(int roll)
    {
        switch (roll)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:{
                System.out.println(good.get(roll-1));
                break;
            }
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:{
                System.out.println(neutral.get(roll-11));
                break;
            }
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:{
                System.out.println(bad.get(roll-16));
                break;
            }
        }

    }

    public String toString()
    {
        return "You are using: "+name;
    }






}

