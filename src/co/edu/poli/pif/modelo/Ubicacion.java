package co.edu.poli.pif.modelo;

public class Ubicacion {

    //Atributos privados
    private String id;
    private double longitud;
    private double latitud;
    
    //Constructor e inicializacion de variables
    public Ubicacion(String id, double longitud, double latitud) {
        this.id = id;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    //Inicio de metodos de acceso
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    //Fin de metodos de acceso

    //Sobrescritura de metodo toString
    @Override
    public String toString() {
        return "Ubicacion [id=" + id + ", longitud=" + longitud + ", latitud=" + latitud + "]";
    }
}