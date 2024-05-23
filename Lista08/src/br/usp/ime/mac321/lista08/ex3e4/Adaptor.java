package br.usp.ime.mac321.lista08.ex3e4;

import java.util.Iterator;


// Adaptor é uma interface que extende Iterable, ou seja, qualquer classe que implemente Adaptor
// pode ser iterada com um foreach. Além disso, Adaptor é uma interface genérica, ou seja, pode
// ser implementada por qualquer tipo de objeto. Adaptor possui 5 métodos: add, contains, remove,
// size e iterator. O método add adiciona um elemento ao Adaptor, o método contains verifica se um
// elemento está contido no Adaptor, o método remove remove um elemento do Adaptor, o método size
// retorna o tamanho do Adaptor e o método iterator retorna um iterador para o Adaptor. q
public interface Adaptor<T> extends Iterable<T> {
    boolean add(T element);
    boolean contains(T element);
    boolean remove(T element);
    int size();
    Iterator<T> iterator();
    String toString();
}

// Para cada um dos 4 objetos criados em ex3, será criado um Adaptor correspondente.
