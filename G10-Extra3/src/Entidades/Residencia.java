
package Entidades;


public class Residencia extends ExtraHotelero{
    
    private Integer cantHabitacion;
    private boolean descGremios;
    private boolean campoDeportivo;

    public Residencia(){
        super();
    }

    public Residencia(Integer cantHabitacion, boolean descGremios, boolean campoDeportivo, boolean privado, Double cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetros, nombre, direccion, localidad, gerente);
        this.cantHabitacion = cantHabitacion;
        this.descGremios = descGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHabitacion() {
        return cantHabitacion;
    }

    public void setCantHabitacion(Integer cantHabitacion) {
        this.cantHabitacion = cantHabitacion;
    }

    public boolean isDescGremios() {
        return descGremios;
    }

    public void setDescGremios(boolean descGremios) {
        this.descGremios = descGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    
}
