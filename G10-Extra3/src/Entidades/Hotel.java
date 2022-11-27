
package Entidades;


public class Hotel extends Alojamiento{
    
    protected Integer cantHabitaciones;
    protected Integer cantCamas;
    protected Integer cantPisos;
    protected Integer precioHabitacion;

    public Hotel() {
        super();
    }

    public Hotel(Integer cantHabitaciones, Integer cantCamas, Integer cantPisos, Integer precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }
    
}
