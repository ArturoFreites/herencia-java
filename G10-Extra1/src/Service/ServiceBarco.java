/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Barco;
import java.util.Scanner;


public class ServiceBarco {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void crearBarco(Barco barco){
        
        System.out.println("Ingrese matricula");
        String matricula = read.next();
        
        System.out.println("Ingrese metros de esloca");
        int eslora = read.nextInt();
        
        System.out.println("Ingrese año de fabricacion");
        int anio = read.nextInt();
        
        barco.setMatricula(matricula);
        barco.setEslora(eslora);
        barco.setAnioFabricacion(anio);
        
    }
    
    
}
