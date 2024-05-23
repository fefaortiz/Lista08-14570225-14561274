package br.usp.ime.mac321.lista08.ex3e4;

import java.util.Iterator;

public class ConjSetAdapter<T> implements Adaptor<T> {
    public ConjSet<T> multiconjunto;

    public ConjSetAdapter(ConjSet<T> multiconjunto) {
        this.multiconjunto = multiconjunto;
    }

    @Override
    public boolean add(T element) {
        if (!contains(element)) {
            multiconjunto.add(element);
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(T element) {
        return multiconjunto.elementos.contains(element);
    }

    @Override
    public boolean remove(T element) {
        if (multiconjunto.elementos.remove(element)) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return multiconjunto.elementos.size();
    }

    @Override
    public Iterator<T> iterator() {
        return multiconjunto.elementos.iterator();
    }

    @Override
    public String toString() {
        return multiconjunto.getElements().toString();
    }
}


