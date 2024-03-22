package Interfaces;

/**
 * La interfaz MenuOpcion define un método que debe implementar una opción de menú.
 * Este método se ejecuta cuando se selecciona la opción de menú.
 */
public interface MenuOpcion {

  /**
   * Ejecuta la acción asociada con esta opción de menú.
   * La implementación específica depende de la clase que implementa la interfaz.
   */
  void ejecutarOpcion();

}