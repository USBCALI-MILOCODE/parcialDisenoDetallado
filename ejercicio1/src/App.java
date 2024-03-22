import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        String entrada;
        int opcion;
        int numero, suma = 0, i;

        System.out.println("Programa que detecta los siguientes tipos de números");
        System.out.println("1. Perfecto");
        System.out.println("2. Defectivo");
        System.out.println("3. Abundante");
        System.out.println("Seleccion su opción 1, 2 o 3");
        entrada = bufer.readLine();
        opcion = Integer.parseInt(entrada);
        System.out.println("---------------------------------");
        System.out.println("Escriba el numero: ");
        entrada = bufer.readLine();
        numero = Integer.parseInt(entrada);

        switch (opcion) {
            case 1: {
                for (i = numero - 1; i >= 1; i--)
                    if (numero % i == 0)
                        suma = suma + i;
                if (numero == suma)
                    System.out.println("El numero " + numero + " es perfecto");
                else
                    System.out.println("El numero " + numero + " no es perfecto");
            }
                break;
            case 2: {
                for (i = numero - 1; i >= 1; i--)
                    if (numero % i == 0)
                        suma = suma + i;
                if (numero > suma)
                    System.out.println("El numero " + numero + " es defectivo");
                else
                    System.out.println("El numero " + numero + " no es defectivo");
            }
                break;
            case 3: {
                for ( i = numero; i > 1; i--)
                    if ( numero % i == 0)
                        suma = suma + i;
                if ( suma > 2 * numero)
                    System.out.println("El numero " + numero + " es abundante");
                else
                    System.out.println("El numero " + numero + " no es abundante");
            }
            break;
            default: System.out.println("Opción no valida");

        }
    }
}
