import java.io.IOException;

import Class.Menu;
import Class.Numero;

public class App {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        int opcion = menu.mostrarMenu();
        int numero = menu.ingresarNumero();

        Numero num = new Numero(numero);

        boolean esTipo = false;
        String tipo = "";
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

        menu.mostrarResultado(tipo, numero, esTipo);
    }
}
