/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * @author Daniel Cabrera 20289
 * @name Vista.java
 * @version 1.3
 */

package com.company;
/**
 * Clase que contiene toda la vista. En este caso todos los prints.
 */
import java.util.Scanner;


public class Vista {
    Scanner scan = new Scanner(System.in);
    public Vista(){}

    /**
     * @param result
     * Se recibe un valor de resultado de una operación.
     * Devuelve la frase con el resultado.
     */
    public void resultado(double result){
        System.out.println("El resultado es: " + result);
    }

    /**
     * @return  String Devuelve un String de lo ingresado por el usuario.
     */
    public String datos(){
        System.out.println("Ingrese el path de archivo con los datos: ");
        return scan.nextLine();
    }

    /**
     * Devuelve una frase cuando ha ocurrido un error.
     */
    public void Error(){
        System.out.println("*********************");
        System.out.println("Ha ocurrido un error.");
        System.out.println("*********************");
    }

}
