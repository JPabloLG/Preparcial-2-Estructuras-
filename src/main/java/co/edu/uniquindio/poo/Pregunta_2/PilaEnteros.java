package co.edu.uniquindio.poo.Pregunta_2;

import co.edu.uniquindio.poo.Pregunta_2.Nodo;

public class PilaEnteros{

    private int size;
    private Nodo<Integer> cima;

    public PilaEnteros() {
        cima = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo<Integer> getCima() {
        return cima;
    }

    public void setCima(Nodo<Integer> cima) {
        this.cima = cima;
    }

    public void insertar(Integer elemento) {
        Nodo<Integer> nuevo = new Nodo<>(elemento);
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

    public Integer pop(){
        if (isEmpty()){
            throw new RuntimeException("La pila se encuenta vacia");
        }

        Integer dato = cima.getElemento();
        cima = cima.getSiguiente();
        size--;
        return dato;
    }

    public void imprimir() {
        Nodo<Integer> aux = cima;
        while(aux!=null) {
            System.out.print(aux.getElemento()+"\t");
            aux = aux.getSiguiente();
        }
        System.out.println();
    }
}