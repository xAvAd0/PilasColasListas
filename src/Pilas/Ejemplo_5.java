class Nodo {
    int valor;
    Nodo siguiente;

    Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

public class Ejemplo_5 {
    Nodo tope;

    Ejemplo_5() {
        this.tope = null;
    }

    void push(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = tope;
        tope = nuevoNodo;
    }

    int pop() {
        if (tope == null) {
            System.out.println("La pila está vacía");
            return -1;
        }
        int valor = tope.valor;
        tope = tope.siguiente;
        return valor;
    }

    public static void main(String[] args) {
        Ejemplo_5 pila = new Ejemplo_5();
        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println("Elemento eliminado: " + pila.pop());
        System.out.println("Elemento eliminado: " + pila.pop());
    }
}
