package org.cmendoza.poointerfaces.repositorio;

import org.cmendoza.poointerfaces.repositorio.interfaces.*;
import org.cmendoza.poointerfaces.repositorio.modelo.Cliente;

import java.util.List;

public class EjemploCrudMain {
    public static void main(String[] args) {
        /*CrudRepositorio*/ OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();

        repo.crear(new Cliente("Jazmin","Diaz"));
        repo.crear(new Cliente("Daniela","Rangel"));
        repo.crear(new Cliente("Carlos","Mendoza"));
        repo.crear(new Cliente("Adriana","Ruiz"));
        List<Cliente> clientes = repo.listar();
        //clientes.forEach(c -> System.out.println(c)); expresion lambda
        clientes.forEach(System.out::println);// metodo de referencia


        System.out.println("============= Paginable ===========");

        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1,3);// el 3 no se incluye
        paginable.forEach(System.out::println);

        System.out.println("============= Ordenable ===========");
        List<Cliente> clienteOrdenAsc = ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC);
        clienteOrdenAsc.forEach(System.out::println);

        System.out.println("============= EDITAR USUARIO ===========");
        Cliente AdrianaActualizar = new Cliente("Adriana","Venegas");
        AdrianaActualizar.setId(4);//mandar el ID para que no se autoincremente
        repo.editar(AdrianaActualizar);// pasamos por argumento AdrianaActualizar

         repo.listar().forEach(System.out::println);

        System.out.println("============= ELIMINAR USUARIO ===========");
         repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("============= TOTAL DE REGISTROS ===========");
        System.out.println("Registros: " + repo.total());






    }
}
