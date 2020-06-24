package com.ofss.MyApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Calculator" );
        Calculator calc = new Calculator();
        System.out.println( "Add"+calc.add(10,20) );
    }
}
