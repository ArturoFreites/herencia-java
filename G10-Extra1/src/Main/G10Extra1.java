
package Main;

import Service.ServiceAlquiler;


public class G10Extra1 {

    
    
    public static void main(String[] args) {
        
        ServiceAlquiler servAlquier = new ServiceAlquiler();
        servAlquier.cargarBarcos();
        servAlquier.mostrarBarcos();
        servAlquier.Alquilar();
        
    }
    
}
