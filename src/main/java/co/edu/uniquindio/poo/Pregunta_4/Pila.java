package co.edu.uniquindio.poo.Pregunta_4;

import co.edu.uniquindio.poo.Pregunta_2.Nodo;

public class Pila <T>{
    private int size;
    private Nodo<T> cima;

    public Pila() {
        cima = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo<T> getCima() {
        return cima;
    }

    public void setCima(Nodo<T> cima) {
        this.cima = cima;
    }

    public void insertar(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (isEmpty()){
            cima = nuevo;
        }else{
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
        size++;
    }

    public void eliminar(){
        if (!isEmpty()) {
            cima = cima.getSiguiente();
            size--;
        }
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public void imprimir() {
        Nodo<T> aux = cima;
        while(aux!=null) {
            System.out.print(aux.getElemento()+"\t");
            aux = aux.getSiguiente();
        }
        System.out.println();
    }
}

