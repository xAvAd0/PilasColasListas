import java.util.ArrayList;
import java.util.List;

public class Ejemplo_3 {
    public static void main(String[] args) {
        List<Double> lista = new ArrayList<>();

        // Función para agregar elementos a la lista
        agregarElemento(lista, 3.14);
        agregarElemento(lista, 2.71);
        agregarElemento(lista, 1.41);

        // Función para buscar elementos en la lista
        buscarElemento(lista, 2.71);
        buscarElemento(lista, 1.62);
    }

    public static void agregarElemento(List<Double> lista, double elemento) {
        lista.add(elemento);
        System.out.println("Elemento " + elemento + " agregado a la lista.");
    }

    public static void buscarElemento(List<Double> lista, double elemento) {
        if (lista.contains(elemento)) {
            System.out.println("Elemento " + elemento + " encontrado en la lista.");
        } else {
            System.out.println("Elemento " + elemento + " no se encuentra en la lista.");
        }
    }
}
