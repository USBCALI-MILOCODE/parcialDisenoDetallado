package interfaces;

/**
 * La interfaz CalculadorNumero define los métodos que deben ser implementados
 * por cualquier clase que pueda calcular si un número es perfecto, defectuoso o abundante.
 */
public interface CalculadorNumero {

  /**
   * Método para determinar si un número es perfecto.
   * Un número perfecto es un número cuyos divisores propios suman exactamente el número.
   * @param numero El número que se evaluará.
   * @return true si el número es perfecto, false en caso contrario.
   */
  boolean esPerfecto(int numero);

  /**
   * Método para determinar si un número es defectuoso.
   * Un número defectuoso es un número cuyos divisores propios suman menos que el número.
   * @param numero El número que se evaluará.
   * @return true si el número es defectuoso, false en caso contrario.
   */
  boolean esDefectivo(int numero);

  /**
   * Método para determinar si un número es abundante.
   * Un número abundante es un número cuyos divisores propios suman más que el número.
   * @param numero El número que se evaluará.
   * @return true si el número es abundante, false en caso contrario.
   */
  boolean esAbundante(int numero);
}