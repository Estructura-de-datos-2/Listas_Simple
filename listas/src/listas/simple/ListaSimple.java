package listas.simple;


/**
*Definicion de lista simple
*@autor José Emmanuel Arredondo Escalante
*@date 15 de octubre 2026
*/

public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    // O(1) no se recorre la lista
    public void insertarAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (cabeza == null) {
            // Lista vacía el nuevo nodo es el único elemento
            cabeza = nuevo;
        } else {
            nuevo.setSiguiente(cabeza); // 1) conectar el nuevo nodo a la cabeza actual
            cabeza = nuevo;             // 2) actualizar la cabeza
        }
    }

    public void recorrer() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
