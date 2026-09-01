public class Empleado {
    //variables de instancia
    private String numeroNomina;
    private String nombre;
    private String sexo;
    private double sueldo;
    private boolean activo;
    private static int contarObjetos;

    //sobrecarga de constructores
    public Empleado() {
        contarObjetos++;
    }

    public Empleado(String numeroNomina, String sexo, double sueldo, boolean activo, String nombre) {
        this.numeroNomina = numeroNomina;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.activo = activo;
        this.nombre = nombre;
        contarObjetos++;
    }

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public void setNumeroNomina(String numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
public static int getContarObjetos(){
        return Empleado.contarObjetos;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("numeroNomina='").append(numeroNomina).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", sueldo=").append(sueldo);
        sb.append(", activo=").append(activo);
        sb.append('}');
        return sb.toString();
    }
}
