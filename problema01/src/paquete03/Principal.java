/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;

import paquete01.Enlace;
import paquete02.*;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) throws SQLException {
        Enlace e= new Enlace();
        Scanner entrada= new Scanner(System.in);
        String cedula, correo, nombre;
        double sueldo;
        int mesSueldo;
        
        int op;
      
        do {            
            System.out.println("Ingrese la cedula");
            cedula=entrada.nextLine();
            System.out.println("Ingrese el nombre");
            nombre=entrada.nextLine();
            System.out.println("Ingrese el correo ");
            correo=entrada.nextLine();
            System.out.println("Ingrese el sueldo");
            sueldo=Double.parseDouble(entrada.nextLine());
            System.out.println("Ingrese el mes de sueldo");
            mesSueldo=Integer.parseInt(entrada.nextLine());
            SueldoTrabajadores st = new SueldoTrabajadores(cedula, nombre, correo, sueldo, mesSueldo);
            e.insertarSueldoTrabajadores(st);
            
            
            System.out.println("Ingrese 0 para salir");
            op=Integer.parseInt(entrada.nextLine());
            
        } while (op!=0);
        
        
        
    }
    
}
    

