package co.edu.poli.pif.modelo;

public class ParqueCanino extends Espacio {

    //Atributos privados
    private boolean tieneAguaPotable;
    
    //Constructor de la clase e inicializacion de variables
    public ParqueCanino(String id, String nombre, double capacidad, boolean disponible, Ubicacion ubicacion,
            boolean tieneAguaPotable) {
        super(id, nombre, capacidad, disponible, ubicacion);
        this.tieneAguaPotable = tieneAguaPotable;
    }
    //Incio de metodos de acceso
    public boolean isTieneAguaPotable() {
        return tieneAguaPotable;
    }

    public void setTieneAguaPotable(boolean tieneAguaPotable) {
        this.tieneAguaPotable = tieneAguaPotable;
    }
    //Fin de metodos de acceso

    //Sobre escritura de metodo toString
    @Override
    public String toString() {
        return "ParqueCanino [tieneAguaPotable=" + tieneAguaPotable + super.toString() + "]";
    }  
}