package com.company;


import java.io.FileNotFoundException;

/**
 * @author Daniel Cabrera 20289
 * @version 0.3
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
