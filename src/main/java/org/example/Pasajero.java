package org.example;

import java.util.UUID;

class Pasajero implements Comparable<Pasajero> {
    private String id;
    private int categoria; // Categoría del pasajero (adulto mayor, VIP, embarazada, etc.)

    public Pasajero(int categoria) {
        this.id = UUID.randomUUID().toString(); // Generar un ID único para el pasajero
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public int getCategoria() {

        return categoria;
    }

    @Override
    public int compareTo(Pasajero o) {

        return  o.getCategoria() - this.getCategoria();
    }
}
