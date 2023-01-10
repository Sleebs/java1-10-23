package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{

    public static int randomInt(int max, int min){
        int range = max-min + 1;
        return min + (int) (Math.random() * range);
    }
    public static void main( String[] args )
    {
        int []arr = new int[10];
        for(int i= 0; i< arr.length; i++) {
            arr[i] = randomInt(0,19);
        }
        int pari = 0, dispari = 0;
        for(int n: arr) {
            if (n%2==0){
                pari += n;
            }else {
                dispari += n;
            }
            System.out.println(n);
        }
        if (pari == dispari){
            System.out.println("Pari e dispari uguali");
        } else {
            System.out.println("Pari e dispari diversi");
    }
    }
}
