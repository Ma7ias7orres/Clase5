package org.example;
public class ItemCarrito {
    private Producto producto;
    private int cantProducto;

    public ItemCarrito() {    }

    public ItemCarrito(Producto producto, int cantProducto) {
        this.producto = producto;
        this.cantProducto = cantProducto;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantProducto() {
        return cantProducto;
    }
    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }
    public double calcularSubtotal(){
        double subtotal=0;
        subtotal = cantProducto * producto.getPrecio();
        return  subtotal;
    }
}
