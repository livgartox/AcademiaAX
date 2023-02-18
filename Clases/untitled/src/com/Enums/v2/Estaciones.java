package com.Enums.v2;

enum Estaciones {
    PRIMAVERA("alto"),
    OTONO("poco"),
    VERANO("variable"),
    INVIERNO("sinVisitantes");

    private String visitantes;

    Estaciones(String visitantes){
        this.visitantes=visitantes;
    }

    public void mostrarVisitantes(){
        System.out.println(visitantes);
    }
}
