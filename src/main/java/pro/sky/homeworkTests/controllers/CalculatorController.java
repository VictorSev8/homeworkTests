package pro.sky.homeworkTests.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homeworkTests.services.CalculatorService;

@RestController
@RequestMapping
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/calculator")
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") Integer x, @RequestParam("num2") Integer y) {
        return String.format("%d + %d = %d", x, y, service.plus(x, y));
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") Integer x, @RequestParam("num2") Integer y) {
        return String.format("%d - %d = %d", x, y, service.minus(x, y));
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") Integer x, @RequestParam("num2") Integer y) {
        return String.format("%d * %d = %d", x, y, service.mul(x, y));
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Integer x, @RequestParam("num2") Integer y) {
        return String.format("%d / %d = %d", x, y, service.div(x, y));
    }
}


