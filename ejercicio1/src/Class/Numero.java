package Class;

import interfaces.CalculadorNumero;

public class Numero implements CalculadorNumero {

  @SuppressWarnings("unused")
  private int numero;

  public Numero(int numero) {
    this.numero = numero;
  }

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
