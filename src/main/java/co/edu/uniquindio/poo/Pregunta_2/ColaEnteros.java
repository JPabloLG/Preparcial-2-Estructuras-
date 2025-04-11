package co.edu.uniquindio.poo.Pregunta_2;

import co.edu.uniquindio.poo.Pregunta_2.Nodo;

public class ColaEnteros{
    private Nodo<Integer> inicio;
    private Nodo<Integer> fin;
    private int tamano;

    public ColaEnteros() {
        inicio = null;
        fin = null;
        tamano = 0;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void agregar(Integer elemento) {
        Nodo<Integer> nuevo = new Nodo<>(elemento);
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tamano++;
    }

    public void eliminar() {
        if (!isEmpty()) {
            inicio = inicio.getSiguiente();
            tamano--;
        }
    }

    public void imprimir() {
        Nodo<Integer> aux = inicio;
        System.out.print("Cola: ");
        while (aux != null) {
            System.out.print(aux.getElemento() + "\t");
            aux = aux.getSiguiente();
        }
        System.out.println();
    }
}