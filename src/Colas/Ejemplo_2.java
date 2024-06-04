

import java.util.LinkedList;
import java.util.Queue;

public class Ejemplo_2 {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // Función para agregar elementos a la cola
        agregarElemento(cola, "Hola");
        agregarElemento(cola, "Mundo");
        agregarElemento(cola, "Java");

        // Función para buscar elementos en la cola
        buscarElemento(cola, "Mundo");
        buscarElemento(cola, "Python");
    }

    public static void agregarElemento(Queue<String> cola, String elemento) {
        cola.add(elemento);
        System.out.println("Elemento \"" + elemento + "\" agregado a la cola.");
    }

    public static void buscarElemento(Queue<String> cola, String elemento) {
        if (cola.contains(elemento)) {
            System.out.println("Elemento \"" + elemento + "\" encontrado en la cola.");
        } else {
            System.out.println("Elemento \"" + elemento + "\" no se encuentra en la cola.");
        }
    }
}
