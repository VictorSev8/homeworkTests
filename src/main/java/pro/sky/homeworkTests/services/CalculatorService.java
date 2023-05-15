package pro.sky.homeworkTests.services;

import pro.sky.homeworkTests.exceptions.MyIllegalArgumentException;

public class CalculatorService {
    public int plus(int a, int b) {
        return a + b;
    }
    public int minus(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        if (b==0) {
            throw new MyIllegalArgumentException("Делить на ноль нельзя!");
        }
        return a / b;
    }
}
