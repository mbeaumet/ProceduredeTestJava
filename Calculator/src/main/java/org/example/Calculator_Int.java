package org.example;

public class Calculator_Int {

    // Méthode d'addition
    public static int addition(int a, int b) {
        return a + b;
    }

    // Méthode de soustraction
    public static int soustraction(int a, int b) {
        return a - b;
    }

    // Méthode de multiplication
    public static double multiplication(int a, int b) {
        return a * b;
    }

    // Méthode de division
    public static double division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division par zéro impossible");
        }
    }}
