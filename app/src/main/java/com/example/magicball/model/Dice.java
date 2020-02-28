package com.example.magicball.model;

import java.util.Random;

public class Dice
{
    Random gen= new Random();

    public int roll20()
    {
        return gen.nextInt(21)+1;
    }

}
