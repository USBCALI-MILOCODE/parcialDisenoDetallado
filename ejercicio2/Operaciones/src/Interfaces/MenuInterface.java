package Interfaces;

/**
 * La interfaz MenuInterface define los métodos que debe implementar un menú interactivo.
 * Los métodos incluyen mostrar el menú al usuario y obtener la opción seleccionada por el usuario.
 */
public interface MenuInterface {

  /**
   * Muestra el menú al usuario. La implementación específica depende de la clase que implementa la interfaz.
   */
  void mostrarMenu();

  /**
   * Obtiene la opción seleccionada por el usuario. La implementación específica depende de la clase que implementa la interfaz.
   *
   * @return La opción seleccionada por el usuario.
   */
  int obtenerOpcion();

}