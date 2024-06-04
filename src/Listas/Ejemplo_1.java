import java.util.ArrayList;
import java.util.List;

public class Ejemplo_1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        // Función para agregar elementos a la lista
        agregarElemento(lista, 5);
        agregarElemento(lista, 10);
        agregarElemento(lista, 15);

        // Función para buscar elementos en la lista
        buscarElemento(lista, 10);
        buscarElemento(lista, 20);
    }

    public static void agregarElemento(List<Integer> lista, int elemento) {
        lista.add(elemento);
        System.out.println("Elemento " + elemento + " agregado a la lista.");
    }

    public static void buscarElemento(List<Integer> lista, int elemento) {
        if (lista.contains(elemento)) {
            System.out.println("Elemento " + elemento + " encontrado en la lista.");
        } else {
            System.out.println("Elemento " + elemento + " no se encuentra en la lista.");
        }
    }
}
