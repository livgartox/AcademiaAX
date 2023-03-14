package InyeccionDependencias.vfinal.v4;

import java.util.Scanner;

public class Inyector {
    static Usuario getBecario(String nombre, int plan){
        Plan bAnuncios=new BasicoAnuncios();
        Plan basico=new Basico();
        Plan estandar=new Estandar();
        Plan pr=new Premium();
        switch (plan){
            case 1:
                return new Usuario(nombre,bAnuncios);
            case 2:
                return new Usuario(nombre,basico);
            case 3:
                return new Usuario(nombre,estandar);
            default:
                return new Usuario(nombre,pr);
        }
    }

    static void cambiarPlan(Usuario usuario,int nuevoPlan){
        switch (nuevoPlan){
            case 1:
                usuario.setPlanUser(new BasicoAnuncios());
                break;
            case 2:
                usuario.setPlanUser(new Basico());
                break;
            case 3:
                usuario.setPlanUser(new Estandar());
                break;
            default:
                usuario.setPlanUser(new Premium());
                break;
        }
    }
}
