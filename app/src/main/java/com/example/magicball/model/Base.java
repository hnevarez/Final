package com.example.magicball.model;

import java.util.ArrayList;

public class Base extends MagicObj
{

    public Base()
    {
        setName("Magic Eight Ball");
    }



    public void fillGood()
    {
        good.add("It is certain.");
        good.add("It is decidedly so.");
        good.add("Without a doubt");
        good.add("Yes, definitely");
        good.add("You may rely on it");
        good.add("As I see it yes.");
        good.add("Most likely");
        good.add("Outlook good");
        good.add("Yes");
        good.add("Signs point to yes");
    }
       /*
     It is certain.
● It is decidedly so.
● Without a doubt.
● Yes - definitely.
● You may rely on it.
● As I see it, yes.
● Most likely.
● Outlook good.
● Yes.
● Signs point to yes.
     */


    public void fillNeutral()
    {
        neutral.add("It is certain.");
        neutral.add("It is decidedly so.");
        neutral.add("Without a doubt");
        neutral.add("Yes, definitely");
        neutral.add("You may rely on it");
    }

    public void fillBad()
    {
        bad.add("It is certain.");
        bad.add("It is decidedly so.");
        bad.add("Without a doubt");
        bad.add("Yes, definitely");
        bad.add("You may rely on it");
    }



    @Override
    public String toString()
    {
        return  super.toString();
    }
}


/*
Use for custom
   public void Fill(ArrayList pick, int size,String input)
    {
        for(int i=0; i<size-1;i++)
        {
            pick.add(input);
        }

    }
 */