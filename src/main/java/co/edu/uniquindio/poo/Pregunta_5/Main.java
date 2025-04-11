package co.edu.uniquindio.poo.Pregunta_5;

public class Main {
    public static void main(String[] args) {
        BalanceoSimbolos balanceo = new BalanceoSimbolos();

        String exp1 = "(6-7)/4]"; 
        String exp2 = "[(1+2)*4]+5";

        System.out.println(exp1 + " -> " + balanceo.estaBalanceado(exp1)); // false
        System.out.println(exp2 + " -> " + balanceo.estaBalanceado(exp2)); // true
    }
}
