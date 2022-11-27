
package Service;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;


public class ServiceEdificioDeOficinas extends ServiceEdificio{

    public EdificioDeOficinas crearEdifioDeOficinas(){
        
        System.out.println("-- CREACION EDIFICIO DE OFICINAS --");
        
        EdificioDeOficinas edifOficinas = new EdificioDeOficinas();
        super.crearEdificio(edifOficinas);
        
        System.out.println("Ingrese cantidad de oficinas");
        edifOficinas.setCantOficinas(read.nextInt());
        
        System.out.println("Ingrese cantidad de personas que entran en una oficina");
        edifOficinas.setCantPersonas(read.nextInt());
       
        edifOficinas.setCantPisos(edifOficinas.getCantOficinas());
        
        return edifOficinas;
    }
    
    public void cantPersonas(Edificio edificio){
        
        EdificioDeOficinas ediOficinas = (EdificioDeOficinas) edificio;
        int cantPersonas = ediOficinas.getCantOficinas()*ediOficinas.getCantPersonas();
        System.out.println("La cantidad de personas que entran en el edificio es de: " + cantPersonas );
    }
    
    
    @Override
    public void calcularSuperficie(Edificio edificio) {
        
        EdificioDeOficinas ediOficinas = (EdificioDeOficinas) edificio;
        
        Double superficie=(ediOficinas.getLargo()*ediOficinas.getAncho())*ediOficinas.getCantPisos();
        System.out.println("La superficie del Edificio de oficina es de: " + superficie);
    }

    @Override
    public void calcularVolumen(Edificio edificio) {
        
        EdificioDeOficinas ediOficinas = (EdificioDeOficinas) edificio;
        
        Double volumen=ediOficinas.getLargo()*ediOficinas.getAncho()*ediOficinas.getAlto();
        System.out.println("El volumen del Edificio de oficina es de: " + volumen);
    }
    
}
