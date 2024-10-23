package co.edu.poli.pif.modelo;

public class Espacio {

    //Atributos privados
    private String id;
    private String nombre;
    private double capacidad;
    private boolean disponible;
    private Ubicacion ubicacion;
   
    //Constructor de la clase e inicializacion de variables
    public Espacio(String id, String nombre, double capacidad, boolean disponible, Ubicacion ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disponible = disponible;
        this.ubicacion = ubicacion;
    }

    //Inicio de metodos de acceso
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    //Fin de metodos de acceso

    //Sobre escritura de metodo toString
    @Override
    public String toString() {
        return "Espacio [id=" + id + ", nombre=" + nombre + ", capacidad=" + capacidad + ", disponible=" + disponible
                + ", ubicacion=" + ubicacion + "]";
    }
}