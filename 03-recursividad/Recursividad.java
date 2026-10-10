package Recursividad;

public class Recursividad {

    public static void saludar1(int n) {
        // Caso Base
        if (n == 1) {
            System.out.println("Hola saludo " + n);
        } else {
            // Caso General
            saludar1(n - 1);
            System.out.println("Hola saludo " + n);
        }
    }

    public static void saludar2(int n) {
        if (n != 1) {
            // Caso General
            System.out.println("Hola saludo " + n);
            saludar1(n - 1);
        } else {
            // Caso Base
            System.out.println("Hola saludo " + n);
        }
    }

    public static void saludar3(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("Hola saludo " + n);
        saludar3(n - 1);
    }

    public static int sumar(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumar(n - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiplicar(a, b - 1);
        }
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}
