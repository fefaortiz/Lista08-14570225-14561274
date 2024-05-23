package br.usp.ime.mac321.lista08.ex3e4;

import java.util.ArrayList;
import java.util.List;

public class ConjArrayList<T> {
    private List<T> elementos;

    public ConjArrayList() {
        this.elementos = new ArrayList<>();
    }

    public void add(T element) {
        elementos.add(element);
    }

    public boolean equals(ConjArrayList<T> m) {
        return this.elementos.equals(m.elementos);
    }

    public void addAll(ConjArrayList<T> m) {
        this.elementos.addAll(m.elementos);
    }

    // retorna os elementos em uma classe padrão list
    public List<T> getElements() {
        return elementos;
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}

