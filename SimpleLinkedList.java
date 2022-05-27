package examen3Eva;

import clubSocios.NodeSocios;

public class SimpleLinkedList {
    private Node first;
    private int size;

    public SimpleLinkedList() {
        this.first = null;
        this.size = 0;
    }

    public SimpleLinkedList(Node first) {
        this.first = first;
        this.size = 1;
    }

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

    public void show() {
        Node p = first;
        for (int i = 0; i < size; i++) {
            System.out.println("[ " + i + "] -> " + p.getContent());
            p = p.getNext();
        }
    }

    public boolean eliminarMayor(int index){
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
