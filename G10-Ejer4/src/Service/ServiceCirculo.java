/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Circulo;
import java.util.Scanner;


public class ServiceCirculo implements CalculosFormas{
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Circulo crearCirculo(){
        System.out.println("CREAR CIRCULO");
        
        System.out.println("Ingrese radio");
        double radio =read.nextDouble();
        
        return new Circulo(radio);
    }

    @Override
    public void calcularArea(Object obj) {
        
       Circulo circulo = (Circulo) obj;
       
       double area = PI*circulo.getRadio()*circulo.getRadio();
       
       circulo.setArea(area);
       
    }

    @Override
    public void calcularPerimetro(Object obj) {
        
       Circulo circulo = (Circulo) obj;
       double perimetro = PI * circulo.getDiametro();
       
       circulo.setPerimetro(perimetro);
    }
}
