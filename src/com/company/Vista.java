package com.company;

import java.util.Scanner;

public class Vista {
    Scanner scan = new Scanner(System.in);
    public Vista(){}

    public void resultado(double result){
        System.out.println("El resultado es: " + result);
    }

    public String datos(){
        System.out.println("Ingrese el path de archivo con los datos: ");
        return scan.nextLine();
    }
    public void Error(){
        System.out.println("*********************");
        System.out.println("Ha ocurrido un error.");
        System.out.println("*********************");
    }



}
