package org.example;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Simulamos la llegada de pasajeros y los agregamos al counter
        counter.agregarPasajero(new Pasajero(1));
        counter.agregarPasajero(new Pasajero(4));
        counter.agregarPasajero(new Pasajero(2));
        counter.agregarPasajero(new Pasajero(4));
        counter.agregarPasajero(new Pasajero(5));
        counter.agregarPasajero(new Pasajero(4));

        // Atendemos a los pasajeros en orden de prioridad
        counter.atenderPasajeros();
    }
}