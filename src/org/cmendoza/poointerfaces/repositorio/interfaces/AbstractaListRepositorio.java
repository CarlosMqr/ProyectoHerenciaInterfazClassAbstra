package org.cmendoza.poointerfaces.repositorio.interfaces;
import java.util.ArrayList;
import java.util.List;

abstract public class AbstractaListRepositorio<T> implements OrdenablePaginableCrudRepositorio<T> /*CrudRepositorio,OrdenableRepositorio,PaginableRepositorio*/ {
    protected List<T> datasource;
    public AbstractaListRepositorio(){// constructor inicializa
        this.datasource = new ArrayList<>();
    }
    @Override
    public List<T> listar() {
        return datasource;
    }

  /*  @Override
    public T porId(Integer id) {// BUSCAR POR ID, recibe él ID la clase cliente
        T resultado = null;
        for (T cli : datasource) {// datasource contiene una lista de los clientes
            if (cli.getId() != null && cli.getId().equals(id)){// usar .equals(id) ya que el id del cliente es Integer
                resultado = cli;
                break;

            }
        }
        return resultado;
    }*/

    @Override
    public void crear(T t) {
        this.datasource.add(t);

    }

    @Override
    public void eliminar(Integer id) {

        this.datasource.remove(this.porId(id));
        /*Cliente c = this.porId(id);// el cliente que se quiere eliminar se guarda en la variable c de tipo Cliente
        this.datasource.remove(c);*/

    }

    ///////////////////// INTERFAZ PaginableRepositorio /////////////////

    @Override
    public List<T> listar(int desde, int hasta) {
        return datasource.subList(desde, hasta);
    }

    ///////////////////// INTERFAZ contableRepositorio /////////////////

    @Override
    public int total() {
        return this.datasource.size();
    }
}
