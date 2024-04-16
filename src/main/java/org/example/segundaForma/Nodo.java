package org.example.segundaForma;

public class Nodo {
    private Pasajero dato;
    private Nodo siguiente;

    public Nodo(Pasajero dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Pasajero obtenerDato() {
        return dato;
    }

    public void establecerDato(Pasajero dato) {
        this.dato = dato;
    }

    public Nodo obtenerSiguiente() {
        return siguiente;
    }

    public void establecerSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
