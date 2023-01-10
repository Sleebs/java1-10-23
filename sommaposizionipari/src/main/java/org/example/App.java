package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int  sommaElemPari( int []arr) {
        int tot = 0;
        for(int i = 0; i < arr.length; i++) {
            if( i%2==0)
                tot += arr[i];
        }
        return tot;
    }
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("inserire lunghezza vettore");
        int length = in.nextInt();
        int [] arr = new int[length];
        System.out.println("inserire i valori");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("LA SOMMA DEGLI ELEMENTI PARI: " + sommaElemPari(arr));
    }
}
