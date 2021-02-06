package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControladorTest {

    @Test
    void resolver() {
        double resp;
        String input = "5";
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

        assertEquals(5.0, resp);
    }
}