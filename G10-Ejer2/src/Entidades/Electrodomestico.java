
package Entidades;


public class Electrodomestico {
    protected Double precio;
    protected Integer peso;
    protected Character consumo;
    protected String color;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, Integer peso, Character consumo, String color) {
        this.precio = precio;
        this.peso = peso;
        this.consumo = consumo;
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", consumo=" + consumo + ", color=" + color + '}';
    }
    
    
}
