package Class;

import java.util.Scanner;
import Interfaces.MenuOpcion;

/**
 * La clase MenuVerificarPrimo implementa la interfaz MenuOpcion.
 * Proporciona la funcionalidad para verificar si un número ingresado por el usuario es primo.
 */
public class MenuVerificarPrimo implements MenuOpcion {

  private OperacionesMatematicas operaciones; // Objeto para realizar operaciones matemáticas
  private Ordenamiento ordenamiento; // Objeto para realizar operaciones de ordenamiento
  private Scanner scanner; // Scanner para leer la entrada del usuario

  /**
   * Constructor de la clase MenuVerificarPrimo.
   *
   * @param operaciones Objeto para realizar operaciones matemáticas
   * @param ordenamiento Objeto para realizar operaciones de ordenamiento
   * @param scanner Scanner para leer la entrada del usuario
   */
  public MenuVerificarPrimo(OperacionesMatematicas operaciones, Ordenamiento ordenamiento, Scanner scanner) {
    this.operaciones = operaciones;
    this.ordenamiento = ordenamiento;
    this.scanner = scanner;
  }

  /**
   * Solicita al usuario que ingrese un número, verifica si este número es primo
   * y muestra el resultado al usuario. Luego, crea un arreglo con este número
   * y llama a un método de ordenamiento en este arreglo.
   */
  @Override
  public void ejecutarOpcion() {
    System.out.print("Ingrese el número para verificar si es primo: ");
    int num = scanner.nextInt();
    boolean esPrimo = operaciones.esPrimo(num);
    System.out.println("¿Es primo? " + esPrimo);

    int[] arreglo = { num }; // Creamos un arreglo con un solo elemento
    ordenamiento.burbuja(arreglo); // Llamamos al método de ordenamiento
  }
}