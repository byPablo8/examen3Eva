package examen3Eva;

/**
 * PRE:---
 * POST: Creo la clase Nodo para el posible funcionamiento de la simpleLinkedList.
 */
public class Node {
    private int content;
    private Node next;

    //creo los constructores necesarios.
    public Node(int content, Node next) {
        this.content = content;
        this.next = next;
    }

    //Creo los getter y setters necesarios
    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    //creo el toString para poder mostrar por si acaso
    @Override
    public String toString() {
        return "Content = " + content + " Next = " + next;
    }

}
