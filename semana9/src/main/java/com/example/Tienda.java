package com.example;

public class Tienda {
    public double calcularDescuento(double precio) {
        return precio * 0.9;
    }

    public double calcularDescuento(double precio, double porcentaje) {
        return precio * (1 - porcentaje / 100);
    }

    public double calcularDescuento(double precio, boolean esPrecioAlto) {
        if (esPrecioAlto) {
            return precio * 0.8;
        } else {
            return precio * 0.95;
        }
    }
}