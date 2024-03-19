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
    }

    // Méthode sinus
    public static double sin(int a) {
        return Math.sin(a);
    }

    // Méthode cosinus
    public static double cos(int a) {
        return Math.cos(a);
    }

    // Méthode tangente
    public static double tan(int a) {
        return Math.tan(a);
    }

    // Méthode moyenne
    public static double moyenne(double[] numbers){
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static double valeur_absolue(int a){
        return Math.abs(a);
    }

    public static double exponentiel (int a){
        return Math.exp(a);
    }

    public static double racine_carree(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Erreur: impossible de calculer la racine carrée d'un nombre négatif");
        } else {
            return Math.sqrt(a);
        }
    }
}


