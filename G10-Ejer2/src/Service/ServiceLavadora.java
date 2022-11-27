/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Lavadora;


public class ServiceLavadora extends ServiceElectrodomestico{
    
    
    public Lavadora crearLavadora(){
        
        Lavadora lavadora = new Lavadora();
        
        super.crearElectrodomestico(lavadora);
        
        System.out.println("Ingrese carga de la lavadora");
        int carga = read.nextInt();
        
        lavadora.setCarga(carga);
        lavadora.setPrecio(precioFinal(lavadora));
        
        
        
        return lavadora;
    }
    
    public Double precioFinal(Lavadora lavadora){
        
        Double precio = lavadora.getPrecio();
        
        if (lavadora.getCarga()>30)
        {
            precio+=500.0;
        }
            
        return precio;
    }
    

}
