package org.cmendoza.poointerfaces.repositorio.interfaces;
import java.util.List;

public interface CrudRepositorio<T> {//interfaz con tipo generic
    List<T> listar();// T remplaza al tipo Cliente
    T porId(Integer id);//metodo para obtener él, id
    void crear(T t);
    void editar(T t);
    void eliminar(Integer id);// buscar al cliente por ID y eliminarlo
}
