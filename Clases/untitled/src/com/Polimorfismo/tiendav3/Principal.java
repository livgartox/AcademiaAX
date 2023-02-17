package com.Polimorfismo.tiendav3;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //Queso p1=new Queso("QuesoXYZ",30.0);
        //System.out.println(p1.comprar(3));

        //Leche l1=new Leche("LecheXYZ",20.0);
        //System.out.println(l1.comprar(10));
        for (Producto p:getProductos()) {
            System.out.println(p.getCodigo());
            System.out.println(p.getPrecio());
            System.out.println(p.comprar(7));
        }
    }
    static List<Producto> getProductos(){
        return List.of(
                new Queso("QuesoXYZ",30.0),
                new Leche("LecheXYZ",20.0),
                new Yakult("YakultYZ",10.0)
        );
    }

}
