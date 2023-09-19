package PolimorfismoHerencia;

public class Pez extends Animal {

    private Integer kmRecorridos;
    private String tipoAgua;

    public Pez(String sexo, String nombre, Integer edad, Integer hijos, Integer kmRecorridos, String tipoAgua) {
        super(sexo, nombre, edad, hijos);
        this.kmRecorridos = kmRecorridos;
        this.tipoAgua = tipoAgua;
    }

    public String toString() {
        return super.toString() + " - KM recorridos: " + kmRecorridos + " - Tipo de agua: " + tipoAgua + "\n";
    }
}
