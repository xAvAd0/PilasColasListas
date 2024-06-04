import java.util.ArrayList;
import java.util.List;

class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return edad == persona.edad && nombre.equals(persona.nombre);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }
}

public class Ejemplo_5 {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();

        // Función para agregar elementos a la lista
        agregarElemento(lista, new Persona("Juan", 25));
        agregarElemento(lista, new Persona("Ana", 30));
        agregarElemento(lista, new Persona("Luis", 35));

        // Función para buscar elementos en la lista
        buscarElemento(lista, new Persona("Ana", 30));
        buscarElemento(lista, new Persona("Maria", 40));
    }

    public static void agregarElemento(List<Persona> lista, Persona elemento) {
        lista.add(elemento);
        System.out.println("Elemento " + elemento + " agregado a la lista.");
    }

    public static void buscarElemento(List<Persona> lista, Persona elemento) {
        if (lista.contains(elemento)) {
            System.out.println("Elemento " + elemento + " encontrado en la lista.");
        } else {
            System.out.println("Elemento " + elemento + " no se encuentra en la lista.");
        }
    }
}
