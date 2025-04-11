package co.edu.uniquindio.poo.Pregunta_1;

import java.util.Stack;

public class ListaSimple {
    Nodo cabeza;

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    public void mostrar() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }

    public void invertirConPila() {
        Stack<Nodo> pila = new Stack<>();
        Nodo temp = cabeza;

        while (temp != null) {
            pila.push(temp);
            temp = temp.siguiente;
        }

        // Se reconstruye la lista en orden inverso
        if (!pila.isEmpty()) {
            cabeza = pila.pop();
            temp = cabeza;
        }

        while (!pila.isEmpty()) {
            temp.siguiente = pila.pop();
            temp = temp.siguiente;
        }
        temp.siguiente = null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
}
