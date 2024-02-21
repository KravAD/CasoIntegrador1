package org.example;


public class ComInterplanetaria {
    public int contarVocales(String mensaje) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (char c : mensaje.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public String invertirMensaje(String mensaje) {
        return new StringBuilder(mensaje).reverse().toString();
    }

    public boolean esPalindromo(String mensaje) {
        String mensajeSinEspacios = mensaje.replace(" ", "");
        String mensajeInvertido = invertirMensaje(mensajeSinEspacios);
        return mensajeSinEspacios.equalsIgnoreCase(mensajeInvertido);
    }
}