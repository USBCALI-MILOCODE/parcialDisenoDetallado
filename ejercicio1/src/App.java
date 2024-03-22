import java.io.IOException;

import Class.Menu;
import Class.Numero;

/**
 * La clase App contiene el método main, que es el punto de entrada de la aplicación.
 * Esta clase se encarga de interactuar con el usuario y realizar las operaciones necesarias.
 */
public class App {
    /**
     * El método main interactúa con el usuario a través de la consola,
     * solicita un número y una opción de menú, y luego verifica si el número es perfecto, defectuoso o abundante.
     * @param args Los argumentos de la línea de comandos. No se utilizan en este programa.
     * @throws IOException Si ocurre un error de entrada/salida.
     */
    public static void main(String[] args) throws IOException {
        // Crear un nuevo menú
        Menu menu = new Menu();
        // Mostrar el menú y obtener la opción seleccionada
        int opcion = menu.mostrarMenu();
        // Solicitar al usuario que ingrese un número
        int numero = menu.ingresarNumero();

        // Crear un nuevo número con el valor ingresado por el usuario
        Numero num = new Numero(numero);

        boolean esTipo = false;
        String tipo = "";
        // Verificar el tipo de número según la opción seleccionada
        switch (opcion) {
            case 1:
                esTipo = num.esPerfecto(numero);
                tipo = "perfecto";
                break;
            case 2:
                esTipo = num.esDefectivo(numero);
                tipo = "defectivo";
                break;
            case 3:
                esTipo = num.esAbundante(numero);
                tipo = "abundante";
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        // Mostrar el resultado
        menu.mostrarResultado(tipo, numero, esTipo);
    }
}