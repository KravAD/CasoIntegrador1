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
        RecursosSuministros recursos = new RecursosSuministros(2, 3, 4);  // Consumo diario de agua, comida, y oxígeno

        int period = 5;
        String periodType = "days";

        double waterForPeriod = recursos.calculateResourceForPeriod(recursos.getDailyWater(), period, periodType);
        double foodForPeriod = recursos.calculateResourceForPeriod(recursos.getDailyFood(), period, periodType);
        double oxygenForPeriod = recursos.calculateResourceForPeriod(recursos.getDailyOxygen(), period, periodType);

        System.out.println("Water needed for " + period + " " + periodType + ": " + waterForPeriod);
        System.out.println("Food needed for " + period + " " + periodType + ": " + foodForPeriod);
        System.out.println("Oxygen needed for " + period + " " + periodType + ": " + oxygenForPeriod);

        double[] resourcesForPeriod = {waterForPeriod, foodForPeriod, oxygenForPeriod};
        System.out.println("Average: " + recursos.calculateAverage(resourcesForPeriod));
        System.out.println("Min: " + recursos.findMin(resourcesForPeriod));
        System.out.println("Max: " + recursos.findMax(resourcesForPeriod));

// Clase Sistema de Alerta y Monitoreo

        SistemaAlerta monitor = new SistemaAlerta(6, 36, 1014);  // Niveles iniciales de radiación, temperatura, y presión

        monitor.monitor();

        int n = 5;
        System.out.println("First " + n + " prime events: " + monitor.findPrimeEvents(n));

        int num = 315;
        System.out.println("Prime factors of " + num + ": " + monitor.factorize(num));

// Clase Planificador de Tareas

    }
}