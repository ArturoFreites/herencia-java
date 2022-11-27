package Service;

import Entidades.Amotor;
import Entidades.Barco;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ServiceAlquiler extends ServiceBarco {

    ArrayList<Barco> barcos = new ArrayList();

    ServiceAmotor servAmotor = new ServiceAmotor();
    ServiceVelero servVelero = new ServiceVelero();
    ServiceYate servYate = new ServiceYate();

    public void cargarBarcos() {

        System.out.println("Cargar Barcos");
        int op;

        do
        {
            System.out.println("1-Velero  2-Barco a motor  3-Yate 4-Salir");
            System.out.println("Ingrese opcion");
            op = read.nextInt();

            switch (op)
            {
                case 1:
                    barcos.add(servVelero.crearVelero());
                    System.out.println("Velero cargado");
                    break;
                case 2:
                    barcos.add(servAmotor.crearAmotor(new Amotor()));
                    System.out.println("A motor cargado");
                    break;
                case 3:
                    barcos.add(servYate.crearYate());
                    System.out.println("Yate cargado");
                    break;
                case 4:
                    System.out.println("Salió");
                    break;
                default:
                    System.out.println("Ingrese opcion correcta!");
            }

        } while (op < 4);

    }
    
    public void mostrarBarcos(){
        
        String tipo;
        
        for (Barco barco : barcos)
        {
            if (barco instanceof Velero)
            {
               tipo = "Velero";
            }else if(barco instanceof Yate){
                tipo="Yate";
            }else{
                tipo="A motor";
            }
            System.out.println("ID: "+barcos.indexOf(barco) +"| T: "+tipo+ " | Matricula: "+barco.getMatricula());
        }
    }
    
    public void Alquilar(){
        
        System.out.println("Ingrese id del barco a alquilar");
        int id = read.nextInt();
        Barco barcoElejido = barcos.get(id);
        
        System.out.println("Ingrese en que fecha devolvera el barco");
        System.out.print("mes (numero) : ");
        int mes = read.nextInt();
        System.out.print("dia (numero) : ");
        int dia = read.nextInt();
        
        LocalDate Factual = LocalDate.now();
        LocalDate Fdevolucion = LocalDate.of(2022, mes, dia);
        
        long diasDiferencia =Factual.until(Fdevolucion,ChronoUnit.DAYS);
        
        
        int diasAlquilados = (int) (long) diasDiferencia;
        
        int precio = diasAlquilados*(barcoElejido.getEslora()*10);
        
        if (barcoElejido instanceof Velero)
            {
               Velero velero = (Velero) barcoElejido;
               precio += velero.getMastiles();
               
            }else if(barcoElejido instanceof Amotor){
                
                Amotor amotor = (Amotor) barcoElejido;
               precio += amotor.getPotenciaCV();
               
            }else{
                Yate yate = (Yate) barcoElejido;
               precio += yate.getCantCamarotes()+yate.getPotenciaCV();
            }
        
        System.out.println("PRECIO POR ALQUILAR: $"+precio);
    }
    
    
}
