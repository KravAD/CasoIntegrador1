package org.example;

public class RecursosSuministros {
    private double dailyWater;
    private double dailyFood;
    private double dailyOxygen;

    public RecursosSuministros(double dailyWater, double dailyFood, double dailyOxygen) {
        this.dailyWater = dailyWater;
        this.dailyFood = dailyFood;
        this.dailyOxygen = dailyOxygen;
    }

    public double calculateResourceForPeriod(double dailyResource, int period, String periodType) {
        switch (periodType) {
            case "days":
                return dailyResource * period;
            case "weeks":
                return dailyResource * period * 7;
            case "months":
                return dailyResource * period * 30;
            default:
                return 0;
        }
    }

    public double calculateAverage(double[] resources) {
        double sum = 0;
        for (double resource : resources) {
            sum += resource;
        }
        return sum / resources.length;
    }

    public double findMin(double[] resources) {
        double min = resources[0];
        for (double resource : resources) {
            if (resource < min) {
                min = resource;
            }
        }
        return min;
    }

    public double findMax(double[] resources) {
        double max = resources[0];
        for (double resource : resources) {
            if (resource > max) {
                max = resource;
            }
        }
        return max;
    }

    public double getDailyWater() {
        return dailyWater;
    }

    public double getDailyFood() {
        return dailyFood;
    }

    public double getDailyOxygen() {
        return dailyOxygen;
    }
}