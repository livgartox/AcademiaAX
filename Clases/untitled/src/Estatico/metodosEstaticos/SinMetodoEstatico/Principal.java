package Estatico.metodosEstaticos.SinMetodoEstatico;

public class Principal {
    public static void main(String[] args) {
        Principal p=new Principal();
        int r=p.sumar(4,5);
    }
    public int sumar(int a, int b){
        return a+b;
    }
}
