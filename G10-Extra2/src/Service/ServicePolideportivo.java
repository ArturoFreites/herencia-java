/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Edificio;
import Entidades.Polideportivo;
import Enums.Tipo;

public class ServicePolideportivo extends ServiceEdificio {

    public Polideportivo crearPolideportivo() {
        System.out.println("-- CREACION POLIDEPORTIVO --");
        
        Polideportivo polideportivo = new Polideportivo();
        super.crearEdificio(polideportivo);
        System.out.println("Ingrese nombre del polideportivo");
        polideportivo.setNombre(read.next());
        tipoPolideportivo(polideportivo);
        
        return polideportivo;
    }
    
    private void tipoPolideportivo(Polideportivo polideportivo) {

        int op;

        do
        {
            System.out.println("1-Techado  2-Abierto  ");
            System.out.println("Ingrese tipo de Polideportivo");
            op = read.nextInt();

            switch (op)
            {
                case 1:
                        polideportivo.setTipo(Tipo.TECHADO);
                    break;
                case 2:
                        polideportivo.setTipo(Tipo.ABIERTO);
                    break;
                default:
                    System.out.println("Saliendo");
            }

        } while (op > 2);

    }

    @Override
    public void calcularSuperficie(Edificio edificio) {
        
        Polideportivo poli  = (Polideportivo) edificio;
        
        Double superficie= poli.getAncho()*poli.getLargo();
        System.out.println("La superficie del Polideportivo es de: " + superficie);
    }

    @Override
    public void calcularVolumen(Edificio edificio) {
        Polideportivo poli  = (Polideportivo) edificio;
        
        Double volumen = poli.getAncho()*poli.getLargo()*poli.getAlto();
        System.out.println("El volumen del Polideportivo es de: " + volumen);
    }

    public void mostrarTipo(Edificio edificio) {
        Polideportivo poli  = (Polideportivo) edificio;
        System.out.println("El polideportivo " +poli.getNombre()+ " es de tipo: " + poli.getTipo());
    }

    

}
