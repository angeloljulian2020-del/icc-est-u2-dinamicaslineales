import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkedList();
        runQueue();
        runStack();

        System.out.println("Ejercicio 1");

        Ejercicio1 ejercicio1 = new Ejercicio1();
        String texto = "COMPUTACION";
        String invertido = ejercicio1.invertString(texto);
        System.out.println(invertido);
        System.out.println("Texto original " + texto);
        System.out.println("Invertido: " + invertido);

        System.out.println("Ejercicio 2");

        Ejercicio2 ejercicio2 = new Ejercicio2();

        String palabra1 = "radar";
        String palabra2 = "computacion";

        System.out.println("Es palindromo radar: " + ejercicio2.esPalindromo(palabra1));
        System.out.println("Es palindromo computacion: " + ejercicio2.esPalindromo(palabra2));

    }

    private static void runStack() {
        //forma 1 de intanciar pilas

        Stack<String> pila = new Stack();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        String elemento=pila.pop();
        System.out.println(pila.size());
        System.out.println(elemento);

        //forma 2 de intanciar pilas

        Deque<String> pila2 = new ArrayDeque();

        //forma 3 de instanciar filas
        Deque<String> pila3 = new LinkedList();
        pila2.push("a");
        pila3.push("A");
        pila.pop();
        pila.pop();

    }

    private static void runQueue() {
        System.out.println("Cola");
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");
        System.out.println(cola.isEmpty());
        System.out.println(cola.size());

        System.out.println(cola.peek());
        System.out.println(cola.size());

        System.out.println(cola.poll());
        System.out.println(cola.size());

        while(!cola.isEmpty()){
            String cliente = cola.poll();
            System.out.println("Atendi a " + cliente);
        }

        //Ofer -> agrega al final
        //peek -> devuelve el primero sin eliminar
        //poll -> devuelve el primero y lo elimina
    }

    private static void runLinkedList() {
        System.out.println("Lista enlazada/Linked List");
        //intanciamos la clase
        LinkedList<String> nombres = new LinkedList<>();
        System.out.println("Esta vacia: " + nombres.isEmpty());
        System.out.println("Tamanio: " + nombres.size());

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");
        System.out.println(nombres.getFirst());
        System.out.println(nombres.get(2));
        System.out.println(nombres.getLast());
        
        //peek:retorna el primero pero no le eleimina
        System.out.println(nombres.peek());
        System.out.println(nombres.size());

        //pop:elimina el primero
        System.out.println(nombres.pop());
        System.out.println(nombres.size());
    }
}
