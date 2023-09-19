package MetodosLeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {

    // BufferedReader para leer datos de la entrada estandar
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //Método para imprimir mensaje en pantalla
    public static void mostrarEnPantalla(String mensaje) {
        // Imprime el mensaje proporcionado
        System.out.print(mensaje);
    }

    //Método para pedir un dato al usuario
    public static String pedirDato(String texto, String regex) {
        boolean error = true;
        String dato = "";

        while (error) {
            try {
                dato = "";
                mostrarEnPantalla(texto); // Muestra el mensaje al usuario
                dato = br.readLine(); // Lee la entrada del usuario

                // Comprueba si la entrada coincide con la expresión regular o si no se requiere validación
                if (regex == null || dato.matches(regex)) {
                    error = false; // El dato es válido, termina el bucle
                } else {
                    mostrarEnPantalla("Por favor, vuelve a introducir el dato, no es un valor posible. ");
                    // El dato no es válido según la expresión regular, solicita al usuario que lo reintroduzca
                    error = true;
                }
            } catch (IOException e) {
                mostrarEnPantalla("Vuelve a introducir el dato, por favor.");
                // Ocurrió un error al leer la entrada, solicita al usuario que reintroduzca el dato
                error = true;
            }
        }
        return dato; // Devuelve el dato introducido por el usuario
    }

    //Método para pedir un entero al usuario
    public static int pedirEntero(String texto) {
        // Expresión regular para validar enteros
        String regex = "^-?\\d+$";
        // Llama a pedirDato para solicitar y validar un entero
        String dato = pedirDato(texto, regex);
        return Integer.parseInt(dato); // Convierte el dato a un entero y lo devuelve
    }

    //Método para pedir un double al usuario
    public static double pedirDouble(String texto) {
        // Expresión regular para validar números decimales
        String regex = "^-?\\d+([.]\\d*)?$";
        // Llama a pedirDato para solicitar y validar un double
        String dato = pedirDato(texto, regex);
        return Double.parseDouble(dato); // Convierte el dato a double y lo devuelve
    }

    //Método para pedir un float al usuario
    public static float pedirFloat(String texto) {
        // Expresión regular para validar números decimales (float)
        String regex = "^-?\\d+([.]\\d*)?$";
        // Llama a pedirDato para solicitar y validar un float
        String dato = pedirDato(texto, regex);
        return Float.parseFloat(dato); // Convierte el dato a float y lo devuelve
    }
}
