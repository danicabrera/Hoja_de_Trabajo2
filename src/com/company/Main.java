
/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * @author Daniel Cabrera 20289
 * @name Main.java
 * @version 1.3
 */
package com.company;
import java.io.FileNotFoundException;


/**
 * Main.java
 * Inicia las acciones del programa.
 * Llama a la clase Controlador
 * Los resultados de las operaciones.
 */
public class Main {
    public static void main(String[] args)  {
        try {
            Controlador control = new Controlador();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
