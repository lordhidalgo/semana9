package com.example;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        System.out.println("Precio 100 con 10% descuento: " + tienda.calcularDescuento(100));
        System.out.println("Precio 100 con 25% descuento: " + tienda.calcularDescuento(100, 25));
        System.out.println("Precio 200 (alto) con descuento: " + tienda.calcularDescuento(200, true));
        System.out.println("Precio 50 (normal) con descuento: " + tienda.calcularDescuento(50, false));

        System.out.println("\nDescripciones de productos:");
        Producto producto = new Producto();
        Producto libro = new Libro();
        Producto electronico = new Electronico();

        System.out.println("Producto genérico: " + producto.describir());
        System.out.println("Libro: " + libro.describir());
        System.out.println("Electrónico: " + electronico.describir());
    }
}