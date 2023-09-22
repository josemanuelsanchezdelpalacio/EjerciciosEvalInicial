package PolimorfismoHerencia;

/*
* Explica con un ejemplo práctico, los conceptos de herencia y polimorfismo que se utilizan
* en la programación orientada a objetos.
 */

public class Ej3 {

    public static void polimorHerencia() {
        Pez pez1 = new Pez("masculino", "nonbrePez", 1, 100, 10, "agua");
        pez1.setHijos(reproducirse(1));
        Gato gato1 = new Gato("masculino", "nombreGato", 5, 0, 45, 4);
        gato1.setEdad(cumplir(1));
        System.out.println(pez1 + "\n" + gato1);
    }

    private static Integer cumplir(int edad) {
        edad++;
        return edad;
    }

    private static Integer reproducirse(int hijos) {
        hijos++;
        return hijos;
    }
}