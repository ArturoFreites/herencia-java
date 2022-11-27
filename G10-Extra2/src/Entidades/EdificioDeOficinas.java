
package Entidades;


public class EdificioDeOficinas extends Edificio{
    
    private Integer cantOficinas;
    private Integer cantPersonas;
    private Integer cantPisos;

    public EdificioDeOficinas(){
        super();
    }

    public EdificioDeOficinas(Integer cantOficinas, Integer cantPersonas, Integer cantPisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.cantOficinas = cantOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
    }

    public Integer getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(Integer cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }
    
    
    
}
