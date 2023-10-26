package org.cmendoza.poointerfaces.repositorio.interfaces;
import org.cmendoza.poointerfaces.repositorio.modelo.Cliente;
import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}
