
package Entidades;


public class Circulo {

    private Double radio;
    private Double diametro;
    private Double area;
    private Double perimetro;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
        this.diametro = radio*2;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }
    
    
}
