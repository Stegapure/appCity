package co.edu.poli.pif.modelo;
//falata metodo hacer sonido heradado
public class Perro extends Mascota {
    public static final long  serialVersionUID = 1L;

    //Atributo privado
    private String raza;

    //Constructor de la clase e inicializacion de variables
    public Perro(String id, String nombre, int edad, String especie, String raza) {
        super(id, nombre, edad, especie);
        this.raza = raza;
    }
    //Inicio de metodo de visivilidad publica
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public String pasear() {

        return "";
    }
    //Inicio de metodos de acceso
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //Fin de metodos de acceso

    //Sobre escritura de metodo toString
    @Override
    public String toString() {
        return "Perro [raza=" + raza + super.toString() + "]";
    }
}