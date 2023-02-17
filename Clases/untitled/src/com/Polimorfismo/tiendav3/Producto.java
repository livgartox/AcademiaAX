package com.Polimorfismo.tiendav3;

public interface Producto {
    public String getCodigo();
    public double getPrecio();
    public double comprar(int cantidad);
}
