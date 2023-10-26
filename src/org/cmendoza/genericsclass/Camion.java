package org.cmendoza.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion <T> implements Iterable<T> {//se agregó el operador diamante con del tipo T despues del nombre de la clase y del nombre de la interfaz
    private List<T> objetos;//también es iterable; se agregó el operador diamante con el tipo T
    private int max;

    public Camion(int max){
        this.max = max;
        this.objetos = new ArrayList<>();//se agrego los operadores diamante
    }

    public void add(T objeto){// se pasa por argumento del tipo T
        if (this.objetos.size() <= max){
            this.objetos.add(objeto);
        }else {
            throw new RuntimeException("NO hay mas espacio");// es una excepcion
        }
    }


    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
