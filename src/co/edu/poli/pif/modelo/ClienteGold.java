package co.edu.poli.pif.modelo;

public class ClienteGold extends Usuario {
    public static final long  serialVersionUID = 1L;

    //Atriburos privados
    private double valorMembresia;
    private boolean accesoVIP;
    private double descuento;

    //Constructor de clase e inicializacion de variables
    public ClienteGold(String id, String nombre, String contrasenia, String email, String fechaRegistro,
            String numContacto, int edad, String genero, Mascota[] mascotas, String membresia, Ubicacion ubicacion,
            double valorMembresia, boolean accesoVIP, double descuento) {
        super(id, nombre, contrasenia, email, fechaRegistro, numContacto, edad, genero, mascotas, membresia, ubicacion);
        this.valorMembresia = valorMembresia;
        this.accesoVIP = accesoVIP;
        this.descuento = descuento;
    }

    public boolean validarAccesoVIP() {
        return false;
    }

    public double calcularSaldoPagar(int reserva) {
  
        return 0.0d;
    }
    //Inicio metodos de acceso
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public double getValorMembresia() {
        return valorMembresia;
    }

    public void setValorMembresia(double valorMembresia) {
        this.valorMembresia = valorMembresia;
    }

    public boolean isAccesoVIP() {
        return accesoVIP;
    }

    public void setAccesoVIP(boolean accesoVIP) {
        this.accesoVIP = accesoVIP;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    //Fin metodos de acceso

    //Sobre escritura de metodo toString
    @Override
    public String toString() {
        return "ClienteGold [valorMembresia=" + valorMembresia + ", accesoVIP=" + accesoVIP 
        + ", descuento=" + descuento + ", toString()=" + super.toString() + "]";
    }
}