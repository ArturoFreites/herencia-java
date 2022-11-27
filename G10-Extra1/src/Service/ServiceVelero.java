/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Velero;


public class ServiceVelero extends ServiceBarco{
    
    public Velero crearVelero(){
        
        Velero velero = new Velero();
        super.crearBarco(velero);
        
        System.out.println("Ingrese numero de mastiles");
        int cantMastiles = read.nextInt();
        
        return velero;
    }
    
    
}
