package com.example.q.myapplication;
import java.lang.String;
/**
 * Created by q on 18.02.2017.
 */

public class X_O
{
    private String Name1;
    private String Name2;
    private String []fild = new String[9];
    protected void getName1(String name)
    {
        Name1 = name;
    }
    protected void getName2(String name)
    {
        Name2 = name;
    }
    protected void getFild(String []mass)
    {
        fild = mass;
    }
    protected String win_player()
    {
        //по горизонталі
        if (fild[0].equals(fild[1])&& fild[0].equals(fild[2]) && fild[2].equals("X"))
        {
            return this.Name1 + " win";
        }
        else if(fild[0].equals(fild[1]) && fild[0].equals(fild[2]) && fild[2].equals("0"))
        {
            return this.Name2 + " win";
        }
        else if (fild[3].equals(fild[4]) && fild[3].equals(fild[5]) && fild[5].equals("0"))
        {
            return this.Name2 + " win";
        }
        else if (fild[3].equals(fild[4]) && fild[3].equals(fild[5]) && fild[5].equals("X"))
        {
            return this.Name1 + " win";
        }
        else if (fild[6].equals(fild[7]) && fild[6].equals(fild[8]) && fild[8].equals("X"))
        {
            return this.Name1 + " win";
        }
        else if (fild[6].equals(fild[7]) && fild[6].equals(fild[8]) && fild[8].equals("0"))
        {
            return this.Name2 + " win";
        }
        //по вертикалі
        else if (fild[0].equals(fild[3]) && fild[0].equals(fild[6]) && fild[6].equals("X"))
        {
            return this.Name1 + " win";
        }
        else if (fild[0].equals(fild[3]) && fild[0].equals(fild[6]) && fild[6].equals("0"))
        {
            return this.Name2 + " win";
        }
        else if (fild[1].equals(fild[4]) && fild[1].equals(fild[7]) && fild[7].equals("0"))
        {
            return this.Name2 + " win";
        }
        else if (fild[1].equals(fild[4]) && fild[1].equals(fild[7]) && fild[7].equals("X"))
        {
            return this.Name1 + " win";
        }
        else if (fild[2].equals(fild[5]) && fild[2].equals(fild[8]) && fild[8].equals("X"))
        {
            return this.Name1 + " win";
        }
        else if (fild[2].equals(fild[5]) && fild[2].equals(fild[8]) && fild[8].equals("0"))
        {
            return this.Name2 + " win";
        }
        //по діагоналі
        else if (fild[0].equals(fild[4]) && fild[0].equals(fild[8]) && fild[8].equals("X"))
        {
            return this.Name1 + " win";
        }
        else if (fild[0].equals(fild[4]) && fild[0].equals(fild[8]) && fild[8].equals("0"))
        {
            return this.Name2 + " win";
        }
        else if (fild[2].equals(fild[4]) && fild[2].equals(fild[6]) && fild[6].equals("0"))
        {
            return this.Name2 + " win";
        }
        else if (fild[2].equals(fild[4]) && fild[2].equals(fild[6]) && fild[6].equals("X"))
        {
            return this.Name1 + " win";
        }
        else
        {
            return "no win";
        }
    }
}
