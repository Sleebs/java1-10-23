package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void Fibonacci (int first, int second){
        if(second > 1000) return;
        System.out.println(second);
        Fibonacci(second, first + second);
    }
    public static void main( String[] args )
    {
        Fibonacci(1,1);
        //System.out.println( "Hello World!" );
    }
}
