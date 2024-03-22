package Class;

import java.util.Scanner;
import Interfaces.MenuOpcion;

/**
 * La clase ManejadorMenu se encarga de gestionar un menú de opciones.
 */
public class ManejadorMenu {
  private MenuOpcion[] opciones; // Array de opciones del menú
  private Scanner scanner; // Scanner para leer la entrada del usuario

  /**
   * Constructor de la clase ManejadorMenu.
   *
   * @param opciones Array de opciones del menú
   * @param scanner Scanner para leer la entrada del usuario
   */
  public ManejadorMenu(MenuOpcion[] opciones, Scanner scanner) {
    this.opciones = opciones;
    this.scanner = scanner;
  }

  /**
   * Ejecuta el menú hasta que el usuario selecciona la opción de salir.
   */
  public void ejecutarMenu() {
    boolean ejecutar = true;
    while (ejecutar) {
      mostrarMenu();
      int opcionSeleccionada = scanner.nextInt();
      if (opcionSeleccionada >= 1 && opcionSeleccionada <= opciones.length) {
        opciones[opcionSeleccionada - 1].ejecutarOpcion();
        if (opcionSeleccionada == opciones.length) {
          ejecutar = false;
        }
      } else {
        System.out.println("Opción no válida. Intente de nuevo.");
      }
    }
  }

  /**
   * Muestra el menú de opciones al usuario.
   */
  private void mostrarMenu() {
    System.out.println("----- Menú -----");
    for (int i = 0; i < opciones.length; i++) {
      System.out.println((i + 1) + ". " + opciones[i].getClass().getSimpleName());
    }
    System.out.println("-----------------");
    System.out.print("Ingrese la opción deseada: ");
  }
}