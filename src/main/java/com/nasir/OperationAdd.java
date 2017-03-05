package com.nasir;

/**
 * Created by nasir on 5/3/17.
 */
public class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
