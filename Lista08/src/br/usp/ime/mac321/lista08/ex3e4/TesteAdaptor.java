package br.usp.ime.mac321.lista08.ex3e4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TesteAdaptor {

    // Colocando {a,b,a} em todos os conjuntos e verificando como
    // o adaptor o adapta. Idealmente, todos eles deveriam ficar
    // com apenas {a,b}, sendo representados como conjunto.

    // Vamos utilizar o iterator para percorrer os elementos
    // de cada um dos adaptadores e printar os elementos.

    @Test
    public void testConjArrayListAdapter() {
        ConjArrayList<String> arrayList = new ConjArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("a");

        Adaptor<String> arrayListAdapter = new ConjArrayListAdapter<>(arrayList);

        assertEquals(2, arrayListAdapter.size());

        Set<String> elements = new HashSet<>();
        for (String element : arrayListAdapter) {
            elements.add(element);
        }

        assertTrue(elements.contains("a"));
        assertTrue(elements.contains("b"));
        assertEquals(2, elements.size());
    }

    @Test
    public void testConjSetAdapter() {
        ConjSet<String> set = new ConjSet<>();
        set.add("a");
        set.add("b");
        set.add("a");

        Adaptor<String> setAdapter = new ConjSetAdapter<>(set);

        assertEquals(2, setAdapter.size());

        Set<String> elements = new HashSet<>();
        for (String element : setAdapter) {
            elements.add(element);
        }

        assertTrue(elements.contains("a"));
        assertTrue(elements.contains("b"));
        assertEquals(2, elements.size());
    }

    @Test
    public void testConjLinkedListAdapter() {
        ConjLinkedList<String> linkedList = new ConjLinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("a");

        Adaptor<String> linkedListAdapter = new ConjLinkedListAdapter<>(linkedList);

        assertEquals(2, linkedListAdapter.size());

        Set<String> elements = new HashSet<>();
        for (String element : linkedListAdapter) {
            elements.add(element);
        }

        assertTrue(elements.contains("a"));
        assertTrue(elements.contains("b"));
        assertEquals(2, elements.size());
    }

    @Test
    public void testConjStackAdapter() {
    
        ConjStack<String> stack = new ConjStack<>();
        stack.add("a");
        stack.add("b");
        stack.add("a");

        Adaptor<String> stackAdapter = new ConjStackAdapter<>(stack);

        assertEquals(2, stackAdapter.size());

        Set<String> elements = new HashSet<>();
        for (String element : stackAdapter) {
            elements.add(element);
        }

        assertTrue(elements.contains("a"));
        assertTrue(elements.contains("b"));
        assertEquals(2, elements.size());
    }
}
