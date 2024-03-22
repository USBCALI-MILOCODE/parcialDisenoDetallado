package Class;

import interfaces.TipoNumero;

/**
 * La clase NumeroPerfecto implementa la interfaz TipoNumero.
 * Proporciona un método para verificar si un número es perfecto.
 * Un número perfecto es un número cuyos divisores propios suman exactamente el número.
 */
public class NumeroPerfecto implements TipoNumero {

  /**
   * Este método verifica si un número es perfecto.
   * @param numero El número que se evaluará.
   * @return true si el número es perfecto, false en caso contrario.
   */
  @Override
  public boolean verificar(int numero) {
    int suma = 0;
    for (int i = numero - 1; i >= 1; i--) {
      if (numero % i == 0) {
        suma += i;
      }
    }
    return numero == suma;
  }

}