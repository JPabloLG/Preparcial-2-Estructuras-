package co.edu.uniquindio.poo.Pregunta_5;

import java.util.Stack;

public class BalanceoSimbolos {
    public static boolean estaBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char c : expresion.toCharArray()) {
            // Si es un símbolo de apertura, lo agregamos a la pila
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            }
            // Si es un símbolo de cierre, verificamos correspondencia
            else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    return false; // Cierre sin apertura
                }

                char top = pila.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false; // Mismatch de símbolos
                }
            }
        }

        // Si la pila está vacía, los símbolos están bien balanceados
        return pila.isEmpty();
    }
}