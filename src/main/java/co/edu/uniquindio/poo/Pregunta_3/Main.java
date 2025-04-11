package co.edu.uniquindio.poo.Pregunta_3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Persona> cola = new LinkedList<Persona>();
        Cola c = new Cola();

        Persona p1 = new Persona("Juan", 25, "M");
        Persona p2 = new Persona("Maria", 35, "F");
        Persona p3 = new Persona("Pedro", 40, "M");
        Persona p4 = new Persona("Ana", 28, "F");
        Persona p5 = new Persona("Luis", 45, "M");

        cola.offer(p1);
        cola.offer(p2);  
        cola.offer(p3);
        cola.offer(p4);
        cola.offer(p5);

        System.out.println("Cola original: ");
        c.mostrarCola(cola);

        c.filtrarCola(cola);

        System.out.println("\nCola filtrada:");
        c.mostrarCola(cola);
    }
}
