package org.example;

public class CronometroCosmico {

        public static class Planet {
            private double dayLength;
            private double yearLength;

            public Planet(double dayLength, double yearLength) {
                this.dayLength = dayLength;
                this.yearLength = yearLength;
            }

            public double[] convertTime(long earthSeconds) {
                double planetSeconds = earthSeconds * this.dayLength / (24 * 60 * 60);
                double planetMinutes = planetSeconds / 60;
                double planetHours = planetMinutes / 60;
                double planetDays = planetHours / this.dayLength;
                double planetYears = planetDays / this.yearLength;

                return new double[]{planetSeconds, planetMinutes, planetHours, planetDays, planetYears};
            }

            public long getIntLimit() {
                return Long.MAX_VALUE;
            }

            public double getFloatLimit() {
                return Double.MAX_VALUE;
            }
        }
    }



