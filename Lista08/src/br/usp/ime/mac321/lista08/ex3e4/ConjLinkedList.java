package br.usp.ime.mac321.lista08.ex3e4;
import java.util.LinkedList;
import java.util.List;

public class ConjLinkedList<T> {
    public List<T> elementos;

    public ConjLinkedList() {
        this.elementos = new LinkedList<>();
    }

    public void add(T element) {
        elementos.add(element);
    }

    public boolean equals(ConjLinkedList<T> m) {
        return this.elementos.equals(m.elementos);
    }

    public void addAll(ConjLinkedList<T> m) {
        this.elementos.addAll(m.elementos);
    }

    // preciso disso pra poder printar direitinho no teste..
    @Override
    public String toString() {
        return elementos.toString();
    }

    // get elements para dar acesso ao elementos
    public List<T> getElements() {
        return elementos;
    }
}

