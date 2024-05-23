package ex3e4;

public class Teste {
    public static void main(String[] args) {
        // Para a lista, esperamos que ab e cd sejam considerados diferentes
        // e retorne a b c d 
        ConjArrayList<String> arrayList1 = new ConjArrayList<>();
        arrayList1.add("a");
        arrayList1.add("b");
        ConjArrayList<String> arrayList2 = new ConjArrayList<>();
        arrayList2.add("c");
        arrayList2.add("b");

        System.out.println("ArrayList 1: " + arrayList1);
        System.out.println("ArrayList 2: " + arrayList2);
        arrayList1.addAll(arrayList2);
        System.out.println("AddAll: " + arrayList1);
        System.out.println("Equal? " + arrayList1.equals(arrayList2));

        // Comparando para dois arrays {a,b} e {b,a}:
        ConjArrayList<String> arrayList3 = new ConjArrayList<>();
        arrayList3.add("a");
        arrayList3.add("b");
        ConjArrayList<String> arrayList4 = new ConjArrayList<>();
        arrayList4.add("b");
        arrayList4.add("a");

        System.out.println("\nArrayList 3: " + arrayList3);
        System.out.println("ArrayList 4: " + arrayList4);
        System.out.println("Equal? " + arrayList3.equals(arrayList4));

        // Para o conjunto, esperamos que ab e cb sejam considerados diferentes
        // e que sua concatenação seja apenas a b c 
        ConjSet<String> set1 = new ConjSet<>();
        set1.add("a");
        set1.add("b");
        ConjSet<String> set2 = new ConjSet<>();
        set2.add("c");
        set2.add("b");

        System.out.println("\nSet 1: " + set1);
        System.out.println("Set 2: " + set2);
        set1.addAll(set2);
        System.out.println("AddAll: " + set1);
        System.out.println("Equal? " + set1.equals(set2));

        // Comparando para o conjunto dois sets {a,b} e {b,a}:
        ConjSet<String> set3 = new ConjSet<>();
        set3.add("a");
        set3.add("b");
        ConjSet<String> set4 = new ConjSet<>();
        set4.add("b");
        set4.add("a");

        System.out.println("\nSet 3: " + set3);
        System.out.println("Set 4: " + set4);
        System.out.println("Equal? " + set3.equals(set4));

        // Para a lista encadeada, esperamos que ab e cb sejam considerados diferentes
        // e que sua concatenação seja a b c b
        ConjLinkedList<String> linkedList1 = new ConjLinkedList<>();
        linkedList1.add("a");
        linkedList1.add("b");
        ConjLinkedList<String> linkedList2 = new ConjLinkedList<>();
        linkedList2.add("c");
        linkedList2.add("b");

        System.out.println("\nLinkedList 1: " + linkedList1);
        System.out.println("LinkedList 2: " + linkedList2);
        linkedList1.addAll(linkedList2);
        System.out.println("AddAll: " + linkedList1);
        System.out.println("Equal? " + linkedList1.equals(linkedList2));

        // Comparando para duas linked lists {a,b} e {b,a}:
        ConjLinkedList<String> linkedList3 = new ConjLinkedList<>();
        linkedList3.add("a");
        linkedList3.add("b");
        ConjLinkedList<String> linkedList4 = new ConjLinkedList<>();
        linkedList4.add("b");
        linkedList4.add("a");

        System.out.println("\nLinkedList 3: " + linkedList3);
        System.out.println("LinkedList 4: " + linkedList4);
        System.out.println("Equal? " + linkedList3.equals(linkedList4));

        // Para a pilha, esperamos que ab e cb sejam considerados diferentes
        // e que sua concatenação seja a b c b
        ConjStack<String> stack1 = new ConjStack<>();
        stack1.add("a");
        stack1.add("b");
        ConjStack<String> stack2 = new ConjStack<>();
        stack2.add("c");
        stack2.add("b");

        System.out.println("\nStack 1: " + stack1);
        System.out.println("Stack 2: " + stack2);
        stack1.addAll(stack2);
        System.out.println("AddAll: " + stack1);
        System.out.println("Equal? " + stack1.equals(stack2));

        // Comparando para duas pilhas {a,b} e {b,a}:
        ConjStack<String> stack3 = new ConjStack<>();
        stack3.add("a");
        stack3.add("b");
        ConjStack<String> stack4 = new ConjStack<>();
        stack4.add("b");
        stack4.add("a");

        System.out.println("\nStack 3: " + stack3);
        System.out.println("Stack 4: " + stack4);
        System.out.println("Equal? " + stack3.equals(stack4));
    }
}

// Como esperado, apenas o set dá true para a comparação de dois conjuntos {a,b} {b,a}
