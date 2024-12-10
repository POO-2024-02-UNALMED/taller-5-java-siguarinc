package gestion;
import zooAnimales.Animal;
public class Zoologico {
    String nombre;
    String ubicacion;
    Zona[] zonas;
    public Zoologico(String nombre, String ubicacion, Zona zonas){

    }
    public Zoologico(){

    }
    public cantidadTotalAnimales(){
        return len(animales);
    }
    public agregarZonas(){
        zonas.append(new Zona());
    }
}
