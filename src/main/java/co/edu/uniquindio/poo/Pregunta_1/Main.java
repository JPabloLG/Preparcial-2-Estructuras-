package co.edu.uniquindio.poo.Pregunta_1;

public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        
        System.out.println("Lista original:");
        lista.mostrar();

        lista.invertirConPila();

        System.out.println("Lista invertida:");
        lista.mostrar();
    }
}
