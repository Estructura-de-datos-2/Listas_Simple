package listas.simple;

/*
*Listas simples, implemantacion del metodo Main
*@autor José Emmanuel Arredondo Escalante
*@date 15 de octubre de 2026
*/

public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.recorrer();            //  no imprime nada
        lista.insertarAlInicio(30);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(10);
        lista.recorrer();            // deberia de imprimir 10, 20, 30
    }
}
