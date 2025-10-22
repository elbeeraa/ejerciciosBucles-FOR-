package org.example;

import java.util.Scanner;

public class Carrera {
    private Caballo caballoJugador1;
    private Caballo caballoJugador2;
    private int tiempoMaximo;

    public Carrera(Caballo caballoJugador1,Caballo caballoJugador2){
        this.caballoJugador1 = caballoJugador1;
        this.caballoJugador2 = caballoJugador2;
        tiempoMaximo = 20;
    }

    public void iniciarCarrera(){
        for (int i = 0; i < tiempoMaximo ; i++) {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Jugador 1 elige una opción: ");
            System.out.println("- Velocidad máxima [1]");
            System.out.println("- Velocidad normal [2]");
            System.out.println("- Velocidad mínima [3]");
            System.out.println("- Descansar [4]");
            System.out.print("RESPUESTA:");
            int respuesta1 = Integer.parseInt(teclado.nextLine());
            caballoJugador1.correr(respuesta1);
            System.out.println("Tu caballo tiene: " + caballoJugador1.getPotencia() + " de potencia.");

            System.out.println("-".repeat(40));

            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Jugador 2 elige una opción: ");
            System.out.println("- Velocidad máxima [1]");
            System.out.println("- Velocidad normal [2]");
            System.out.println("- Velocidad mínima [3]");
            System.out.println("- Descansar [4]");
            System.out.print("RESPUESTA:");
            int respuesta2 = Integer.parseInt(teclado2.nextLine());
            caballoJugador2.correr(respuesta2);
            System.out.println("Tu caballo tiene: " + caballoJugador2.getPotencia() + " de potencia.");

            System.out.println("-".repeat(40));
        }
        if(caballoJugador1.getDistanciaRecorrida() > caballoJugador2.getDistanciaRecorrida()) {
            System.out.println("El jugador 1 ha ganado!");
        }else{
            System.out.println("El jugador 2 ha ganado!");
        }
    }

}
