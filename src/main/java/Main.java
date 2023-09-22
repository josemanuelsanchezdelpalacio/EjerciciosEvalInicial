import Ejercicios_Tema0.Ej10;
import Ejercicios_Tema0.Ej2;
import PolimorfismoHerencia.Ej3;
import libs.Leer;

public class Main {

    public static void main(String[] args) {
        int num1, num2;

        boolean salir = false;
        int opcion;

        try {
            while (!salir) {
                System.out.println("0. Salir");
                System.out.println("1. Ejercicio2: Ordenar numeros");
                System.out.println("2. Ejercicio3: Polimorfimo Herencia");
                System.out.println("2. Ejercicio10: Calculadora");

                // Pedir la opción al usuario
                opcion = Leer.pedirEntero("Introduce una opción: ");

                switch (opcion) {
                    case 0:
                        salir = true;
                        break;
                    case 1:
                        Ej2.numerosOrdenados();
                        break;
                    case 2:
                        Ej3.polimorHerencia();
                        break;
                    case 3:
                        Ej10.calculadora();
                        break;
                    default:
                        System.out.println("La opcion seleccionada no existe");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}