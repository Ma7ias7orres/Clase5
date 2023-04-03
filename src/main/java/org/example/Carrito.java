package org.example;
import java.time.LocalDateTime;
public class Carrito {
    private int numeroCarrito;
    private ItemCarrito[] item;
    private LocalDateTime fechaCompra;
    public Carrito() {
        this.fechaCompra = LocalDateTime.now();
        this.item = new ItemCarrito[10];
    }
    public Carrito(int numeroCarrito, ItemCarrito[] item, LocalDateTime fechaCompra) {
        this.numeroCarrito = numeroCarrito;
        this.item = item;
        this.fechaCompra = fechaCompra;
    }
    public int getNumeroCarrito() {
        return numeroCarrito;
    }
    public void setNumeroCarrito(int numeroCarrito) {
        this.numeroCarrito = numeroCarrito;
    }
    public ItemCarrito[] getItem() {
        return item;
    }
    public void setItem(ItemCarrito[] item) {
        this.item = item;
    }
    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public double calcularTotal(){
        double total=0;
        for ( int i =0; i<3; i++){
            ItemCarrito items = item[i];
            total+= items.calcularSubtotal();
        }
        return total;
    }
}
