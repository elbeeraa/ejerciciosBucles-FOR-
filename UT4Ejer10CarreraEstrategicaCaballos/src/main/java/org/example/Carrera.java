package org.example;

import java.util.Scanner;

public class Carrera {
    private Caballo caballoJugador1;
    private Caballo caballoJugador2;
    private int tiempoMaximo;

    public Carrera(){
        this.caballoJugador1 = new Caballo();
        this.caballoJugador2 = new Caballo();
        tiempoMaximo = 20;
    }

    public void iniciarCarrera(){
        for (int i = 0; i < tiempoMaximo ; i++) {

            int respuesta1 = obtenerOpcion(1, caballoJugador1.getPotencia());
            caballoJugador1.correr(respuesta1);
            System.out.println("Tu caballo tiene \uD83D\uDC0E : " + caballoJugador1.getPotencia() + " de potencia.");

            System.out.println("-".repeat(40));

            int respuesta2 = obtenerOpcion(2, caballoJugador2.getPotencia());
            caballoJugador2.correr(respuesta2);
            System.out.println("Tu caballo tiene \uD83D\uDC0E : " + caballoJugador2.getPotencia() + " de potencia.");


            if(respuesta1 != 4) {
                System.out.println("S " + "🏁" + "-".repeat(400));
                System.out.println("T " + "🏁" + " ".repeat(caballoJugador1.getDistanciaRecorrida()) + "\uD83C\uDFC7");
                System.out.println("A " + "🏁" + "-".repeat(400));
            } else {
                System.out.println("S " + "🏁" + "-".repeat(400));
                System.out.println("T " + "🏁" + " ".repeat(caballoJugador1.getDistanciaRecorrida()) + "\uD83C\uDFC7" + "Zzz");
                System.out.println("A " + "🏁" + "-".repeat(400));
            }

            if(respuesta2 != 4) {
                System.out.println("R " + "🏁" + "-".repeat(400));
                System.out.println("T " + "🏁" + " ".repeat(caballoJugador2.getDistanciaRecorrida()) + "\uD83C\uDFC7\uD83C\uDFFE");
                System.out.println("  " + "🏁" + "-".repeat(400));
            }else{
                System.out.println("R " + "🏁" + "-".repeat(400));
                System.out.println("T " + "🏁" + " ".repeat(caballoJugador2.getDistanciaRecorrida()) + "\uD83C\uDFC7\uD83C\uDFFE"+"Zzz");
                System.out.println("  " + "🏁" + "-".repeat(400));
            }

        }
        System.out.println("-".repeat(30)+"FIN DE LA CARRERA"+"-".repeat(30));
        if(caballoJugador1.getDistanciaRecorrida() > caballoJugador2.getDistanciaRecorrida()) {
            System.out.println("El jugador 1 ha ganado!" + "\uD83C\uDF89");
        }else{
            System.out.println("El jugador 2 ha ganado!" + "\uD83C\uDF89");
        }
    }

    private int obtenerOpcion(int numJugador, int potencia) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Jugador " + numJugador + " con potencia " + potencia + " elige una opción: ");
        System.out.println("- Velocidad máxima [1] potencia -15");
        System.out.println("- Velocidad normal [2] potencia -10");
        System.out.println("- Velocidad mínima [3] potencia -5");
        System.out.println("- Descansar [4]");
        System.out.print("RESPUESTA:");
        return Integer.parseInt(teclado.nextLine());
    }

}

