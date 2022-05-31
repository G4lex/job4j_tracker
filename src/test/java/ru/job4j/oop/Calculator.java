package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation() {
        return sum(4) + multiply(5) + minus(6) + divide(7);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        Calculator allsum = new Calculator();
        int sum = allsum.sumAllOperation();
        System.out.println(sum);
        int min = minus(5);
        System.out.println(min);
        Calculator div = new Calculator();
        int divide = div.divide(5);
        System.out.println(divide);
    }
}