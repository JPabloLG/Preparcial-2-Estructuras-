package co.edu.uniquindio.poo.Pregunta_3;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    public void filtrarCola(Queue<Persona> cola) {
        Queue<Persona> aux = new LinkedList<>();

        while (!cola.isEmpty()) {
            Persona p = cola.poll(); // Extraemos la persona de la cola
            if (!(p.getSexo().equals("M") && p.getEdad() >= 30 && p.getEdad() <= 50)) {
                aux.offer(p); 
            }
        }
        cola.addAll(aux); // Agregamos las personas filtradas a la cola original
    }

    public void mostrarCola(Queue<Persona> cola){
        for (Persona p : cola) {
            System.out.println(p);
        }
    }
}
