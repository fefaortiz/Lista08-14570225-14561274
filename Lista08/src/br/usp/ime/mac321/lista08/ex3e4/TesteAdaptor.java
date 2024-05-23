package ex3e4;

public class TesteAdaptor {
    public static void main(String[] args) {
        // Colocando {a,b,a} em todos os conjuntos e verificando como
        // o adaptor o adapta. Idealmente, todos eles deveriam ficar
        // com apenas {a,b}, sendo representados como conjunto.

        // Vamos utilizar o iterator para percorrer os elementos
        // de cada um dos adaptadores e printar os elementos.

        // Teste para ConjArrayList Adapter
        ConjArrayList<String> arrayList = new ConjArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("a");
        
        Adaptor<String> arrayListAdapter = new ConjArrayListAdapter<>(arrayList);
        
        System.out.println("ArrayList Adapter Size: " + arrayListAdapter.size());
        System.out.println("ArrayList Adapter Elements: ");
        for (String element : arrayListAdapter) {
            System.out.println(element);
        }

        // Teste para ConjSetAdapter
        ConjSet<String> set = new ConjSet<>();
        set.add("a");
        set.add("b");
        set.add("a");
        
        Adaptor<String> setAdapter = new ConjSetAdapter<>(set);
        
        System.out.println("\nSet Adapter Size: " + setAdapter.size());
        System.out.println("Set Adapter Elements: ");
        for (String element : setAdapter) {
            System.out.println(element);
        }

        // Teste para ConjLinkedList Adapter
        ConjLinkedList<String> linkedList = new ConjLinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("a");
        
        Adaptor<String> linkedListAdapter = new ConjLinkedListAdapter<>(linkedList);
        
        System.out.println("\nLinkedList Adapter Size: " + linkedListAdapter.size());
        System.out.println("LinkedList Adapter Elements: ");
        for (String element : linkedListAdapter) {
            System.out.println(element);
        }

        // Teste para ConjStack Adapter
        ConjStack<String> stack = new ConjStack<>();
        stack.add("a");
        stack.add("b");
        stack.add("a");
        
        Adaptor<String> stackAdapter = new ConjStackAdapter<>(stack);
        
        System.out.println("\nStack Adapter Size: " + stackAdapter.size());
        System.out.println("Stack Adapter Elements: ");
        for (String element : stackAdapter) {
            System.out.println(element);
        }
    }
}

