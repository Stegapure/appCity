package co.edu.poli.pif.modelo;

public class ClienteFree extends Usuario {
    public static final long  serialVersionUID = 1L;
    
    //Atributos privados
    private int limiteReservas;
    private String diasAccesoLimitado;

    //Constructor de clase e inicializacion de variables
    public ClienteFree(String id, String nombre, String contrasenia, String email, String fechaRegistro,
            String numContacto, int edad, String genero, Mascota[] mascotas, String membresia, Ubicacion ubicacion,
            int limiteReservas, String diasAccesoLimitado) {
        super(id, nombre, contrasenia, email, fechaRegistro, numContacto, edad, genero, mascotas, membresia, ubicacion);
        this.limiteReservas = limiteReservas;
        this.diasAccesoLimitado = diasAccesoLimitado;
    }

    //inicio de metodos
    public int calcularReservasDisponibles() {
        
        return 0;
    }

    public double calcularSaldoPagar(int reserva) {
        
        return 0.0d;
    }
    //fin de metodos

    //inicio de metodos de acceso
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getLimiteReservas() {
        return limiteReservas;
    }

    public void setLimiteReservas(int limiteReservas) {
        this.limiteReservas = limiteReservas;
    }

    public String getDiasAccesoLimitado() {
        return diasAccesoLimitado;
    }

    public void setDiasAccesoLimitado(String diasAccesoLimitado) {
        this.diasAccesoLimitado = diasAccesoLimitado;
    }
    //fin de metodos de acceso

    //Sobre escritura de metodo toString
    @Override
    public String toString() {
        return "ClienteFree [limiteReservas=" + limiteReservas + ", diasAccesoLimitado=" 
                + diasAccesoLimitado + ", toString()="+super.toString()+"]";
    }
}