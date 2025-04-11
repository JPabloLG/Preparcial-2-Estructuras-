package co.edu.uniquindio.poo.Pregunta_2;

public class Main {

    public static void main(String[] args) {
        PilaEnteros pila = new PilaEnteros();
        pila.insertar(4);
        pila.insertar(2);
        pila.insertar(15);
        pila.insertar(1);
        pila.insertar(17);
        pila.insertar(234);
        pila.imprimir();
        ColaEnteros colaSalida = pilatoCola(pila);
        colaSalida.imprimir();
    }

    public static ColaEnteros pilatoCola(PilaEnteros pila){
        ColaEnteros cola = new ColaEnteros();

        while (!pila.isEmpty()){
            Integer num = pila.pop();
            if(esPrimo(num)) {
                cola.agregar(num);
            }
        }
        return cola;

    }

    public static boolean esPrimo(int numero) {
        if (numero < 1) {
            return false;
        }
        if(numero == 1){
            return true;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
