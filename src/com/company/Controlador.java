package com.company;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Controlador{
    Stack<Double> pila = new Stack<>();
    Vista vista = new Vista();

    public Controlador() throws FileNotFoundException {
        File file = new File("C:/Users/Acer/Desktop/datos.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()){
            String codigo = scan.nextLine();
            String[] splited = codigo.split(" ");
            double result = encontrar(splited);
            vista.resultado(result);

        }


    }

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

    public double sumar(){
        double num1 = pila.pop();
        double num2 = pila.pop();
        double num3 = num2 + num1;
        pila.push(num3);
        return num3;
    }
    public double restar(){
        double num1 = pila.pop();
        double num2 = pila.pop();
        double num3 = num2 - num1;
        pila.push(num3);
        return num3;
    }

    public double multiplicar(){
        double num1 = pila.pop();
        double num2 = pila.pop();
        double num3 = num2 * num1;
        pila.push(num3);
        return num3;
    }

    public double dividir(){
        double num1 = pila.pop();
        double num2 = pila.pop();
        double num3 = num2 / num1;
        pila.push(num3);
        return num3;

    }
}
