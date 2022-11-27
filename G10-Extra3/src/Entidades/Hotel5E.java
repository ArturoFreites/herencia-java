
package Entidades;

import Enums.Gym;


public class Hotel5E extends Hotel4E{
    
    private Integer cantSalones;
    private Integer cantSuites;
    private Integer cantLimusinas;

    public Hotel5E() {
        super();
    }

    public Hotel5E(Integer cantSalones, Integer cantSuites, Integer cantLimusinas, Gym gym, String nombreResponsable, Integer capacidadRest, Integer cantHabitaciones, Integer cantCamas, Integer cantPisos, Integer precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gym, nombreResponsable, capacidadRest, cantHabitaciones, cantCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimusinas = cantLimusinas;
    }

    public Integer getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(Integer cantSalones) {
        this.cantSalones = cantSalones;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimusinas() {
        return cantLimusinas;
    }

    public void setCantLimusinas(Integer cantLimusinas) {
        this.cantLimusinas = cantLimusinas;
    }
    
    
    
}
