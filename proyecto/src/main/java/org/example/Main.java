package org.example;
import java.util.HashMap;
import java.util.Map;
import org.example.CronometroCosmico.Planet;
import org.example.PlanTareas;
import org.example.ComInterplanetaria;


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

        PlanTareas organizador = new PlanTareas();

        organizador.asignarTarea("Alice", "Tarea1");
        organizador.asignarTarea("Alice", "Tarea2");
        organizador.asignarTarea("Bob", "Tarea3");
        organizador.asignarTarea("Bob", "Tarea4");

        organizador.mostrarTablaDeTareas();

        Map<String, Integer> pesosPorTarea = new HashMap<>();
        pesosPorTarea.put("Tarea1", 2);
        pesosPorTarea.put("Tarea2", 3);
        pesosPorTarea.put("Tarea3", 4);
        pesosPorTarea.put("Tarea4", 5);

        System.out.println("Carga de trabajo de Alice: " + organizador.calcularCargaDeTrabajo("Alice", pesosPorTarea));
        System.out.println("Carga de trabajo de Bob: " + organizador.calcularCargaDeTrabajo("Bob", pesosPorTarea));

// Clase Navegador Estelar

        int[][] terreno = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        NavegEstelar modulo = new NavegEstelar(terreno);

        modulo.visualizarTerreno();

        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matriz2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int[][] producto = modulo.multiplicarMatrices(matriz1, matriz2);

        System.out.println("Producto de las matrices:");
        for (int[] fila : producto) {
            for (int celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();

        }

// Clase Comunicación Interplanetaria

        ComInterplanetaria sistema = new ComInterplanetaria();

        String mensaje = "Hola Mundo";

        System.out.println("Número de vocales en '" + mensaje + "': " + sistema.contarVocales(mensaje));
        System.out.println("Mensaje invertido: " + sistema.invertirMensaje(mensaje));
        System.out.println("¿Es palíndromo? " + (sistema.esPalindromo(mensaje) ? "Sí" : "No"));
    }
}