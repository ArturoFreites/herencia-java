
package Entidades;


public class Velero extends Barco{
    
    protected Integer mastiles;

    public Velero() {
        super();
    }

    public Velero(Integer mastiles, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }
    
    
    
}
