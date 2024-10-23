package co.edu.poli.pif.modelo;

public class Retroalimentacion {

    //Atributos privados
    private int id;
    private double calificacion;
    private Reserva reserva;
    private String comentario;
   
    //Constructor de la clase e inicializacion de las variables
    public Retroalimentacion(int id, double calificacion, Reserva reserva, String comentario) {
        this.id = id;
        this.calificacion = calificacion;
        this.reserva = reserva;
        this.comentario = comentario;
    }

    //Inicio de metodos de acceso
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    //Fin de metodos de acceso

    //sobrescritura de metodo toString
    @Override
    public String toString() {
        return "Retroalimentacion [id=" + id + ", calificacion=" + calificacion + ", reserva=" + reserva
                + ", comentario=" + comentario + "]";
    }
}