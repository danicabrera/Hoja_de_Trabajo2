/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * @author Daniel Cabrera 20289
 * @name Controlador.java
 * @version 1.3
 */

package com.company;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Corre el programa. Lee los archivos línea por línea, luego hace los cálculos y devuelve los valores obtenidos.
 */
public class Controlador implements Icalculadora{

    Stack<Double> pila = new Stack<>();
    Vista vista = new Vista();
    /**
     * Corre el programa, lee el archivo y hace los
     * cálculos correspondientes
     * @throws FileNotFoundException cuando no encuentra un archivo.
     */
    public Controlador() throws FileNotFoundException {

        String path = vista.datos();
        //Aquí es para que ingresar el pathway del archivo.
        File file = new File(path);
        Scanner scan = new Scanner(file);
        //Hace un while para leer todas las líneas del archivo.
        while(scan.hasNextLine()){
            String codigo = scan.nextLine();
            String[] splited = codigo.split(" ");
            double result = encontrar(splited);
            vista.resultado(result);

        }


    }
    /**
     * @param s
     * Utiliza un array de Strings para extraer los números del documentos
     * para facilitar su separación
     * @return  double Regresa un double con el resultado final.
     *
     */
    public double encontrar(String[] s){
        double resultado = 0;
        for (String revision : s) {
            double determinado = this.resolver(revision);
            if(determinado == 0.1){
                resultado = sumar();
            } else if (determinado == 0.2){
                resultado = restar();
            } else if (determinado == 0.3){
                resultado = multiplicar();
            } else if (determinado == 0.4){
                resultado = dividir();
            } else if (determinado == 0.7){
                vista.Error();

            } else{
                pila.push(determinado);
            }

        }
            return resultado;
    }

    /**
     * @param input
     * Recibe un input en forma de texto
     * @return  double resp un valor de double dependiendo si es un número u operación
     * En caso de ser número regresa el propio número,
     * si es una operación usa un código de identificación de operación.
     */
    public double resolver(String input){
        double resp;
        resp = switch (input) {
            case "1" -> 1.0;
            case "2" -> 2.0;
            case "3" -> 3.0;
            case "4" -> 4.0;
            case "5" -> 5.0;
            case "6" -> 6.0;
            case "7" -> 7.0;
            case "8" -> 8.0;
            case "9" -> 9.0;
            case "0" -> 0.0;
            case "+" -> 0.1;
            case "-" -> 0.2;
            case "*" -> 0.3;
            case "/" -> 0.4;
            default -> 0.7;
        };

        return resp;

    }
    /**
     * @return  double num3. Regresa el producto de una suma.
     *
     */
    public double sumar(){
        double num1 = pila.pop();
        double num2 = pila.pop();
        double num3 = num2 + num1;
        pila.push(num3);
        return num3;
    }
    /**
     * @return  double num3. Regresa el producto de una resta.
     *
     */
    public double restar(){
        double num1 = pila.pop();
        double num2 = pila.pop();
        double num3 = num2 - num1;
        pila.push(num3);
        return num3;
    }
    /**
     * @return  double num3. Regresa el producto de una multiplicacion.
     *
     */
    public double multiplicar(){
        double num1 = pila.pop();
        double num2 = pila.pop();
        double num3 = num2 * num1;
        pila.push(num3);
        return num3;
    }
    /**
     * @return  double num3. Regresa el producto de una division.
     *
     */
    public double dividir(){
        double num1 = pila.pop();
        double num2 = pila.pop();
        double num3 = num2 / num1;
        pila.push(num3);
        return num3;

    }


}
