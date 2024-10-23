package co.edu.poli.pif.modelo;

public class ParqueFelino extends Espacio {

    //Atributos privados
    private boolean tieneJuegos;

    //Constructor de la clase e inicializacion de variables
    public ParqueFelino(String id, String nombre, double capacidad, boolean disponible, Ubicacion ubicacion,
            boolean tieneJuegos) {
        super(id, nombre, capacidad, disponible, ubicacion);
        this.tieneJuegos = tieneJuegos;
    }

    //Inicio de metodos de acceso
    public boolean isTieneJuegos() {
        return tieneJuegos;
    }

    public void setTieneJuegos(boolean tieneJuegos) {
        this.tieneJuegos = tieneJuegos;
    }
    //Fin de metodos de acceso

    //Sobre escritura de metodo toString
    @Override
    public String toString() {
        return "ParqueFelino [tieneJuegos=" + tieneJuegos + super.toString() + "]";
    }    
}