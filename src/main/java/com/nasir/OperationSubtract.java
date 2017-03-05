package com.nasir;

/**
 * Created by nasir on 5/3/17.
 */
public class OperationSubtract implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1>num2 ? num1-num2 : num2-num1;
    }
}
