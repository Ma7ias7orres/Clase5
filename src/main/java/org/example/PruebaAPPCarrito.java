package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class PruebaAPPCarrito {
    public static void main(String[] args) {
        try {
            Carrito carrito = new Carrito();
            int i=0;
            for (String linea: Files.readAllLines(Paths.get("C:\\Users\\mathy\\IdeaProjects\\Clase5\\src\\main\\java\\org\\example\\compra.txt"))){
                String nombre = linea.split(";")[2];
                int cantidad = Integer.parseInt(linea.split(";")[0]);
                double precio = Double.parseDouble(linea.split(";")[1]);
                Producto producto1 = new Producto(nombre,"222",precio);
                ItemCarrito itemCompra = new ItemCarrito(producto1,cantidad);
                carrito.getItem()[i]= itemCompra;
                i++;
            }
            System.out.println("El total de la compra de los productos es : " + carrito.calcularTotal());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}