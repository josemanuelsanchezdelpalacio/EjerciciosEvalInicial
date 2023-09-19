package Ejercicios_Tema0;

import MetodosLeer.Leer;

import java.util.Scanner;

/*
*  Escribe un algoritmo que simule una calculadora de sumas y restas.
*  Se deberá mostrar un menú que tendrá que repetirse hasta que el usuario escriba un tres.
*  El menú será como el siguiente:
        1. Suma
        2. Resta
        3. Salir
   La opción 1 pedirá dos números, los sumará y mostrará el resultado. A continuación, volverá a aparecer el menú.
   La opción 2 pedirá dos números, restará el segundo al primero y mostrará el resultado. A continuación, volverá a aparecer el menú.
   La opción 3 hará que deje de repetirse el menú.
*/

public class Calculadora {

    public static void main(String[] args) {
        int num1, num2;

        boolean salir = false;
        int opcion;

        try {
            while (!salir) {
                System.out.println("0. Salir");
                System.out.println("1. Restar");
                System.out.println("2. Salir");

                // Pedir la opción al usuario
                opcion = Leer.pedirEntero("Introduce una opción: ");

                switch (opcion) {
                    case 0:
                        salir = true;
                        break;
                    case 1:
                        // Pedir los números al usuario
                        num1 = Leer.pedirEntero("Introduce primer numero: ");
                        num2 = Leer.pedirEntero("Introduce segundo numero: ");
                        System.out.println("Resultado suma: " + (num1 + num2));
                        break;
                    case 2:
                        // Pedir los números al usuario
                        num1 = Leer.pedirEntero("Introduce primer numero: ");
                        num2 = Leer.pedirEntero("Introduce segundo numero: ");
                        System.out.println("Resultado resta: " + (num1 - num2));
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
