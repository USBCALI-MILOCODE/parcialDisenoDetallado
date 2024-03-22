package Class;

/**
 * La clase OperacionesMatematicas proporciona métodos para realizar operaciones matemáticas específicas,
 * como verificar si un número es primo y calcular un resultado basado en cuatro números.
 */
public class OperacionesMatematicas {

  /**
   * Verifica si un número es primo.
   *
   * @param numero El número a verificar.
   * @return Verdadero si el número es primo, falso en caso contrario.
   */
  public boolean esPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
  }

  /**
   * Calcula un resultado basado en cuatro números utilizando la fórmula ((num1 + num2) * (num3 - num4)) / (num1 * num4).
   *
   * @param num1 El primer número.
   * @param num2 El segundo número.
   * @param num3 El tercer número.
   * @param num4 El cuarto número.
   * @return El resultado del cálculo.
   */
  public double calcularResultado(double num1, double num2, double num3, double num4) {
    return ((num1 + num2) * (num3 - num4)) / (num1 * num4);
  }
}