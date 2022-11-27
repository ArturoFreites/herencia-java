           
package Service;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class Negocio {
    
    ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ServiceTelevisor sTelevisor = new ServiceTelevisor();
    ServiceLavadora sLavadora = new ServiceLavadora();
    
    public void cargarElectro(){
        
        System.out.println("Ingrese cantidad de televisores a cargar");
        int cantTelevisores = read.nextInt();
        
        for (int i = 0; i < cantTelevisores; i++)
        {
            System.out.println("Televisor " + i);
            electrodomesticos.add(sTelevisor.crearTelevisor());
        }
        
        System.out.println("Ingrese cantidad de lavadoras a cargar");
        int cantLavadoras = read.nextInt();
        
        for (int i = 0; i < cantLavadoras; i++)
        {
            System.out.println("Lavadora "+i);
            electrodomesticos.add(sLavadora.crearLavadora());
        }
       
    }
    
    public void mostrarPrecios(){
        
        Double precioTotal= 0.0;
        Double precioTele= 0.0;
        Double preciolavadora= 0.0;
        Double precio;
        int cantLavadoras=0;
        int cantTele=0;
        
        for (Electrodomestico electrodomestico : electrodomesticos)
        {
            if (electrodomestico instanceof Televisor )
            {
                precio = electrodomestico.getPrecio();
                precioTotal+=precio;
                precioTele+=precio;
                cantTele++;
            }
            else if(electrodomestico instanceof Lavadora){
                
                precio = electrodomestico.getPrecio();
                precioTotal+=precio;
                preciolavadora+=precio;
                cantLavadoras++;
            }
        }
        
        System.out.println("El precio total es de: $"+precioTotal);
        System.out.println("El precio de los televisores es de: $"+precioTele);
        System.out.println("El precio de los lavadora es de: $"+preciolavadora);
        System.out.println("Teles: "+cantTele);
        System.out.println("Lavadoras: "+cantLavadoras);
    }
    
}

