
package Entidades;

import Enums.Gym;


public class Hotel4E extends Hotel{
    
    protected Gym gym;
    protected String nombreResponsable;
    protected Integer capacidadRest;

    public Hotel4E() {
        super();
    }

    public Hotel4E(Gym gym, String nombreResponsable, Integer capacidadRest, Integer cantHabitaciones, Integer cantCamas, Integer cantPisos, Integer precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, cantCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.nombreResponsable = nombreResponsable;
        this.capacidadRest = capacidadRest;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public Integer getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(Integer capacidadRest) {
        this.capacidadRest = capacidadRest;
    }
    
}
