package ex3e4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConjLinkedListAdapter<T> implements Adaptor<T> {
    public ConjLinkedList<T> multiconjunto;

    public ConjLinkedListAdapter(ConjLinkedList<T> multiconjunto) {
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
}

