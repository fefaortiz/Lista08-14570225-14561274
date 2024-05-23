package br.usp.ime.mac321.lista08.ex3e4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConjArrayListAdapter<T> implements Adaptor<T> {
    public ConjArrayList<T> multiconjunto;

    public ConjArrayListAdapter(ConjArrayList<T> multiconjunto) {
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
        return multiconjunto.getElements().contains(element);
    }

    @Override
    public boolean remove(T element) {
        return multiconjunto.getElements().remove(element);
    }

    @Override
    public int size() {
        Set<T> uniqueElements = new HashSet<>(multiconjunto.getElements());
        return uniqueElements.size();
    }

    @Override
    public Iterator<T> iterator() {
        Set<T> uniqueElements = new HashSet<>(multiconjunto.getElements());
        return uniqueElements.iterator();
    }
}