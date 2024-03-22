package Class;

import java.util.Arrays;

/**
 * La clase Ordenamiento proporciona métodos para ordenar arreglos de números
 * enteros y cadenas de caracteres
 * utilizando el algoritmo de ordenamiento de burbuja.
 */
public class Ordenamiento {

  /**
   * Ordena un arreglo de números enteros en orden ascendente utilizando el
   * algoritmo de ordenamiento de burbuja.
   * Imprime el arreglo antes y después de la ordenación.
   *
   * @param arreglo El arreglo de números enteros a ordenar.
   */
  public void burbuja(int[] arreglo) {
    System.out.println("Antes del método de la burbuja: " + Arrays.toString(arreglo));
    for (int x = 0; x < arreglo.length; x++) {
      for (int y = 0; y < arreglo.length - 1; y++) {
        if (arreglo[y] > arreglo[y + 1]) {
          int temp = arreglo[y];
          arreglo[y] = arreglo[y + 1];
          arreglo[y + 1] = temp;
        }
      }
    }
    System.out.println("Después del método de la burbuja: " + Arrays.toString(arreglo));
  }

  /**
   * Ordena un arreglo de cadenas de caracteres en orden lexicográfico ascendente
   * utilizando el algoritmo de ordenamiento de burbuja.
   * Imprime el arreglo antes y después de la ordenación.
   *
   * @param arreglo El arreglo de cadenas de caracteres a ordenar.
   */
  public void burbujas(String[] arreglo) {
    System.out.println("Antes del método de la burbuja: " + Arrays.toString(arreglo));
    for (String elemento : arreglo) {
      for (int y = 0; y < arreglo.length - 1; y++) {
        if (elemento.compareTo(arreglo[y + 1]) > 0) {
          String temp = arreglo[y];
          arreglo[y] = arreglo[y + 1];
          arreglo[y + 1] = temp;
        }
      }
    }
    System.out.println("Después del método de la burbuja: " + Arrays.toString(arreglo));
  }
}
