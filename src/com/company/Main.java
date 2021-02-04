package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/Acer/Desktop/datos.txt");
        Scanner scan = new Scanner(file);
        System.out.println(scan.nextLine());


    }
}
