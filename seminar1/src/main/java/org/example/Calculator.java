package org.example;

public class Calculator {

    // Метод для сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для деления двух чисел. Генерирует исключение, если делитель равен нулю.
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Делитель не может быть равен нулю");
        }
        return (double) a / b;
    }

    // ... другие методы, которые вы хотите протестировать

    public double calculateDiscount(double price, double skidka) {
        if (price < 0 || skidka < 0 || skidka > 100) {
            throw new ArithmeticException("некорректное значение");
        }
        double cost = price * (skidka / 100);
        return price - cost;
    }


}
