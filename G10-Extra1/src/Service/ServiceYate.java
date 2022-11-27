
package Service;


import Entidades.Yate;


public class ServiceYate extends ServiceAmotor{
    
    public Yate crearYate(){
        
        Yate yate = new Yate();
        
        super.crearAmotor(yate);
        
        System.out.println("Ingrese cantidad de camarotes");
        int cantCamarotes = read.nextInt();
        
        yate.setCantCamarotes(cantCamarotes);
        
        System.out.println("Yate-seteado");
        
        return yate;
    }
     
}
