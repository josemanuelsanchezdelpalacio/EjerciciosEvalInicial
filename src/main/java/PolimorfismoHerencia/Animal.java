package PolimorfismoHerencia;

public class Animal {

    private String sexo, nombre;
    private Integer edad, hijos;

    public Animal(String sexo, String nombre, Integer edad, Integer hijos) {
        this.sexo = sexo;
        this.nombre = nombre;
        this.edad = edad;
        this.hijos = hijos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getHijos() {
        return hijos;
    }

    public void setHijos(Integer hijos) {
        this.hijos = hijos;
    }

    public void cumplir(Integer edad){
        this.edad++;
    }

    public void reproducirse(Integer hijos){
        this.hijos++;
    }

    public String toString() {
        return "\n" + "ANIMAL. Sexo: " + sexo + " - Nombre: " + nombre + " - Edad: " + edad + " - Hijos: " + hijos;
    }
}

