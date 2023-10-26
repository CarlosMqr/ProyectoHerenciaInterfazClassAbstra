package org.cmendoza.generics;
import org.cmendoza.poointerfaces.repositorio.modelo.Cliente;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        //List<Cliente> clientes= new ArrayList<>(); //es una lista de tipo cliente(Objeto)
        //clientes.add(new Cliente("Carlos","Mendoza"));
        // Cliente carlos = clienteCarlos.iterator().next();//con el .iterator().next(); obtenemos el primer elemento de la lista


        Cliente[] clientesArreglo = {
                new Cliente("Jazmin", "Diaz"),
                new Cliente("Jessy", "Rangel")};

        Integer[] enterosArreglo = {1, 2, 3};

        List<Cliente> clienteLista = fromArrayToList(clientesArreglo);//metodo que convierte un arreglo tipo clientes a una lista tipo cliente
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);//metodo que convierte un arreglo tipo Integer a una lista tipo Integer

        clienteLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);


    }//main

    public static <T> List<T> fromArrayToList(T[] c) {//Metodo generico que se puede reutilizar
        return Arrays.asList(c);// .asList(c) recibe un arreglo y lo convierte a una lista
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {/*podemos limitar el uso del metodo generico como se muestra en este
                                                                     ejemplo, solo aceptara de tipo Number*/
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List<T> fromArrayToList(T[] c) {/*como T extiende de Cliente podemos convertir Cliente y los que heredan de cliente
     */
        return Arrays.asList(c);
    }
}//clase

