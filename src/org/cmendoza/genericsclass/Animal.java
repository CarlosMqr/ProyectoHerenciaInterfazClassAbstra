package org.cmendoza.genericsclass;

public class Animal {
    private String nombre;
    private String tipo;

    public Animal(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getTipo(){
        return this.tipo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " Tipo: " + tipo;
    }
}
