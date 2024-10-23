package co.edu.poli.pif.modelo;
import java.io.Serializable;

public class Mascota implements Serializable{
    public static final long serialVersionUid = 1L;

    //Atributos privados
    private String id;
    private String nombre;
    private int edad;
    private String especie;

    //Constructor de la clase e inicializacion de variables
    public Mascota(String id, String nombre, int edad, String especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    //Metodos
    public void hacerSonido() {

    }

    public static long getSerialversionuid() {
        return serialVersionUid;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    //Fin de metodos de acceso

    //Sobrescritura de metodo toString
    @Override
    public String toString() {
        return "Mascota [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + ", getId()="
                + getId() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getEspecie()="
                + getEspecie() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    
}