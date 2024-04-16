package org.example.segundaForma;

public class Cola {
    private Nodo frente;
    private Nodo finalCola;

    public Cola() {
        frente = null;
        finalCola = null;
    }

    // Método para agregar una persona al final de la cola
   /* public void encolar(Pasajero pasajero) {
        Nodo nuevoNodo = new Nodo(pasajero);
        if (estáVacia()) {
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.establecerSiguiente(nuevoNodo);
            finalCola = nuevoNodo;
        }
    }*/

    // Método para agregar una persona a la cola según su prioridad
    public void encolar(Pasajero pasajero) {
        Nodo nuevoNodo = new Nodo(pasajero);
        if (estáVacia()) {
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            Nodo nodoActual = frente;
            Nodo nodoAnterior = null;
            while (nodoActual != null && pasajero.prioridad >= nodoActual.obtenerDato().prioridad) {
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.obtenerSiguiente();
            }
            if (nodoAnterior == null) {
                nuevoNodo.establecerSiguiente(frente);
                frente = nuevoNodo;
            } else {
                nodoAnterior.establecerSiguiente(nuevoNodo);
            }
            if (nodoActual == null) {
                finalCola = nuevoNodo;
            }
            nuevoNodo.establecerSiguiente(nodoActual);
        }
    }

    // Método para eliminar y devolver la persona al frente de la cola
    public Pasajero desencolar() {
        if (estáVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        Pasajero personaDesencolada = (Pasajero) frente.obtenerDato();
        frente = frente.obtenerSiguiente();
        if (frente == null) {
            finalCola = null;
        }
        return personaDesencolada;
    }

    // Método para verificar si la cola está vacía
    public boolean estáVacia() {
        return frente == null;
    }

    // Método para obtener la persona al frente de la cola sin eliminarla
    public Pasajero frente() {
        if (estáVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return (Pasajero) frente.obtenerDato();
    }

    // Método para mostrar el contenido de la cola
    public void mostrar() {
        if (estáVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }

        Nodo nodoActual = frente;
        while (nodoActual != null) {
            System.out.println(nodoActual.obtenerDato());
            nodoActual = nodoActual.obtenerSiguiente();
        }
    }
}
