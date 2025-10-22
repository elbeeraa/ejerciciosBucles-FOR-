package org.example;

public class Caballo {
    private int velocidadMaxima;
    private int velocidadNormal;
    private int velocidadMinima;
    private int potencia;
    private int distanciaRecorrida;

    public Caballo(){
        potencia = 100;
        velocidadMaxima = 10;
        velocidadNormal = 7;
        velocidadMinima = 3;
    }

    public void correr(int opcion) {

        if (potencia != 0) {
            switch (opcion) {
                case 1:
                    if (potencia >= 15) {
                        distanciaRecorrida += velocidadMaxima;
                        potencia -= 15;
                    }
                    break;
                case 2:
                    if (potencia >= 10) {
                        distanciaRecorrida += velocidadNormal;
                        potencia -= 10;
                    }
                    break;
                case 3:
                    if (potencia >= 5) {
                        distanciaRecorrida += velocidadMinima;
                        potencia -= 5;
                    }
                    break;
                case 4:
                    descansar();
                    break;
            }
        }
        distanciaRecorrida += velocidadMinima;
    }

    public void descansar(){
        potencia += 10;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }
}
