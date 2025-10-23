package es.masanz.ut4.bucles;

import java.util.Scanner;


public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nivel: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int x = n - i - 1;
            pintar('_', x);
            int y = i*2 + 1;
            pintar('*', y);
            System.out.println();
        }
    }

    private static void pintar(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}
