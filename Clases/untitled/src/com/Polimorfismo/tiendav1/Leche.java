package com.Polimorfismo.tiendav1;

public class Leche {
    private String codigo;
    private double precio;
    private double porcentajeMayoreo=0.20;
    private double porcentajeMenudeo=0.1;

    Leche(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public double comprar(int cantidad){
        if(cantidad>=10){
            return obtenerPrecioMayoreo(cantidad);
        }else{
            return obtenerPrecioMenudeo(cantidad);
        }
    }

    public double obtenerPrecioMayoreo(int cantidad){
        return cantidad*precio*(1-porcentajeMayoreo);
    }

    public double obtenerPrecioMenudeo(int cantidad){
        return cantidad*precio*(1-porcentajeMenudeo);
    }
}
