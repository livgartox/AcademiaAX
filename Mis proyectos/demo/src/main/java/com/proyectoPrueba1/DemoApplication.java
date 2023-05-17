package com.proyectoPrueba1;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//hola
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
    	SpringApplication.run(DemoApplication.class, args);
//        Properties prop = new Properties();
//        FileInputStream input = null;
//
//        try {
//            input = new FileInputStream("D:/AcademiaAX/Mis proyectos/demo/src/main/resources/application.properties");
//            prop.load(input);
//
//            String url = prop.getProperty("spring.datasource.url");
//            String user = prop.getProperty("spring.datasource.username");
//            String password = prop.getProperty("spring.datasource.password");
//
//            Connection conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Conexión exitosa a la base de datos");
//            
//
//        } catch (IOException e) {
//            System.out.println("Error al leer el archivo de configuración: " + e.getMessage());
//        } catch (SQLException e) {
//            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
//        } finally {
//            if (input != null) {
//                try {
//                    input.close();
//                    System.out.println("se cerró todo");
//                } catch (IOException e) {
//                    System.out.println("Error al cerrar el archivo de configuración: " + e.getMessage());
//                }
//            }
//        }
        
       
        
    }
}
