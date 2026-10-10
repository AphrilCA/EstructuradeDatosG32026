package mx.edu.Matrices;

public class Matriz {
    private int[][] m;

    public Matriz() {
        m = new int[2][2];
    }

    public Matriz(int fila, int columna) {
        if (validar(fila, columna)) {
            this.m = new int[fila][columna];
        } else {
            this.m = new int[2][2];
        }
    }

    private boolean validar(int fila, int columna) {
        boolean valido = true;
        if (fila <= 0 && columna <= 0) {
            valido = false;
        }
        return valido;
    }

    private boolean validarTamanos(int[][] m) {
        return this.m.length == m.length && this.m[0].length == m[0].length;
    }

    public void llenar(int[][] m) {
        if (validarTamanos(m)) {
            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[i].length; j++) {
                    this.m[i][j] = m[i][j];


                }

            }


        } else {
            System.out.println("La matrices son del mismo tamaño");
        }


    }

    public void imprimir() {
        for (int fila[] : this.m) {
            for (int valor : fila) {
                System.out.println(valor + " ");
            }
            System.out.println();


        }

    }

    public String obtenerTamanio() {
        return "Tamaño: (" + this.m.length + "," + this.m[0].length;

    }

    public Matriz obtenerTranspuesta() {

        Matriz objMatriz = null;


        if (validarCuadrada()) {
            int[][] transpuesta = new int[this.m.length][this.m.length];
            objMatriz = new Matriz(this.m.length, this.m.length);
            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[0].length; j++) {
                    transpuesta[j][i] = this.m[i][j];

                }
            }
            objMatriz.llenar(transpuesta);

        } else {
            System.out.println("Advertencia: la matriz no es cuadrada");


        }
        return objMatriz;
    }

    private boolean validarCuadrada() {
        /* En una matriz (bidimensional)
        m.length -> Numero de Filas
        m[0].length -> Numero de columnas
         */

        return m.length == m[0].length;
    }

    //reserva de asientos
    public String reservaAsiento(int fila, int columna) {
        if (fila < 0 || fila >= m.length || columna < 0 || columna >= m[0].length) {
            return "Coordenadas fuera de los límites de la matriz";
        }
        if (m[fila][columna] == 1) {
            return "El asiento ya está ocupado";
        }
        m[fila][columna] = 1;
        return "Asiento reservado con éxito";
    }

    //acumulado de ventas
    public int[] sumaPorFila() {
        int[] totales = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                totales[i] += m[i][j];
            }
        }
        return totales;
    }

    public int[] sumaPorColumna() {
        int[] totales = new int[m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                totales[j] += m[i][j];
            }
        }
        return totales;
    }

    public String reporteVentas() {
        int[] filas = sumaPorFila();
        int[] cols = sumaPorColumna();
        String r = "===== REPORTE DE VENTAS =====\n\n";
        for (int i = 0; i < filas.length; i++) {
            r += "Sucursal " + (i + 1) + ": " + filas[i] + "\n";
        }
        r += "\n";
        for (int j = 0; j < cols.length; j++) {
            r += "Mes " + (j + 1) + ": " + cols[j] + "\n";
        }
        return r;
    }

    //suma de la diagonal
    public boolean esCuadrada() {
        return m.length == m[0].length;
    }

    public boolean esIdentidad() {
        if (!esCuadrada()) return false;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j && m[i][j] != 1) return false;
                if (i != j && m[i][j] != 0) return false;
            }
        }
        return true;
    }

    public int sumaDiagonalPrincipal() {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][i];
        }
        return suma;
    }

    //transposicion de matriz
    public Matriz obtenerTtranspuesta() {
        Matriz t = new Matriz(m[0].length, m.length);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                t.m[j][i] = m[i][j];
            }
        }
        return t;
    }
    //rotacion 90 g
    public Matriz rotar90() {
        int n = m.length;
        Matriz r = new Matriz(n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r.m[j][n - 1 - i] = m[i][j];
            }
        }
        return r;
    }
    //imprimir las matrices
    public String mostrar() {
        String s = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                s += m[i][j] + "\t";
            }
            s += "\n";
        }
        return s;
    }
    public void asignar(int fila, int columna, int valor) {
        if (fila >= 0 && fila < m.length && columna >= 0 && columna < m[0].length) {
            m[fila][columna] = valor;
        }
    }
}

