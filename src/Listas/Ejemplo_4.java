import java.util.ArrayList;
import java.util.List;

public class Ejemplo_4 {
    public static void main(String[] args) {
        List<Character> lista = new ArrayList<>();

        // Función para agregar elementos a la lista
        agregarElemento(lista, 'A');
        agregarElemento(lista, 'B');
        agregarElemento(lista, 'C');

        // Función para buscar elementos en la lista
        buscarElemento(lista, 'B');
        buscarElemento(lista, 'D');
    }

    public static void agregarElemento(List<Character> lista, char elemento) {
        lista.add(elemento);
        System.out.println("Elemento '" + elemento + "' agregado a la lista.");
    }

    public static void buscarElemento(List<Character> lista, char elemento) {
        if (lista.contains(elemento)) {
            System.out.println("Elemento '" + elemento + "' encontrado en la lista.");
        } else {
            System.out.println("Elemento '" + elemento + "' no se encuentra en la lista.");
        }
    }
}
