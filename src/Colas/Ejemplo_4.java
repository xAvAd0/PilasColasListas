

import java.util.LinkedList;
import java.util.Queue;

public class Ejemplo_4 {
    public static void main(String[] args) {
        Queue<Character> cola = new LinkedList<>();

        // Función para agregar elementos a la cola
        agregarElemento(cola, 'A');
        agregarElemento(cola, 'B');
        agregarElemento(cola, 'C');

        // Función para buscar elementos en la cola
        buscarElemento(cola, 'B');
        buscarElemento(cola, 'D');
    }

    public static void agregarElemento(Queue<Character> cola, char elemento) {
        cola.add(elemento);
        System.out.println("Elemento '" + elemento + "' agregado a la cola.");
    }

    public static void buscarElemento(Queue<Character> cola, char elemento) {
        if (cola.contains(elemento)) {
            System.out.println("Elemento '" + elemento + "' encontrado en la cola.");
        } else {
            System.out.println("Elemento '" + elemento + "' no se encuentra en la cola.");
        }
    }
}
