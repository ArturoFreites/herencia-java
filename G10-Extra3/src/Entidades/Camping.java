
package Entidades;


public class Camping extends ExtraHotelero{
    
    private Integer cantCarpas;
    private Integer cantBaños;
    private boolean restaurante;

    public Camping() {
        super();
    }
    

    public Camping(Integer cantCarpas, boolean restaurante, boolean privado, Double cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetros, nombre, direccion, localidad, gerente);
        this.cantCarpas = cantCarpas;
        this.restaurante = restaurante;
    }

    public Integer getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(Integer cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public Integer getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(Integer cantBaños) {
        this.cantBaños = cantBaños;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    
}
