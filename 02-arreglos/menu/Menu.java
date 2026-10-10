package mx.edu.menu;

import javax.swing.*;

public class Menu {
    public static String menuPrincipal() {  //static: metodo de clase,  no de instancia
        String opciones =
                "=========ESTRUCTURA DE DATOS============\n\n" +
                        "1)Arreglos\n" +
                        "2)Listas\n" +
                        "3)Listas\n" +
                        "4)Colas\n" +
                        "5)Arboles\n" +
                        "0)salir\n" +
                        "Seleccione una opcion";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuArreglos() {
        String opciones =
                "=========ARREGLOS============\n\n" +
                        "1)Vectores\n" +
                        "2)Matrices\n" +
                        "3)Recursividad\n" +
                        "0)Regresar\n" +
                        "Seleccione una opcion";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuVectores() {
        String opciones =
                "=========VECTORES============\n\n" +
                        "1)Sumar elementos del vector\n" +
                        "2)Llenar vector \n" +
                        "3)Imprimir \n" +
                        "4)Sumar con otro vector \n" +//es uno de los metodos
                        "5)Obtener pares del arreglo \n" +
                        "6)Obtener los impares del arreglo \n" +
                        "7)Promedio de los valores del vector \n" +
                        "8)Valor mayor \n" +
                        "9) Valor menor \n" +
                        "10)Buscar valor \n" +
                        "0)Regresar\n" +
                        "Seleccione una opcion";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuMatrices() {
        String opciones =
                "=========MATRICES============\n\n" +
                        "1)Reserva de asientos\n" +
                        "2)Acumulado de ventas\n" +
                        "3)Matriz identidad\n" +
                        "4)Diagonal principal\n" +
                        "5)Transposición\n" +
                        "6)Rotación\n" +
                        "7)Llenar matriz\n" +
                        "0)Regresar\n" +
                        "Seleccione una opcion";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuRecursivo() {
        String opciones =
                "===================RECURSIVIDAD===================\n\n" +
                        "1) Sumar numeros de 1 a n (se vale el 1)\n" +
                        "2)Factorial de un numero\n" +
                        "3)Multiplicación mediante sumas\n" +
                        "4)Potencia mediante multiplicación" +
                        "0)Regresar\n" +
                        "Seleccione una opcion";
        return JOptionPane.showInputDialog(opciones);
    }

    //Menu de listas
    public static String menuListas() {
        return "";
    }

    //Menu de colas
    public static String menuColas() {
        return "";
    }

    //Menu pilas
    public static String menuPilas() {
        return "";
    }

    //Menu arboles
    public static String menuarboles() {
        return "";
    }
}