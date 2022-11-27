
package Service;

import Entidades.Televisor;


public class ServiceTelevisor extends ServiceElectrodomestico{
    
    
    public Televisor crearTelevisor(){
        
        Televisor televisor = new Televisor();
        super.crearElectrodomestico(televisor);
        
        System.out.println("Ingrese pulgadas del televisor");
        int pulgadas = read.nextInt();
        televisor.setPulgadas(pulgadas);
        
        System.out.println("Tiene sintonizador TDT? S/N");
        String sintonizador = read.next();
        
        if (sintonizador.equalsIgnoreCase("S"))
        {
            televisor.setSintonizador(true);
        }else{
            televisor.setSintonizador(false);
        }
        
        televisor.setPrecio(precioFinal(televisor));
        
        
        return televisor;
    }
    
    public Double precioFinal(Televisor tele){
        
        double precio = tele.getPrecio();
        
        if (tele.getPulgadas()>40)
        {
            precio= precio+precio*0.3;
        }
        
        if (tele.isSintonizador())
        {
            precio+=500;
        }
        
        return precio;
    }
}
