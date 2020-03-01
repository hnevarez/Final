package com.example.magicball.model;

import java.util.ArrayList;

public class Custom extends MagicObj
{

    public Custom(String name)
    {
        setName(name);
    }
   public void Fill(ArrayList pick, int size, String input)
    {
        for(int i=0; i<size-1;i++)
        {
            pick.add(input);
        }

    }
 }
