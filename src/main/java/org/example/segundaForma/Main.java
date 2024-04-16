package org.example.segundaForma;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();


        cola.encolar(new Pasajero("Juan", 1));
        cola.encolar(new Pasajero("Pedro",5));
        cola.encolar(new Pasajero("Maria",1));


        System.out.println("Contenido de la cola al principio:");
        cola.mostrar();






    }


}
