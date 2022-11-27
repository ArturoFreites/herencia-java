package Service;

import Entidades.Electrodomestico;
import java.util.Scanner;

public class ServiceElectrodomestico {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearElectrodomestico(Electrodomestico electro) {

        System.out.println("Ingrese letra de consumo");
        char letra = read.next().toUpperCase().charAt(0);
        letra = comprobarConsumo(letra);
        
        System.out.println("Ingrese color");
        String color = read.next();
        color=comprobarColor(color);

        System.out.println("Ingrese peso del electrodomestico");
        int peso = read.nextInt();

        Double precioFinal = precioFinal(letra, peso);
        
        electro.setColor(color);
        electro.setConsumo(letra);
        electro.setPeso(peso);
        electro.setPrecio(precioFinal);
    }

    public Character comprobarConsumo(Character letra) {

        if (!(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F'))
        {
            letra = 'F';
        }
        return letra;
    }

    public String comprobarColor(String color) {

        if (!(color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("grtis")))
        {
            color = "blanco";
        }
        return color;
    }

    public Double precioFinal(char letra, int peso) {

        Double precio = 1000.0;

        switch (letra)
        {
            case 'A':
                   precio+=1000.0;
                break;
            case 'B':
                    precio+=800.0;
                break;
            case 'C':
                    precio+=600.0;
                break;
            case 'D':
                    precio+=500.0;
                break;
            case 'E':
                    precio+=300.0;
                break;

            case 'F':
                    precio+=100.0;
                break;
        }
        
        
        if (peso>=1 || precio<=19)
        {
            precio+=100.0;
        }else if(peso>19 || precio<=49){
            precio+=500.0;
        }
        else if(peso>49 || precio<=79){
            precio+=800.0;
        }else{
            precio+=1000.0;
        }

        return precio;
    }

}
