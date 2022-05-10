package io.jitpack;

import org.apache.commons.collections.ArrayStack;

/**
 * Hello world!
 *
 */
public class App2T
{
    public static String GREETING = "Hello World!";
    
    public static void main( String[] args )
    {
        System.out.println( GREETING );
        ArrayStack bla = new ArrayStack();
        bla.empty();
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
