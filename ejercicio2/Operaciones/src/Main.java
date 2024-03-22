import java.util.Scanner;

import Class.ManejadorMenu;
import Class.MenuCalcularResultado;
import Class.MenuSalir;
import Class.MenuVerificarPrimo;
import Class.OperacionesMatematicas;
import Class.Ordenamiento;
import Interfaces.MenuOpcion;

/**
 * La clase Main es la clase de entrada para la aplicación.
 * Crea y ordena dos arreglos, uno de números enteros y otro de cadenas de caracteres.
 * Luego, muestra un menú al usuario y ejecuta la opción seleccionada por el usuario.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear dos arreglos, uno de números enteros y otro de cadenas de caracteres
        int[] numeros = {1, 9, 23, 4, 55, 100, 1, 1, 23};
        String[] nombres = {"Leon", "Chris", "Jill", "Wesker", "Ada"};

        // Crear una instancia de OperacionesMatematicas y Ordenamiento
        OperacionesMatematicas operaciones = new OperacionesMatematicas();
        Ordenamiento ordenamiento = new Ordenamiento();

        // Aplicar el método de ordenamiento burbuja a los arreglos
        ordenamiento.burbuja(numeros);
        ordenamiento.burbujas(nombres);

        // Crear las opciones del menú
        MenuOpcion[] opcionesMenu = {
            new MenuVerificarPrimo(operaciones, ordenamiento, sc),
            new MenuCalcularResultado(operaciones, sc),
            new MenuSalir()
        };

        // Crear una instancia de ManejadorMenu y ejecutar el menú
        ManejadorMenu manejadorMenu = new ManejadorMenu(opcionesMenu, sc);
        manejadorMenu.ejecutarMenu();

        // Cerrar el scanner
        sc.close();
    }
}