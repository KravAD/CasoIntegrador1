package org.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaAlerta {
    private double radiationLevel;
    private double temperature;
    private double pressure;

    public SistemaAlerta(double radiationLevel, double temperature, double pressure) {
        this.radiationLevel = radiationLevel;
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void monitor() {
        if (this.radiationLevel > 5) {
            System.out.println("Alert: High radiation level! Suggested action: Increase shielding.");
        }
        if (this.temperature > 35) {
            System.out.println("Alert: High temperature! Suggested action: Increase cooling.");
        }
        if (this.pressure > 1013) {
            System.out.println("Alert: High pressure! Suggested action: Decrease pressure.");
        }
    }

    public List<Integer> findPrimeEvents(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; primes.size() < n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> factorize(int num) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }
        return factors;
    }
}