

import java.util.LinkedList;
import java.util.Queue;

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
        Queue<Persona> cola = new LinkedList<>();

        // Función para agregar elementos a la cola
        agregarElemento(cola, new Persona("Juan", 25));
        agregarElemento(cola, new Persona("Ana", 30));
        agregarElemento(cola, new Persona("Luis", 35));

        // Función para buscar elementos en la cola
        buscarElemento(cola, new Persona("Ana", 30));
        buscarElemento(cola, new Persona("Maria", 40));
    }

    public static void agregarElemento(Queue<Persona> cola, Persona elemento) {
        cola.add(elemento);
        System.out.println("Elemento " + elemento + " agregado a la cola.");
    }

    public static void buscarElemento(Queue<Persona> cola, Persona elemento) {
        if (cola.contains(elemento)) {
            System.out.println("Elemento " + elemento + " encontrado en la cola.");
        } else {
            System.out.println("Elemento " + elemento + " no se encuentra en la cola.");
        }
    }
}
