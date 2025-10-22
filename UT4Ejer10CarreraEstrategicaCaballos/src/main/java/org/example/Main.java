package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Caballo caballoJugador1 = new Caballo();
        Caballo caballoJugador2 = new Caballo();

        Carrera carrera = new Carrera(caballoJugador1,caballoJugador2);
        carrera.iniciarCarrera();
    }
}