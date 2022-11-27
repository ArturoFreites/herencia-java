
package Entidades;


public class ExtraHotelero extends Alojamiento{
    
    protected boolean privado;
    protected Double cantMetros;

    public ExtraHotelero() {
        super();
    }

    public ExtraHotelero(boolean privado, Double cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantMetros = cantMetros;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Double getCantMetros() {
        return cantMetros;
    }

    public void setCantMetros(Double cantMetros) {
        this.cantMetros = cantMetros;
    }
    
    
}
