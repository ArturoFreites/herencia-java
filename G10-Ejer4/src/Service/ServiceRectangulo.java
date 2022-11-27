/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Rectangulo;
import java.util.Scanner;


public class ServiceRectangulo implements CalculosFormas{

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo(){
        System.out.println("CREAR RECTANGULO");
        
        System.out.println("Ingrese base");
        double base =read.nextDouble();
        
        System.out.println("Ingrese altura");
        double altura =read.nextDouble();
        
        return new Rectangulo(altura, base);
    }

    @Override
    public void calcularArea(Object obj) {
        
       Rectangulo rectangulo = (Rectangulo) obj;
       
       double area = rectangulo.getBase()*rectangulo.getAltura();
       
       rectangulo.setArea(area);
       
    }

    @Override
    public void calcularPerimetro(Object obj) {
        
       Rectangulo rectangulo = (Rectangulo) obj;
       double perimetro = (rectangulo.getBase()+rectangulo.getAltura())*2;
       
       rectangulo.setPerimetro(perimetro);
    }
    
   
    
}
