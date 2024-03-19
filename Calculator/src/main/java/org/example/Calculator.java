package org.example;

public class Calculator {

    // Méthode d'addition
    public static double addition(double a, double b) {
        return a + b;
    }

    // Méthode de soustraction
    public static double soustraction(double a, double b) {
        return a - b;
    }

    // Méthode de multiplication
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // Méthode de division
    public static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division par zéro impossible");
        }
    }}

