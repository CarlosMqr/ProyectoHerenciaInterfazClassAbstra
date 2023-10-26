package org.cmendoza.poointerfaces.repositorio.modelo;

import java.util.Objects;

public class Cliente {
    private Integer id;
    private static int ultimoId;
    private String nombre;
    private String apelllido;
    //////////// CONSTRUCTOR ////////////
    public Cliente(){
        this.id = ++ ultimoId;
    }
    public Cliente(String nombre, String apelllido){
        this();
        this.nombre = nombre;
        this.apelllido = apelllido;

    }
    /////////// GETTER ANS SETTER //////
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApelllido(){
        return this.apelllido;
    }
    public void setApelllido(String apelllido){
        this.apelllido = apelllido;
    }
    ////////// MÉTODOS ////////////////


    @Override
    public String toString() {
        return "ID: " + id +
                "\nNombre: " + nombre +
                "\nApellido: " + apelllido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
