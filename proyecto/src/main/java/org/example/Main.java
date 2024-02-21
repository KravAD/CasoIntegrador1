package org.example;
import org.example.CronometroCosmico.Planet;


public class Main {
    public static void main(String[] args) {
// Clase Cronometro Cosmico
        Planet newPlanet = new Planet(30, 400);  // No necesitas especificar CronometroCosmico

        long earthSeconds = 60 * 60 * 24 * 365;
        double[] planetTime = newPlanet.convertTime(earthSeconds);
        System.out.println("Tiempo : " + planetTime[0] + " segundos, " + planetTime[1] + " minutos, " + planetTime[2] + " horas, " + planetTime[3] + " dias, " + planetTime[4] + " horas");

        long intLimit = newPlanet.getIntLimit();
        double floatLimit = newPlanet.getFloatLimit();
        System.out.println("Int limit: " + intLimit + ", Float limit: " + floatLimit);

// Clase Recursos y Suministros


    }
}