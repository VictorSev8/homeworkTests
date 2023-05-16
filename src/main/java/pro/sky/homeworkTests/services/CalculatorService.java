package pro.sky.homeworkTests.services;

import org.springframework.stereotype.Service;
import pro.sky.homeworkTests.exceptions.MyIllegalArgumentException;
@Service
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
