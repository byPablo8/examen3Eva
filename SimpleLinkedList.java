package examen3Eva;


/**
 * PRE:
 * POST: Creo la Simple linked list con metodos para añadir y eliminar.
 */
public class SimpleLinkedList {
    private Node first;
    private int size;

    //creo los constructores necesarios para el funcionamiento
    public SimpleLinkedList() {
        this.first = null;
        this.size = 0;
    }

    public SimpleLinkedList(Node first) {
        this.first = first;
        this.size = 1;
    }

    //creo los getter y setters
    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * PRE:
     * POST: Este metodo permite añadir ala lista
     */
    public boolean add(Node node) {
        try {
            if (size == 0) {
                first = node;
            } else {
                Node p = first;
                for (int i = 1; i < size; i++) {
                    p = p.getNext();
                }
                p.setNext(node);
            }
            size++;
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    /**
     * PRE:
     * POST: Este metodo permite añadir ala lista
     */
    public boolean add(int position, Node node) {
        if (position == 0) {
            node.setNext(first);
            first = node;
        } else if (position == size) {
            return add(node);
        } else {
            Node p = first;
            for (int i = 0; i < position; i++) {
                p = p.getNext();
            }
            node.setNext(p.getNext());
            p.setNext(node);
        }
        size++;
        return true;
    }

    /**
     * PRE:
     * POST: Este metodo permite mostrar la listaEnlazada
     */
    public void show() {
        Node p = first;
        for (int i = 0; i < size; i++) {
            System.out.println("[ " + i + "] -> " + p.getContent());
            p = p.getNext();
        }
    }

    /**
     * PRE:
     * POST: Este metodo permite eliminar contenido de la listaEnlazada
     */
    public boolean eliminar(int index) {
        try {
            if (index == 0) {
                first = first.getNext();
                size--;
                return true;
            } else if (index == size - 1) {
                Node p = first;
                for (int i = 1; i <= index - 1; i++) {
                    p = p.getNext();
                }
                p.setNext(null);
                size--;
                return true;
            } else {
                Node p = first;
                for (int i = 1; i <= index - 1; i++) {
                    p = p.getNext();
                }
                p.setNext(p.getNext().getNext());
                size--;
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
