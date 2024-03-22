package Class;

import interfaces.TipoNumero;

public class NumeroAbundante implements TipoNumero {

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
