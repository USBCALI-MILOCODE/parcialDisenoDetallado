package Class;

import Interfaces.MenuOpcion;

/**
 * La clase MenuSalir implementa la interfaz MenuOpcion.
 * Proporciona la funcionalidad para terminar la ejecución del programa.
 */
public class MenuSalir implements MenuOpcion {

  /**
   * Muestra un mensaje al usuario indicando que la ejecución del programa ha terminado.
   */
  @Override
  public void ejecutarOpcion() {
    System.out.println("La ejecución ha terminado.");
  }

}