package Class;

import interfaces.CalculadorNumero;

/**
 * La clase Numero implementa la interfaz CalculadorNumero.
 * Proporciona métodos para determinar si un número es perfecto, defectuoso o abundante.
 */
public class Numero implements CalculadorNumero {

  // El número que se evaluará.
  @SuppressWarnings("unused")
  private int numero;

  /**
   * Constructor de la clase Numero.
   * @param numero El número que se evaluará.
   */
  public Numero(int numero) {
    this.numero = numero;
  }

  /**
   * Este método determina si un número es perfecto.
   * Un número perfecto es un número cuyos divisores propios suman exactamente el número.
   * @param numero El número que se evaluará.
   * @return true si el número es perfecto, false en caso contrario.
   */
  @Override
  public boolean esPerfecto(int numero) {
    int suma = 0;
    for (int i = numero - 1; i >= 1; i--) {
      if (numero % i == 0) {
        suma += i;
      }
    }
    return numero == suma;
  }

  /**
   * Este método determina si un número es defectuoso.
   * Un número defectuoso es un número cuyos divisores propios suman menos que el número.
   * @param numero El número que se evaluará.
   * @return true si el número es defectuoso, false en caso contrario.
   */
  @Override
  public boolean esDefectivo(int numero) {
    int suma = 0;
    for (int i = numero - 1; i >= 1; i--) {
      if (numero % i == 0) {
        suma += i;
      }
    }
    return numero > suma;
  }

  /**
   * Este método determina si un número es abundante.
   * Un número abundante es un número cuyos divisores propios suman más que el doble del número.
   * @param numero El número que se evaluará.
   * @return true si el número es abundante, false en caso contrario.
   */
  @Override
  public boolean esAbundante(int numero) {
    int suma = 0;
    for (int i = numero - 1; i >= 1; i--) {
      if (numero % i == 0) {
        suma += i;
      }
    }
    return suma > 2 * numero;
  }

}