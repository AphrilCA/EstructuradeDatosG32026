package mx.edu.arreglos.vectores;
import javax.swing.*;

public class Vectores {
    private int[] vector;
    private int[] vector2;
    private int tamanio;
    private int tamanio2;

    public Vectores() {
        this.vector = new int[2];
        this.vector2 = new int[2];
        this.tamanio = vector.length;
        this.tamanio2 = vector2.length;
    }

    public Vectores(int tamanio) {
        this.vector = validarTamanio(tamanio) ? new int[tamanio] : new int[2];
        this.tamanio = this.vector.length;
    }

    private boolean validarTamanio(int tamanio) {
        return tamanio > 0;
    }

    private boolean sonIguales(int[] vector) {
        return this.vector.length == vector.length;
    }

    public void llenarVector(int[] vector) {
        if (sonIguales(vector)) {
            for (int i = 0; i < this.vector.length; i++) {
                this.vector[i] = vector[i];
            }
        } else {
            System.out.println("Los vectores no son del mismo tamaño");
        }
    }

    public int sumarValores() {
        int suma = 0;
        for (int i = 0; i < this.vector.length; i++) {
            suma += this.vector[i];
        }
        return suma;
    }

    public int obtenerTamanio() {
        return this.tamanio;
    }

    public String imprimir() {
        String salida = "";
        for (int valor : this.vector) {
            salida += valor + " ";
        }
        return salida;
    }

    // SUMAR LOS DATOS DE VALOR DE INSTANCIA
    public String sumarDosVectores(int tamanio2) {

        // tamaño del vector 2
        this.vector2 = validarTamanio(tamanio2) ? new int[tamanio2] : new int[2];
        int vector[] = new int[tamanio2];
        int[] resultado = new int[vector.length];

        // llenar los valores de cada posición del vector 2
        int valor = 0;
        for (int i = 0; i < vector2.length; i++) {

            do {
                try {
                    valor = Integer.parseInt(
                            JOptionPane.showInputDialog("Intriduce el valor " + (i + 1))
                    );
                    vector[i] = valor;
                    break;

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "El valor debe ser un numero");
                }

            } while (true);
        }

        this.vector2 = vector;

        // sumar los valores de ambos vectores
        for (int i = 0; i < this.vector.length; i++) {
            resultado[i] = this.vector[i] + vector2[i];
        }

        String salida = "";
        for (int valorImprimir : resultado) {
            salida += valorImprimir + " ";
        }

        return salida;

        // Sumar Vector 1 y 2
    }

    // pares
    public String VectorPares() {

        String Salida = "";
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                Salida += vector[i] + " ";
            }
        }

        return Salida;
    }

    // impares
    public String VectorImpares() {

        String Salida = "";
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 != 0) {
                Salida += vector[i] + " ";
            }
        }

        return Salida;
    }

    // Promedio de los valores del Vector
    public double VectorPromedio() {
        int resultado = sumarValores();
        return resultado / vector.length;
    }

    // Valor Mayor
    public int VectorMayorValor() {
        int mayor = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }

        return mayor;
    }

    // Valor menor
    public int VectorMenorValor() {
        int menor = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }

        return menor;
    }

    // BUSCAR VALOR
    public String Buscar(int dato) {
        int posicion = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == dato) {
                posicion = i;
            }
        }

        return "Dato: " + vector[posicion] + " Posición: " + posicion;
    }
}

