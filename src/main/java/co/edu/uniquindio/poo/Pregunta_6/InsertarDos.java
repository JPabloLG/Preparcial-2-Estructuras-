package co.edu.uniquindio.poo.Pregunta_6;

import co.edu.uniquindio.poo.Pregunta_1.ListaSimple;
import co.edu.uniquindio.poo.Pregunta_1.Nodo;

public class InsertarDos {
    public static void main(String[] args) {
    ListaSimple lista = new ListaSimple();
    lista.agregar(1);
    lista.agregar(2);
    lista.agregar(3);
    lista.agregar(6);
    lista.agregar(12);
    ListaSimple lista2 = insertarDos(lista);
    lista2.mostrar();
    }
    //Recursividad indirecta
    public static ListaSimple insertarDos(ListaSimple lista) {
        return comprobarSuma(lista.getCabeza(), lista, 0);
    }

    private static ListaSimple comprobarSuma(Nodo nodo, ListaSimple lista, int suma) {
        if (nodo.getSiguiente() == null) {
            // Caso base
            if (suma == nodo.getDato()) {
                lista.agregar(2);
            }
            return lista;
        }

        suma += nodo.getDato();
        return comprobarSuma(nodo.getSiguiente(), lista, suma);
    }

}
