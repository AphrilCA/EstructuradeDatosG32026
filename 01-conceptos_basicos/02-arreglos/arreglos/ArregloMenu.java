package mx.edu.arreglos;
import mx.edu.arreglos.vectores.Vectores;
import mx.edu.menu.Menu;
import mx.edu.Matrices.Matriz;
import Recursividad.Recursividad;

import javax.swing.*;

public class ArregloMenu {
    private static Vectores objvector; //instancia de la clase vectores
    private static Matriz objmatriz;   //instancia de la clase matriz

    private static void inicializar() {
        int tamanio = 0;
        do {
            try {
                tamanio = Integer.parseInt(JOptionPane.showInputDialog("Intriduce el tamaño del arreglo"));
                objvector = new Vectores((tamanio));
                return;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El tamaño debe ser un numero");
            }
        } while (true);
    }

    private static void inicializarMatriz() {
        do {
            try {
                int filas = Integer.parseInt(JOptionPane.showInputDialog("Número de filas"));
                int cols = Integer.parseInt(JOptionPane.showInputDialog("Número de columnas"));
                objmatriz = new Matriz(filas, cols);
                return;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debe ser un número");
            }
        } while (true);
    }

    public static void mostrar() {
        String opcion;
        do {
            opcion = Menu.menuArreglos();
            switch (opcion) {
                case "1":
                    menuVectores();
                    break;

                case "2":
                    menuMatrices();
                    break;

                case "3":
                    menuRecursividad();
                    break;

                case null:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida");
            }
        } while (true);
    }

    public static int[] obtenerVector() {
        int tamanio = objvector.obtenerTamanio();
        int vector[] = new int[tamanio];
        llenarVector((vector));
        return vector;
    }

    private static void llenarVector(int[] vector) {
        int valor = 0;
        for (int i = 0; i < vector.length; i++) {

            do {
                try {
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Intriduce el valor " + (i + 1)));
                    vector[i] = valor;
                    break;

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "El tamaño debe ser un numero");
                }

            } while (true);
        }
    }

    public static void menuVectores() {
        String opcion;
        String Arreglo;
        int valorMayor;
        int valorMenor;
        Double promedioArreglo;
        inicializar();
        do {
            opcion = Menu.menuVectores();
            switch (opcion) {
                case "1":
                    JOptionPane.showMessageDialog(null, objvector.sumarValores());
                    break;
                case "2":
                    objvector.llenarVector(obtenerVector());
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, objvector.imprimir());
                    objvector.imprimir();
                    break;

                case "4":
                    int tamanio2 = Integer.parseInt(JOptionPane.showInputDialog("Intriduce el tamaño del arreglo"));
                    Arreglo = objvector.sumarDosVectores(tamanio2);
                    JOptionPane.showMessageDialog(null, Arreglo);
                    break;
                case "5":
                    Arreglo = objvector.VectorPares();
                    JOptionPane.showMessageDialog(null, Arreglo);
                    break;
                case "6":
                    Arreglo = objvector.VectorImpares();
                    JOptionPane.showMessageDialog(null, Arreglo);
                    break;
                case "7":
                    promedioArreglo = objvector.VectorPromedio();
                    JOptionPane.showMessageDialog(null, promedioArreglo.toString());
                    break;
                case "8":
                    valorMayor = objvector.VectorMayorValor();
                    JOptionPane.showMessageDialog(null, valorMayor);
                    break;
                case "9":
                    valorMenor = objvector.VectorMenorValor();
                    JOptionPane.showMessageDialog(null, valorMenor);
                    break;
                case "10":
                    int Dato = Integer.parseInt(JOptionPane.showInputDialog("Intriduce el valor a buscar"));
                    Arreglo = objvector.Buscar(Dato);
                    JOptionPane.showMessageDialog(null, Arreglo);
                    break;
                default:

            }
        } while (true);

    }

    public static void menuMatrices() {
        inicializarMatriz();
        String opcion;
        do {
            opcion = Menu.menuMatrices();
            switch (opcion) {
                case "1": // Reserva de asientos
                    try {
                        int f = Integer.parseInt(JOptionPane.showInputDialog("Fila"));
                        int c = Integer.parseInt(JOptionPane.showInputDialog("Columna"));
                        JOptionPane.showMessageDialog(null, objmatriz.reservaAsiento(f, c));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Debe ser un número");
                    }
                    break;

                case "2": // Acumulado de ventas
                    JOptionPane.showMessageDialog(null, objmatriz.reporteVentas());
                    break;

                case "3": // Matriz identidad
                    if (!objmatriz.esCuadrada()) {
                        JOptionPane.showMessageDialog(null, "La matriz no es cuadrada");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "¿Es matriz identidad? " + objmatriz.esIdentidad());
                    }
                    break;

                case "4": // Diagonal principal
                    if (!objmatriz.esCuadrada()) {
                        JOptionPane.showMessageDialog(null, "La matriz no es cuadrada");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Suma de la diagonal principal: " + objmatriz.sumaDiagonalPrincipal());
                    }
                    break;

                case "5": // Transposición
                    JOptionPane.showMessageDialog(null,
                            "Original:\n" + objmatriz.mostrar()
                                    + "\nTranspuesta:\n" + objmatriz.obtenerTranspuesta().mostrar());
                    break;

                case "6": // Rotación 90°
                    Matriz rotada = objmatriz.rotar90();
                    if (rotada == null) {
                        JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada (N*N) para rotarla");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Original:\n" + objmatriz.mostrar() + "\nRotada 90°:\n" + rotada.mostrar());
                    }
                    break;

                case "7": // Llenar matriz
                    try {
                        int fila = Integer.parseInt(JOptionPane.showInputDialog("Fila"));
                        int col = Integer.parseInt(JOptionPane.showInputDialog("Columna"));
                        int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
                        objmatriz.asignar(fila, col, valor);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Debe ser un número");
                    }
                    break;
                case "0":
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida");
            }
        } while (true);
    }


    public static void menuRecursividad() {
        String opcion;
        int n, a, b, base, exponente;

        do {
            opcion = Menu.menuRecursivo();

            if (opcion == null) {
                return;
            }

            switch (opcion) {
                case "1":
                    n = Integer.parseInt(
                            JOptionPane.showInputDialog("Introduce n"));

                    JOptionPane.showMessageDialog(
                            null, Recursividad.sumar(n));
                    break;

                case "2":
                    n = Integer.parseInt(
                            JOptionPane.showInputDialog("Introduce el número"));

                    JOptionPane.showMessageDialog(
                            null, Recursividad.factorial(n));
                    break;

                case "3":
                    a = Integer.parseInt(
                            JOptionPane.showInputDialog("Introduce el primer número"));

                    b = Integer.parseInt(
                            JOptionPane.showInputDialog("Introduce el segundo número"));

                    JOptionPane.showMessageDialog(
                            null, Recursividad.multiplicar(a, b));
                    break;

                case "4":
                    base = Integer.parseInt(
                            JOptionPane.showInputDialog("Introduce la base"));

                    exponente = Integer.parseInt(
                            JOptionPane.showInputDialog("Introduce el exponente"));

                    JOptionPane.showMessageDialog(
                            null, Recursividad.potencia(base, exponente));
                    break;

                case "0":
                    return;

                default:
                    JOptionPane.showMessageDialog(
                            null, "Opción no válida");
            }

        } while (true);
    }
}
