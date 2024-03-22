package Class;

import interfaces.TipoNumero;

public class NumeroDefectivo implements TipoNumero {

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
