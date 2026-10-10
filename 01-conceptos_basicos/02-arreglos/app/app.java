package mx.edu.app;
import mx.edu.menu.Menu;
import mx.edu.arreglos.ArregloMenu;
import  javax.swing.*;


public class app {
    public static void main(String[] args) {
        iniciar();
    }
    public static void iniciar(){
        String opcion;
        do{
            opcion = Menu.menuPrincipal();
            switch (opcion) {
                case "1":
                    ArregloMenu.mostrar();
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, "Listas");
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, "Pilas");
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, "Colas");
                    break;

                case "5":
                    JOptionPane.showMessageDialog(null, "Arboles");
                    break;

                case "0":
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                    return;
                default: JOptionPane.showMessageDialog(null, "Opción no valida");

            }
        } while (true);
    }
}

