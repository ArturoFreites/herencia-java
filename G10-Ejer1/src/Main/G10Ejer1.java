/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author luisa
 */
public class G10Ejer1 {

    
    public static void main(String[] args) {
        
        Animal perro = new Perro("Pichinis","Carnivoro",15,"Doberman");
        Animal gato = new Gato("Michi","Carnivoro",2,"Naranja");
        Animal caballo = new Caballo("Zorro","Pasto",23,"Marron");
        
        perro.Alimentarse();
        gato.Alimentarse();
        caballo.Alimentarse();

    }
    
}
