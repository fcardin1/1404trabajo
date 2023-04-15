package test;


import entities.Autoclasico;
import entities.Autonuevo;
import entities.Colectivo;
import entities.Vehiculo;

public class trabajopracticotest {

    public static void main(String[] args) {
        System.out.println("auto clasico");
       Vehiculo vehiculo1=new Vehiculo("gris", "renault", "clio", "sony");
       Autoclasico autoclasico1=new Autoclasico("rojo", "ford", "gt40", "aiwa");
       Autonuevo autonuevo1=new Autonuevo("negro", "Volkswagen", "taos", "panasonic");
       Colectivo colectivo1=new Colectivo("blanco", "Mercedes benz", "Colectivo", "casio");

       System.out.println(autoclasico1);
    }
    
}
