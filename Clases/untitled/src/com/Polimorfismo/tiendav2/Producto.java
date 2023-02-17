package com.Polimorfismo.tiendav2;

public interface Producto {
    public String getCodigo();
    public double getPrecio();
    public double comprar(int cantidad);
}
