
package Entidades;

public class Yate extends Amotor{
    
    protected Integer cantCamarotes;

    public Yate() {
        super();
    }

    public Yate(Integer cantCamarotes, Integer potenciaCV, String matricula, Integer eslora, Integer anioFabricacion) {
        super(potenciaCV, matricula, eslora, anioFabricacion);
        this.cantCamarotes = cantCamarotes;
    }

    public Integer getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(Integer cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }
    
    
    
    
    
    
}
