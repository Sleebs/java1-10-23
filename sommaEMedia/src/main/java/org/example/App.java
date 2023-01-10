package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Scanner in = new Scanner(System.in);

    public static int[] newIntArray(int length) {
     int [] arr = new int[length];
     for (int i = 0; i < arr.length; i++){

         arr[i] = in.nextInt();
     }
        return arr;
    }

    public static int somma (int []arr) {
        int temp = 0;
        for(int n : arr) {
            temp += n;
        }
        return temp;
    }
    public static void main( String[] args )
    {

        System.out.println( "Inserire la lunghezza Array desiderata" );
        int length = in.nextInt();
        int []arr = newIntArray(length);
        System.out.println("la somma dei valori e': " + somma(arr));
        System.out.println("la media dei valori e': " + somma(arr)/ length);
    }
}
