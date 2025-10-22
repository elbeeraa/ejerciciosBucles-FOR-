package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame un numero de fila:");
        int respuestaFila = Integer.parseInt(teclado.nextLine());
        System.out.print("Dame un numero de columna:");
        int respuestaColumna = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < respuestaFila; i++) {
            for (int k = 1; k <= respuestaColumna; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}