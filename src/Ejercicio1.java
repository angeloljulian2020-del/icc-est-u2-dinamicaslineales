import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Ejercicio1 {
    //Metodo que devuelve una cadena de texto invertida
    //texto -> COMPUTACION
    //return -> NOICATUPMOC
    //USANDO SOLO PILAS
    public String invertString(String texto){
        texto.toCharArray();
        Deque<Character> pila = new ArrayDeque<>();


        for(char c : texto.toCharArray()){
            pila.push(c);
        }
        String invertido = "";
        while (!pila.isEmpty()){
            invertido += pila.pop();
        }

        return invertido;

    }
}
