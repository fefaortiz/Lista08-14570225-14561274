package br.usp.ime.mac321.lista08.ex3e4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConjStackAdapter<T> implements Adaptor<T> {
    public ConjStack<T> multiconjunto;

    public ConjStackAdapter(ConjStack<T> multiconjunto) {
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
        Set<T> uniqueElements = new HashSet<>(multiconjunto.elementos);
        return uniqueElements.contains(element);
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
        Set<T> uniqueElements = new HashSet<>(multiconjunto.elementos);
        return uniqueElements.size();
    }

    @Override
    public Iterator<T> iterator() {
        Set<T> uniqueElements = new HashSet<>(multiconjunto.elementos);
        return uniqueElements.iterator();
    }

    @Override
    public String toString() {
        return multiconjunto.getElements().toString();
    }
}


