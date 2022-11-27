
package g10.extra2;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Service.ServiceEdificioDeOficinas;
import Service.ServicePolideportivo;
import java.util.ArrayList;

public class G10Extra2 {
    
    
    
    public static void main(String[] args) {
        
        ArrayList<Edificio> edificios = new ArrayList();
        ServicePolideportivo servPoli = new ServicePolideportivo();
        ServiceEdificioDeOficinas servEdiOficinas = new ServiceEdificioDeOficinas();
        
        Polideportivo poli1 = servPoli.crearPolideportivo();
        edificios.add(poli1);
        Polideportivo poli2 = servPoli.crearPolideportivo();
        edificios.add(poli2);
        EdificioDeOficinas ediOfi1 = servEdiOficinas.crearEdifioDeOficinas();
        edificios.add(ediOfi1);
        EdificioDeOficinas ediOfi2 = servEdiOficinas.crearEdifioDeOficinas();
        edificios.add(ediOfi2);
        
        for (Edificio edificio : edificios)
        {
            if (edificio instanceof Polideportivo ){
                servPoli.mostrarTipo(edificio);
                servPoli.calcularSuperficie(edificio);
                servPoli.calcularVolumen(edificio);
            }else{
                servEdiOficinas.calcularSuperficie(edificio);
                servEdiOficinas.calcularVolumen(edificio);
                servEdiOficinas.cantPersonas(edificio);
            }
        }
        
    }
    
}
