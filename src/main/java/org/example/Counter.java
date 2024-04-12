package org.example;

import java.util.concurrent.PriorityBlockingQueue;

class Counter {
    private PriorityBlockingQueue<Pasajero> queue; // Cola de prioridad para los pasajeros

    public Counter() {
        this.queue = new PriorityBlockingQueue<>();
    }

    // Método para agregar un pasajero a la cola
    public void agregarPasajero(Pasajero pasajero) {
        queue.offer(pasajero); // Ofrecer el pasajero a la cola de prioridad
        System.out.println("Se ha agregado un pasajero a la cola: " + pasajero.getId());
    }

    // Método para atender a los pasajeros en orden de prioridad
    public void atenderPasajeros() {
        while (!queue.isEmpty()) {
            Pasajero pasajero = queue.poll(); // Obtener y eliminar el primer pasajero de la cola
            System.out.println("Atendiendo al pasajero: " + pasajero.getId() + " de la categoría " + pasajero.getCategoria());
            // Aquí iría la lógica para atender al pasajero
        }
    }
}
