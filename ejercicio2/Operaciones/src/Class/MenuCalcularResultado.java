package Class;

import java.util.Scanner;
import Interfaces.MenuOpcion;

/**
 * La clase MenuCalcularResultado implementa la interfaz MenuOpcion.
 * Proporciona la funcionalidad para calcular un resultado basado en cuatro números ingresados por el usuario.
 */
public class MenuCalcularResultado implements MenuOpcion {
  private OperacionesMatematicas operaciones; // Objeto para realizar operaciones matemáticas
  private Scanner scanner; // Scanner para leer la entrada del usuario

  /**
   * Constructor de la clase MenuCalcularResultado.
   *
   * @param operaciones Objeto para realizar operaciones matemáticas
   * @param scanner Scanner para leer la entrada del usuario
   */
  public MenuCalcularResultado(OperacionesMatematicas operaciones, Scanner scanner) {
    this.operaciones = operaciones;
    this.scanner = scanner;
  }

  /**
   * Solicita al usuario que ingrese cuatro números, calcula un resultado utilizando estos números
   * y muestra el resultado al usuario.
   */
  @Override
  public void ejecutarOpcion() {
    System.out.println("Ingrese cuatro números para calcular el resultado:");
    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();
    double num3 = scanner.nextDouble();
    double num4 = scanner.nextDouble();
    double resultado = operaciones.calcularResultado(num1, num2, num3, num4);
    System.out.println("El resultado es: " + resultado);
  }

}