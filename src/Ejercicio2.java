import java.util.Stack;

public class Ejercicio2 {
    public boolean esPalindromo(String texto){
        Stack<Character> pila = new Stack<>();
        for(char c : texto.toCharArray()){
            pila.push(c);
        }
        for(char c : texto.toCharArray()){
            if(c != pila.pop()){
                return false;
            }
        }
        return true;
    }
}