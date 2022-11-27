
package Entidades;

import Enums.Tipo;

public class Polideportivo extends Edificio{
    
    private String nombre;
    private Tipo tipo;

    public Polideportivo() {
        super();
    }

    public Polideportivo(String nombre, Tipo tipo, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
    
}

