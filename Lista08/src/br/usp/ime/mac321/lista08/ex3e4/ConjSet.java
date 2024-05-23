package br.usp.ime.mac321.lista08.ex3e4;

import java.util.HashSet;
import java.util.Set;

public class ConjSet <T> {
    public Set<T> elementos;

    public ConjSet () {
        this.elementos = new HashSet<>();
    }

    public void add(T element) {
        elementos.add(element);
    }

    public boolean equals(ConjSet <T> m) {
        return this.elementos.equals(m.elementos);
    }

    public void addAll(ConjSet <T> m) {
        this.elementos.addAll(m.elementos);
    }

    // get elements para dar acesso ao elementos
    public Set<T> getElements() {
        return elementos;
    }
    
    // preciso disso pra poder printar direitinho no teste..
    @Override
    public String toString() {
        return elementos.toString();
    }
}

