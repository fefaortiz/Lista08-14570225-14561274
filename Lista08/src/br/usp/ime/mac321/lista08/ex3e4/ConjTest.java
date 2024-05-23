package br.usp.ime.mac321.lista08.ex3e4;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConjTest {

    // Espera-se que as comparações sejam falsas para a lista, a lista
    // ligada e a pilha. Já nos conjuntos, {a,b} e {b,a} devem ser o mesmo.


    @Test
    public void testArrayListAddAllAndEquals() {
        ConjArrayList<String> arrayList1 = new ConjArrayList<>();
        arrayList1.add("a");
        arrayList1.add("b");
        ConjArrayList<String> arrayList2 = new ConjArrayList<>();
        arrayList2.add("c");
        arrayList2.add("b");

        arrayList1.addAll(arrayList2);
        assertFalse(arrayList1.equals(arrayList2));

        ConjArrayList<String> arrayList3 = new ConjArrayList<>();
        arrayList3.add("a");
        arrayList3.add("b");
        ConjArrayList<String> arrayList4 = new ConjArrayList<>();
        arrayList4.add("b");
        arrayList4.add("a");

        assertFalse(arrayList3.equals(arrayList4));
    }

    @Test
    public void testSetAddAllAndEquals() {
        ConjSet<String> set1 = new ConjSet<>();
        set1.add("a");
        set1.add("b");
        ConjSet<String> set2 = new ConjSet<>();
        set2.add("c");
        set2.add("b");

        set1.addAll(set2);
        assertFalse(set1.equals(set2));

        ConjSet<String> set3 = new ConjSet<>();
        set3.add("a");
        set3.add("b");
        ConjSet<String> set4 = new ConjSet<>();
        set4.add("b");
        set4.add("a");

        assertTrue(set3.equals(set4));
    }

    @Test
    public void testLinkedListAddAllAndEquals() {
        ConjLinkedList<String> linkedList1 = new ConjLinkedList<>();
        linkedList1.add("a");
        linkedList1.add("b");
        ConjLinkedList<String> linkedList2 = new ConjLinkedList<>();
        linkedList2.add("c");
        linkedList2.add("b");

        linkedList1.addAll(linkedList2);
        assertFalse(linkedList1.equals(linkedList2));

        ConjLinkedList<String> linkedList3 = new ConjLinkedList<>();
        linkedList3.add("a");
        linkedList3.add("b");
        ConjLinkedList<String> linkedList4 = new ConjLinkedList<>();
        linkedList4.add("b");
        linkedList4.add("a");

        assertFalse(linkedList3.equals(linkedList4));
    }

    @Test
    public void testStackAddAllAndEquals() {
        ConjStack<String> stack1 = new ConjStack<>();
        stack1.add("a");
        stack1.add("b");
        ConjStack<String> stack2 = new ConjStack<>();
        stack2.add("c");
        stack2.add("b");

        stack1.addAll(stack2);
        assertFalse(stack1.equals(stack2));

        ConjStack<String> stack3 = new ConjStack<>();
        stack3.add("a");
        stack3.add("b");
        ConjStack<String> stack4 = new ConjStack<>();
        stack4.add("b");
        stack4.add("a");

        assertFalse(stack3.equals(stack4));
    }
}
