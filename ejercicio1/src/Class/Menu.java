package Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * La clase Menu se encarga de interactuar con el usuario a través de la consola.
 */
public class Menu {
  // BufferedReader es una clase de Java para leer texto de una entrada de caracteres de manera eficiente.
  private BufferedReader bufer;

  /**
   * Constructor de la clase Menu. Inicializa el BufferedReader.
   */
  public Menu() {
    this.bufer = new BufferedReader(new InputStreamReader(System.in));
  }

  /**
   * Este método muestra el menú al usuario y devuelve la opción seleccionada.
   * @return La opción seleccionada por el usuario.
   * @throws IOException Si ocurre un error de entrada/salida.
   */
  public int mostrarMenu() throws IOException {
    System.out.println("Programa que detecta los siguientes tipos de números");
    System.out.println("1. Perfecto");
    System.out.println("2. Defectivo");
    System.out.println("3. Abundante");
    System.out.println("Seleccione su opción 1, 2 o 3:");
    String entrada = bufer.readLine();
    return Integer.parseInt(entrada);
  }

  /**
   * Este método solicita al usuario que ingrese un número y lo devuelve.
   * @return Integer El número ingresado por el usuario.
   * @throws IOException Si ocurre un error de entrada/salida.
   */
  public int ingresarNumero() throws IOException {
    System.out.println("---------------------------------");
    System.out.println("Escriba el número:");
    String entrada = bufer.readLine();
    return Integer.parseInt(entrada);
  }

  /**
   * Este método muestra el resultado de la operación al usuario.
   * @param tipo El tipo de número (perfecto, defectivo, abundante).
   * @param numero El número que se está evaluando.
   * @param esTipo Si el número es del tipo especificado.
   */
  public void mostrarResultado(String tipo, int numero, boolean esTipo) {
    String mensaje = "El número " + numero;
    if (esTipo) {
      mensaje += " es " + tipo;
    } else {
      mensaje += " no es " + tipo;
    }
    System.out.println(mensaje);
  }
}