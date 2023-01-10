package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static String soloVocale(String txt) {
        String temp ="";
        for ( char c: txt.toCharArray()) {
            if("aeiou".contains(c+""))
                temp+=c;
        }
        return temp;
    }
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("inserire la string in cui trovare le vocali");
        String txt = in.nextLine();
        System.out.println( soloVocale(txt.toLowerCase()) );
    }
}
