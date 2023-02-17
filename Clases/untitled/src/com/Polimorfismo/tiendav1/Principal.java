package com.Polimorfismo.tiendav1;

public class Principal {
    public static void main(String[] args) {
        Queso p1=new Queso("QuesoXYZ",30.0);
        System.out.println(p1.comprar(3));

        Leche l1=new Leche("LecheXYZ",20.0);
        System.out.println(l1.comprar(10));
    }

}
