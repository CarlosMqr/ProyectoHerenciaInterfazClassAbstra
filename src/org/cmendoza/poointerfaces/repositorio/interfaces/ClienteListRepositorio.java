package org.cmendoza.poointerfaces.repositorio.interfaces;

import org.cmendoza.poointerfaces.repositorio.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> /*CrudRepositorio, OrdenableRepositorio, PaginableRepositorio*/ {


    @Override
    public Cliente porId(Integer id) {// BUSCAR POR ID, recibe él ID la clase cliente
        Cliente resultado = null;
        for (Cliente cli : datasource) {// datasource contiene una lista de los clientes
            if (cli.getId() != null && cli.getId().equals(id)) {// usar .equals(id) ya que el id del cliente es Integer
                resultado = cli;
                break;

            }
        }
        return resultado;
    }


    @Override
    public void editar(Cliente cliente) {// editar es propio de cada clase
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApelllido(cliente.getApelllido());

    }


    ///////////////////// INTERFAZ OrdenableRepositorio /////////////////
    @Override
    public List<Cliente> listar(String campo, Direccion dir) {// cada clase debe implementar su forma
        List<Cliente> listarOrdenada = new ArrayList<>(this.datasource);//para crear una nueva lista y no afecte a las demás
        listarOrdenada.sort((a, b) -> {// expresion lambda a y b se asume que son objetos de tipo cliente
            // la expresion lambda es una interfaz funcional con un solo método abstracto
            int resultado = 0;
            if (dir == Direccion.ASC) {
                switch (campo) {
                    case "id" -> resultado = a.getId().compareTo(b.getId());

                    case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());

                    case "apellido" -> resultado = a.getApelllido().compareTo(b.getApelllido());

                }
            } else if (dir == Direccion.DESC) {
                switch (campo) {
                    case "id" -> resultado = b.getId().compareTo(a.getId());
                    case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                    case "apellido" -> resultado = b.getApelllido().compareTo(a.getApelllido());
                }

            }
            return resultado;
        });
        return listarOrdenada;// retorna listaOrdenada en vez de datasource
    }
}
