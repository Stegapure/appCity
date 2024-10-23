package co.edu.poli.pif.modelo;

public class ParquePrivado extends Espacio {

    //Atributos privados
    private boolean esInterior;
    private double metrosCuadrados;
   
    //Constructor de la clase e inicializacion de variables
    public ParquePrivado(String id, String nombre, double capacidad, boolean disponible, Ubicacion ubicacion,
            boolean esInterior, double metrosCuadrados) {
        super(id, nombre, capacidad, disponible, ubicacion);
        this.esInterior = esInterior;
        this.metrosCuadrados = metrosCuadrados;
    }
    //Inicio de metodos de acceso
    public boolean isEsInterior() {
        return esInterior;
    }

    public void setEsInterior(boolean esInterior) {
        this.esInterior = esInterior;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    //Fin de metodos de acceso

    //Sobre escritura de metodo toString
    @Override
    public String toString() {
        return "ParquePrivado [esInterior=" + esInterior + 
        ", metrosCuadrados=" + metrosCuadrados + super.toString() + "]";
    }
    
    
    
}