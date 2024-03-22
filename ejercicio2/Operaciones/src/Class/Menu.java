package Class;

import java.util.Scanner;
import Interfaces.MenuInterface;

/**
 * La clase Menu implementa la interfaz MenuInterface y proporciona
 * la funcionalidad para mostrar un menú y obtener una opción seleccionada por el usuario.
 */
public class Menu implements MenuInterface {

  /**
   * Muestra el menú de opciones al usuario.
   * Las opciones incluyen verificar si un número es primo, calcular un resultado y salir.
   */
  @Override
  public void mostrarMenu() {
    System.out.println("----- Menú -----");
    System.out.println("1. Verificar si un número es primo");
    System.out.println("2. Calcular un resultado");
    System.out.println("3. Salir");
    System.out.println("-----------------");
  }

  /**
   * Solicita al usuario que ingrese la opción deseada del menú.
   * 
   * @return La opción seleccionada por el usuario.
   */
  @SuppressWarnings("resource")
  @Override
  public int obtenerOpcion() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la opción deseada: ");
    int opcion = sc.nextInt();
    return opcion;
  }

}