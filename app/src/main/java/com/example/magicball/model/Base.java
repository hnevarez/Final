package com.example.magicball.model;

import java.util.ArrayList;

public class Base extends MagicObj
{

    public Base()
    {
        setName("Magic Eight Ball");
        fillGood();
        fillBad();
        fillNeutral();
    }

    private void fillGood()
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

    private void fillNeutral()
    {
        neutral.add("Reply hazy, try again.");
        neutral.add("Ask again later.");
        neutral.add("Better not tell you now.");
        neutral.add("Cannot predict now.");
        neutral.add("Concentrate and ask again.");
    }

    private void fillBad()
    {
        bad.add("Don't count on it.");
        bad.add("My reply is no.");
        bad.add("My sources say no.");
        bad.add("Outlook not so good.");
        bad.add("Very doubtful.");
    }



    @Override
    public String toString()
    {
        return  super.toString();
    }
}
