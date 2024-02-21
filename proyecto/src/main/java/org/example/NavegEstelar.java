package org.example;

public class NavegEstelar {
    private int[][] terreno;

    public NavegEstelar(int[][] terreno) {
        this.terreno = terreno;
    }

    public void visualizarTerreno() {
        for (int[] fila : this.terreno) {
            for (int celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }

    public int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int columnas2 = matriz2[0].length;
        int[][] producto = new int[filas1][columnas2];
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    producto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return producto;
    }
}