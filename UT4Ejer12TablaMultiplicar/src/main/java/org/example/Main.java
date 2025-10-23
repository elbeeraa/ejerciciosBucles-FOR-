package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                int r = i * k;
                System.out.printf("%4d",r);
            }
            System.out.println();
        }
    }
}