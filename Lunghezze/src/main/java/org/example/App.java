package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire String andando a capo ad ogni singola stringa");
        System.out.println("per terminare andare a capo vuoto");
        int finalString = 0;
        while(true){
            String txt = in.nextLine();
            if(txt == "") break;
            if (Character.isUpperCase(txt.toCharArray()[0]))
                finalString+=txt.length();
        }
        System.out.println(finalString);
    }
}
