package PolimorfismoHerencia;

public class Gato extends Animal {
    private int km_recorridos, patas;

    public Gato(String sexo, String nombre, Integer edad, Integer hijos, int km_recorridos, int patas) {
        super(sexo, nombre, edad, hijos);
        this.km_recorridos = km_recorridos;
        this.patas = patas;
    }

    public String toString() {
        return super.toString() + " - KM recorridos: " + km_recorridos + "Patas: " + patas + "\n";
    }
}
