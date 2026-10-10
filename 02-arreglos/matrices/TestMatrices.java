package mx.edu.Matrices;

public class TestMatrices {
    public static void main(String[] args) {
        Matriz a = new Matriz(2, 3);
        a.asignar(0, 0, 1); a.asignar(0, 1, 2); a.asignar(0, 2, 3);
        a.asignar(1, 0, 4); a.asignar(1, 1, 5); a.asignar(1, 2, 6);

        System.out.println(a.mostrar());
        System.out.println(a.obtenerTranspuesta().mostrar());
        System.out.println(a.reservaAsiento(0, 0));
        System.out.println(a.reporteVentas());
    }
}