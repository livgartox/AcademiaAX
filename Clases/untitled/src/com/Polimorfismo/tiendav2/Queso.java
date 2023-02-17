package com.Polimorfismo.tiendav2;

public class Queso implements Producto{

    private String codigo;
    private double precio;
    private double porcentajeMayoreo=0.20;
    private double porcentajeMenudeo=0.10;

    Queso(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }
    @Override
    public double comprar(int cantidad){
        if(cantidad>=10){
            return obtenerPrecioMayoreo(cantidad);
        }else{
            return obtenerPrecioMenudeo(cantidad);
        }
    }

    public double obtenerPrecioMayoreo(int cantidad){
        return cantidad* precio *(1-porcentajeMayoreo);
    }

    public double obtenerPrecioMenudeo(int cantidad){
        return cantidad* precio *(1-porcentajeMenudeo);
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }
}
