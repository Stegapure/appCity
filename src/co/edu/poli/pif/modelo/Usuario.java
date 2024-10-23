package co.edu.poli.pif.modelo;
import java.util.Arrays;
import java.io.Serializable;

public abstract class Usuario implements Serializable{
    public static final long serialVersionUid = 1L;
    
    //Atributos privados
    private String id;
    private String nombre;
    private String contrasenia;
    private String email;
    private String fechaRegistro;
    private String numContacto;
    private int edad;
    private String genero;
    private Mascota [ ] mascotas; 
    private String membresia;
    private Ubicacion ubicacion;

    //Constructor de la clase e inicializacion de variables
    public Usuario(String id, String nombre, String contrasenia, String email, String fechaRegistro, String numContacto,
            int edad, String genero, Mascota[] mascotas, String membresia, Ubicacion ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.numContacto = numContacto;
        this.edad = edad;
        this.genero = genero;
        this.mascotas = mascotas;
        this.membresia = membresia;
        this.ubicacion = ubicacion;
    }

    //Metodo de visivilidad publica
    public abstract double calcularSaldoPagar(int reserva);

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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(String numContacto) {
        this.numContacto = numContacto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Mascota[] getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascota[] mascotas) {
        this.mascotas = mascotas;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    //Fin de metodos de acceso

    //sobreescritura de metodo toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", contrasenia=").append(contrasenia);
        sb.append(", email=").append(email);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", numContacto=").append(numContacto);
        sb.append(", edad=").append(edad);
        sb.append(", genero=").append(genero);
        sb.append(", mascota=").append(Arrays.toString(mascotas));
        sb.append(", memebresia=").append(membresia);
        sb.append(", ubicacion=").append(ubicacion);
        sb.append('}');
        return sb.toString();
    }
    
}
