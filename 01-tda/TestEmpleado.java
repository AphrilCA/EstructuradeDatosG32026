public class TestEmpleado {
    private static Empleado empl;

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        String numeroNomina = solicitarTexto("numero nomina");
        String nombre = solicitarTexto("Nombre completo");
        
        empl = new Empleado(numeroNomina,
                nombre,
                3400.56,
                true,
                "Masculino");
        imprimir ();
    }

    public static String solicitarTexto(String valor) {
        return JOptionPane.showInputDialog(null, "introduce el " + valor);
    }

    public static void imprimir() {
        String salida = "Datos del Empleado: " + empl.toString() +
                "Numero de objetos creados: \n" + Empleado.getContarObjetos();
        JOptionPane.showMessageDialog(null, salida);

    }
}