package co.edu.poli.pif.modelo;


public class Reserva {

    //Atributos privados
    private int id;
    private String fechaReserva;
    private Espacio espacio;
    private Usuario usuario;
    
    //Constructor de la clase e inizializacion de variables
    public Reserva(int id, String fechaReserva, Espacio espacio, Usuario usuario) {
        this.id = id;
        this.fechaReserva = fechaReserva;
        this.espacio = espacio;
        this.usuario = usuario;
    }

    //Inicio de metodos de acceso
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    //Fin de metodos de acceso

    //Sobrescritura de metodo toString
    @Override
    public String toString() {
        return "Reserva [id=" + id + ", fechaReserva=" + fechaReserva + ", espacio=" + espacio + ", usuario=" + usuario
                + "]";
    }
}