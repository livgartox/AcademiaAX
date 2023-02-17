package com.Polimorfismo.tiendav1;

public class Queso {

    private String codigo;
    private double precious;
    private double porcentajeMayoreo=0.20;
    private double porcentajeMenudeo=0.10;

    Queso(String codigo, double precio) {
        this.codigo = codigo;
        this.precious = precio;
    }

    public double comprar(int cantidad){
        if(cantidad>=10){
            return obtenerPrecioMayoreo(cantidad);
        }else{
            return obtenerPrecioMenudeo(cantidad);
        }
    }

    public double obtenerPrecioMayoreo(int cantidad){
        return cantidad* precious *(1-porcentajeMayoreo);
    }

    public double obtenerPrecioMenudeo(int cantidad){
        return cantidad* precious *(1-porcentajeMenudeo);
    }

    public double getPrecious() {
        return precious;
    }

    public void setPrecious(double precious) {
        this.precious = precious;
    }
}
