
package Entidades;


public class Rectangulo {
    
    private Double altura;
    private Double base;
    private Double area;
    private Double perimetro;

    public Rectangulo() {
    }

    public Rectangulo(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
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
