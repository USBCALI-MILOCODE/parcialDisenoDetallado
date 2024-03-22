package Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
  private BufferedReader bufer;

  public Menu() {
    this.bufer = new BufferedReader(new InputStreamReader(System.in));
  }

  public int mostrarMenu() throws IOException {
    System.out.println("Programa que detecta los siguientes tipos de números");
    System.out.println("1. Perfecto");
    System.out.println("2. Defectivo");
    System.out.println("3. Abundante");
    System.out.println("Seleccione su opción 1, 2 o 3:");
    String entrada = bufer.readLine();
    return Integer.parseInt(entrada);
  }

  public int ingresarNumero() throws IOException {
    System.out.println("---------------------------------");
    System.out.println("Escriba el número:");
    String entrada = bufer.readLine();
    return Integer.parseInt(entrada);
  }

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
