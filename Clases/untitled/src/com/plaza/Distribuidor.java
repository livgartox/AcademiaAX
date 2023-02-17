package com.plaza;

import com.mercado.Proveedor;

public class Distribuidor extends Proveedor{
    public static void main(String[] args) {
        Proveedor pro=new Proveedor();
        System.out.println(pro.marca);

        Distribuidor dis=new Distribuidor();
        System.out.println(dis.clave);
    }
}
