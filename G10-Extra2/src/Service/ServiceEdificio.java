package Service;

import Entidades.Edificio;
import java.util.Scanner;

public abstract class ServiceEdificio {

    public abstract void calcularSuperficie(Edificio edificio);

    public abstract void calcularVolumen(Edificio edificio);

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearEdificio(Edificio edificio) {

        System.out.println("Ingrese ancho del edificio");
        Double ancho = read.nextDouble();

        System.out.println("Ingrese alto del edificio");
        Double alto = read.nextDouble();

        System.out.println("Ingrese largo del edificio");
        Double largo = read.nextDouble();

        edificio.setAlto(alto);
        edificio.setAncho(ancho);
        edificio.setLargo(largo);
    }

}
