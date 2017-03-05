package com.nasir;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(5,10));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(5,10));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(5, 10));
    }
}
