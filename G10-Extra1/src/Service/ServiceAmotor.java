
package Service;

import Entidades.Amotor;


public class ServiceAmotor extends ServiceBarco{
    
    public Amotor crearAmotor(Amotor amotor){
        
        super.crearBarco(amotor);
        
        System.out.println("Ingrese Potencia en CV");
        int potenciaCV = read.nextInt();
        amotor.setPotenciaCV(potenciaCV);
        System.out.println("Amotor-seteado");
        
        return amotor;
    }
    
}
