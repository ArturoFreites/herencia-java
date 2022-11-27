/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Circulo;
import Entidades.Rectangulo;
import Service.ServiceCirculo;
import Service.ServiceRectangulo;


public class G10Ejer4 {

    public static void main(String[] args) {
        
        ServiceRectangulo servRec = new ServiceRectangulo();
        
        ServiceCirculo servCir = new ServiceCirculo();
        
        Rectangulo rec = servRec.crearRectangulo();
        Circulo circulo = servCir.crearCirculo();
                
        servRec.calcularArea(rec);
        servRec.calcularPerimetro(rec);
        
        System.out.println("Area rectangulo "+rec.getArea());
        System.out.println("Perimetro rectangulo "+rec.getPerimetro());
        System.out.println("-----------------------------");
        
        servCir.calcularArea(circulo);
        servCir.calcularPerimetro(circulo);
        
        System.out.println("Area del circulo "+circulo.getArea());
        System.out.println("Perimetro del circulo "+circulo.getPerimetro());
        
    }
    
}
