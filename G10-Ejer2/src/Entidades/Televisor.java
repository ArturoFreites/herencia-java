
package Entidades;


public class Televisor extends Electrodomestico {
    
    private Integer pulgadas;
    private boolean sintonizador;

    public Televisor() {
        super();
    }

    public Televisor(Integer pulgadas, boolean sintonizador, Double precio, Integer peso, Character consumo, String color) {
        super(precio, peso, consumo, color);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
}
