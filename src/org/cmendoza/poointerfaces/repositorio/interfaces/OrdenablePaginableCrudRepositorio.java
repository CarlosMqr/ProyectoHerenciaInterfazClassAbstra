package org.cmendoza.poointerfaces.repositorio.interfaces;

public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,PaginableRepositorio<T>,
        CrudRepositorio<T>,ContableRepositorio{
    //esta interfaz hereda todos los metodos de las demas interfaces
}
