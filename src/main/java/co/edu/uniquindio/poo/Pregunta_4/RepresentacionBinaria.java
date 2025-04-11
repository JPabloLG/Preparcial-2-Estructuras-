package co.edu.uniquindio.poo.Pregunta_4;

public class RepresentacionBinaria {
    public static void main(String[] args) {
        int n = 3;
        Pila<Integer> pila = binario(n);
        pila.imprimir();

    }

    public static Pila<Integer> binario(int n){
        Pila<Integer> pilaResultado = new Pila<>();
        while(n > 0) {
            if (n == 2) {
                pilaResultado.insertar(0);
            } else {
                pilaResultado.insertar(n % 2);
            }
            n = n / 2;
        }
        return pilaResultado;
    }
}
