package com.Polimorfismo.tiendav3;

public class Leche extends ProductoLacteo {

    private double porcentajeMayoreo=0.20;
    private double porcentajeMenudeo=0.1;

    public Leche(String codigo, double precio) {
        super(codigo, precio);
    }


    @Override
    public double comprar(int cantidad){
        if(cantidad>=10){
            return obtenerPrecioMayoreo(cantidad);
        }else{
            return obtenerPrecioMenudeo(cantidad);
        }
    }

}
