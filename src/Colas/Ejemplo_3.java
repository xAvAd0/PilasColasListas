import java.util.LinkedList;
import java.util.Queue;

public class Ejemplo_3{
    public static void main(String[] args) {
        Queue<Double> cola = new LinkedList<>();

        // Función para agregar elementos a la cola
        agregarElemento(cola, 3.14);
        agregarElemento(cola, 2.71);
        agregarElemento(cola, 1.41);

        // Función para buscar elementos en la cola
        buscarElemento(cola, 2.71);
        buscarElemento(cola, 1.62);
    }

    public static void agregarElemento(Queue<Double> cola, double elemento) {
        cola.add(elemento);
        System.out.println("Elemento " + elemento + " agregado a la cola.");
    }

    public static void buscarElemento(Queue<Double> cola, double elemento) {
        if (cola.contains(elemento)) {
            System.out.println("Elemento " + elemento + " encontrado en la cola.");
        } else {
            System.out.println("Elemento " + elemento + " no se encuentra en la cola.");
        }
    }
}
