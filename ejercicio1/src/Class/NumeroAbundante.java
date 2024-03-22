package Class;

import interfaces.TipoNumero;

/**
 * La clase NumeroAbundante implementa la interfaz TipoNumero.
 * Proporciona un método para verificar si un número es abundante.
 * Un número abundante es un número cuyos divisores propios suman más que el
 * doble del número.
 */
public class NumeroAbundante implements TipoNumero {

  /**
   * Este método verifica si un número es abundante.
   * 
   * @param numero El número que se evaluará.
   * @return true si el número es abundante, false en caso contrario.
   */
  @Override
  public boolean verificar(int numero) {
    int suma = 0;
    for (int i = numero - 1; i >= 1; i--) {
      if (numero % i == 0) {
        suma += i;
      }
    }
    return suma > 2 * numero;
  }

}