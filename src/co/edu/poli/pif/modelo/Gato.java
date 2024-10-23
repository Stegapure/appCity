package co.edu.poli.pif.modelo;
//falata metodo hacer sonido heradado

public class Gato extends Mascota {
    public static final long  serialVersionUID = 1L;

    //Atributo privado
    private boolean esIndor;

    //Constructor de la clase e inicializacion de variables
    public Gato(String id, String nombre, int edad, String especie, boolean esIndor) {
        super(id, nombre, edad, especie);
        this.esIndor = esIndor;
    }
    //metodo de visivilidad publica
    public String jugarConLaser() {
   
        return "";
    }

    //Inicio de metodos de acceso
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public boolean isEsIndor() {
        return esIndor;
    }

    public void setEsIndor(boolean esIndor) {
        this.esIndor = esIndor;
    }
    //fin de metodos de acceso

    //Sobre escritura de metodo toString
    @Override
    public String toString() {
        return "Gato [esIndor=" + esIndor + super.toString() + "]";
    } 
}