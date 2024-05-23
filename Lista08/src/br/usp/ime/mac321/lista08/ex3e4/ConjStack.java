package ex3e4;

import java.util.Stack;

public class ConjStack<T> {
    public Stack<T> elementos;

    public ConjStack() {
        this.elementos = new Stack<>();
    }

    public void add(T element) {
        elementos.add(element);
    }

    public boolean equals(ConjStack<T> m) {
        return this.elementos.equals(m.elementos);
    }

    public void addAll(ConjStack<T> m) {
        this.elementos.addAll(m.elementos);
    }

    // preciso disso pra poder printar direitinho no teste..
    @Override
    public String toString() {
        return elementos.toString();
    }
}
