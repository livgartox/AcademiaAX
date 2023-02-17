package com.Polimorfismo.tiendav3;

public abstract class ProductoLacteo implements Producto {
    private String codigo;
    private double precio;
    public double porcentajeMayoreo;
    public double porcentajeMenudeo;

    public ProductoLacteo(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }
    @Override
    public double getPrecio() {
        return precio;
    }

    public double obtenerPrecioMayoreo(int cantidad){
        return cantidad*precio*(1-porcentajeMayoreo);
    }

    public double obtenerPrecioMenudeo(int cantidad){
        return cantidad*precio*(1-porcentajeMenudeo);
    }
}
