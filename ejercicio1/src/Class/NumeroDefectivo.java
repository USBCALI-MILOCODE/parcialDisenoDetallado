package Class;

import interfaces.TipoNumero;

/**
 * La clase NumeroDefectivo implementa la interfaz TipoNumero.
 * Proporciona un método para verificar si un número es defectuoso.
 * Un número defectuoso es un número cuyos divisores propios suman menos que el número.
 */
public class NumeroDefectivo implements TipoNumero {

  /**
   * Este método verifica si un número es defectuoso.
   * @param numero El número que se evaluará.
   * @return true si el número es defectuoso, false en caso contrario.
   */
  @Override
  public boolean verificar(int numero) {
    int suma = 0;
    for (int i = numero - 1; i >= 1; i--) {
      if (numero % i == 0) {
        suma += i;
      }
    }
    return numero > suma;
  }

}