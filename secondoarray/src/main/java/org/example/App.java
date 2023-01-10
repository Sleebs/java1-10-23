package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static int[] arrayShuffle(int[]a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            int randomIndexToSwap = rand.nextInt(a.length);
            int temp = a[randomIndexToSwap];
            a[randomIndexToSwap] = a[i];
            a[i] = temp;
        }
        return a;
    }
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println( "Inserire dieci valori numerici" );
        int []arr = new int[10];
        int count = 0;
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = in.nextInt();
            if (arr[i] >= 0) count++;
        }
        //System.out.println(Arrays.toString(arr));

        int [] intArray = new int [count];
        for(int i = 0, j = 0; i <arr.length; i++){
            if (arr[i] >= 0) {
                intArray[j] = arr[i];
                j++;
            }
        }
        intArray = arrayShuffle(intArray);
        System.out.println(Arrays.toString(intArray));

    }
}
