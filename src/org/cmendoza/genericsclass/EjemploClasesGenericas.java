package org.cmendoza.genericsclass;
public class EjemploClasesGenericas {
    public static <T> void  imprimirCamion(Camion<T> camion){//metodo generico
        for (T a: camion){
            if (a instanceof Animal){
                System.out.println(((Animal)a).getNombre() + " tipo:" + ((Animal)a).getTipo());
            } else if (a instanceof Automovil) {
                System.out.println("Auto:" + ((Automovil)a).getMarca());

            } else if (a instanceof Maquinaria) {
                System.out.println("Maquinaria tipo: " + ((Maquinaria)a).getTipo());
            }
        }

    }
    public static void main(String[] args) {


        Camion<Animal> transporteCaballos = new Camion<>(5);// lista de tipo Animal
        transporteCaballos.add(new Animal("ad","caballo"));
        transporteCaballos.add(new Animal("ef","caballo"));
        transporteCaballos.add(new Animal("qw","caballo"));
        transporteCaballos.add(new Animal("ty","caballo"));
        transporteCaballos.add(new Animal("kl","caballo"));

       /* for (Animal a: transporteCaballos){//para poder iterar en la clase camion se implementó el método iterator por ser una Lista de objetos
            System.out.println(a.getNombre() + " tipo:" + a.getTipo());
        }*/
        imprimirCamion(transporteCaballos);
        //transporteCaballos.forEach(System.out::println); para usar esta forma en la clase se debe implementar el metodo ToString()

        Camion<Automovil> transporteAutomovil = new Camion<>(4);
        transporteAutomovil.add(new Automovil("Mazda"));
        transporteAutomovil.add(new Automovil("Sedan"));
        transporteAutomovil.add(new Automovil("Audi"));
        transporteAutomovil.add(new Automovil("Ferrari"));

        /*for (Automovil auto : transporteAutomovil){
            System.out.println("Auto:" + auto.getMarca());
        }*/
        imprimirCamion(transporteAutomovil);

        Camion<Maquinaria> transporteMaquinaria = new Camion<>(2);
        transporteMaquinaria.add(new Maquinaria("Tornton"));
        transporteMaquinaria.add(new Maquinaria("trascabo"));
        transporteMaquinaria.add(new Maquinaria("limpiador"));
       /* for (Maquinaria m : transporteMaquinaria){
            System.out.println("Maquinaria tipo: " + m.getTipo());
        }*/
        imprimirCamion(transporteMaquinaria);






    }
}
