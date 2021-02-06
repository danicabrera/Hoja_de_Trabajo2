/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * @author Daniel Cabrera 20289
 * @name Stack.java
 * @version 1.3
 */
package com.company;
/**
 * Interfaz que crea el Stack de pila.
 */
public interface Stack<E> {
    /**
     * @param item
     * Ingresa un item a la pila de datos.
     *
     */
    void push(E item);
    // pre:
    // post: item is added to stack
    // will be popped next if no intervening push
    /**
     * @return  E Devuelve el último valor ingresado a la pila y lo elimina de la pila.
     */
    E pop();
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    /**
     * @return  E Devuelve el último valor ingresado en la pila.
     */
    E peek();
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    /**
     * @return boolean Regresa un boolean dependiendo si esta vacía o no.
     */
    boolean empty();
    // post: returns true if and only if the stack is empty
    /**
     * @return  int Devuelve el número de elementos en la pila.
     */
    int size();
    // post: returns the number of elements in the stack
}
