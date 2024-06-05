package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayOptions = {1,2,5,2,1,2,9,7,3};
        int i = 0;

        while (i < arrayOptions.length) {
            int opt = arrayOptions[i++];
            switch (opt) {
                case 1:
                    if (i + 1 < arrayOptions.length) {
                        calculateRectangleArea(arrayOptions[i], arrayOptions[i + 1]);
                        i += 2;
                    } else {
                        System.out.println("Faltan parámetros para calcular el área del rectángulo");
                    }
                    break;
                case 2:
                    if (i < arrayOptions.length) {
                        createAndDisplayArray(arrayOptions[i]);
                        i++;
                    } else {
                        System.out.println("Falta el parámetro para crear el arreglo");
                    }
                    break;
                case 3:
                    System.out.println("Termina el programa");
                    return;
                default:
                    System.out.println("No existe la opción para este valor: " + opt);
            }
        }
    }

    public static void calculateRectangleArea(int side1, int side2) {
        double area = side1 * side2;
        System.out.println("El área del rectangulo es: " + area);
    }

    public static void createAndDisplayArray(int n) {
        if (n <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor a 0");
            return;
        }

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = n - i;
        }

        System.out.println("Elementos del arreglo desde la mitad hasta el final:");
        for (int i = n / 2; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}