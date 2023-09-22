package Ejercicios_Tema0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static libs.Leer.pedirDouble;

/*
* Escribe un algoritmo que pida por teclado tres números, los ordene de menor a mayor y
* los muestre en pantalla ordenados.
*/

public class Ej2 {

    static Scanner scanner = new Scanner(System.in);

    public static void numerosOrdenados() {

        double num1, num2, num3;

        //EJERCICIO CON ARRAYLIST
        num1 = pedirDouble("Introduce el primer número: ");
        num2 = pedirDouble("Introduce el segundo número: ");
        num3 = pedirDouble("Introduce el tercer número: ");

        ArrayList<Double> array = new ArrayList<>();
        array.add(num1);
        array.add(num2);
        array.add(num3);

        Collections.sort(array);

        /*************************************************************************************/
        //EJERCICIO CON ARRAY NORMAL
        /*int[] array = {num1, num2, num3};

        Arrays.sort(array);

        // Numeros ordenados de mayor a menor
        System.out.println("\n" + array[0] + " - " + array[1] + " - " + array[2]);*/


        /*************************************************************************************/
        //EJERCICIO CON IFS
        /*if (num1 < num2 && num1 < num3) {
            // Si el numero más pequeño es el primero
            menor = num1;
            if (num2 < num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 < num1 && num2 < num3) {
            // Si el numero más pequeño es el segundo
            menor = num2;

            if (num1 < num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }

        } else {
            // Si el numero más pequeño es el tercero:
            menor = num3;
            if (num1 < num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }

        }*/
    }
}