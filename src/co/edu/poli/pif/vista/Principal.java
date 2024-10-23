package co.edu.poli.pif.vista;

import java.util.Arrays;
import java.util.Scanner;

import co.edu.poli.pif.modelo.ClienteFree;
import co.edu.poli.pif.modelo.ClienteGold;
import co.edu.poli.pif.modelo.Mascota;
import co.edu.poli.pif.modelo.Ubicacion;
import co.edu.poli.pif.modelo.Usuario;
import co.edu.poli.pif.servicios.ImplementacionOperaciones;

public class Principal {

    public static void main(String[] args) {
        
        // Crear una ubicación
        Ubicacion ubi1 = new Ubicacion("U01", 4.45, 74.55);
        
        // Creación de una mascota
        Mascota mas1 = new Mascota("M01", "Pedro", 4, "Perro");

        // Creación de un arreglo de mascotas
        Mascota[] mascotas = new Mascota[3];
        mascotas[0] = mas1;
    
        // Archivo para Usuarios
        String path = "";
        String file = "Usuarios.txt";
        ImplementacionOperaciones op = new ImplementacionOperaciones();
        ImplementacionOperaciones crud = new ImplementacionOperaciones();

        // Datos predefinidos
        String contrasenia = "defaultPass123";
        String email = "usuario@ejemplo.com";
        String fechaRegistro = "01/01/2024";
        String numContacto = "3001234567";
        String genero = "Masculino";
        Mascota[] mascotas1 = {};  // Array vacío para simplificar
        Ubicacion ubicacion = new Ubicacion("U001", 4.7110, 74.0721);

        // Menú de usuario
        Scanner opciones = new Scanner(System.in);
        Scanner datos = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n\n Menú de opciones:");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Leer Usuario");
            System.out.println("3. Leer todos los Usuarios");
            System.out.println("4. Actualizar Usuario");
            System.out.println("5. Eliminar Usuario");
            System.out.println("6. Guardar archivo");
            System.out.println("7. Leer el archivo");
            System.out.println("8. Salir");
            System.out.println("Seleccione una opción ");

            int opcion = opciones.nextInt();
            opciones.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Crear un nuevo usuario
                    System.out.println("Seleccione el tipo de usuario: 1. ClienteFree, 2. ClienteGold");
                    int tipoUsuario = opciones.nextInt();
                    opciones.nextLine(); // Limpiar el buffer

                    System.out.println("Ingrese el ID del usuario: ");
                    String id = datos.nextLine();
                    System.out.println("Ingrese el nombre del usuario: ");
                    String nombre = datos.nextLine();
                    System.out.println("Ingrese la edad del usuario: ");
                    int edad = datos.nextInt();
                    datos.nextLine(); // Limpiar el buffer

                    Usuario nuevoUsuario = null;

                    if (tipoUsuario == 1) {
                        // Datos específicos de ClienteFree
                        String membresia = "Free";
                        int limiteReservas = 3;
                        String diasAccesoLimitado = "Lunes a Viernes";

                        // Crear un ClienteFree
                        nuevoUsuario = new ClienteFree(id, nombre, contrasenia, email, fechaRegistro, numContacto, edad, genero, mascotas, membresia, ubicacion, limiteReservas, diasAccesoLimitado);

                    } else if (tipoUsuario == 2) {
                        // Datos específicos de ClienteGold
                        String membresia = "Gold";
                        double valorMembresia = 500.0;
                        boolean accesoVIP = true;
                        double descuento = 10.0;

                        // Crear un ClienteGold
                        nuevoUsuario = new ClienteGold(id, nombre, contrasenia, email, fechaRegistro, numContacto, edad, genero, mascotas, membresia, ubicacion, valorMembresia, accesoVIP, descuento);
                    }

                    // Guardar el usuario creado
                    if (nuevoUsuario != null) {
                        System.out.println(crud.create(nuevoUsuario));
                    }
                    break;

                case 2:
                    // Leer un usuario por ID
                    System.out.println("Ingrese el ID que desea buscar");
                    id = datos.nextLine();
                    System.out.println(crud.read(id));
                    break;

                case 3:
                    // Leer todos los usuarios
                    System.out.println(Arrays.toString(crud.readAll()));
                    break;

                case 4:
                    // Actualizar un usuario
                    System.out.println("Ingrese el ID del usuario que desea actualizar");
                    id = datos.nextLine();
                    System.out.println("Ingrese el nuevo nombre del usuario: ");
                    nombre = datos.nextLine();
                    System.out.println("Ingrese la nueva edad del usuario: ");
                    edad = datos.nextInt();
                    datos.nextLine(); // Limpiar el buffer

                    // Crear un ClienteFree como ejemplo de actualización (esto puede cambiar según tu lógica)
                    Usuario usuarioActualizado = new ClienteFree(id, nombre, contrasenia, email, fechaRegistro, numContacto, edad, genero, mascotas, "Free", ubicacion, 3, "Lunes a Viernes");
                    System.out.println(crud.update(usuarioActualizado, id));
                    break;

                case 5:
                    // Eliminar un usuario
                    System.out.println("Ingrese el ID del usuario que desea eliminar");
                    id = datos.nextLine();
                    Usuario eliminar = crud.delete(id);
                    if (eliminar != null) {
                        System.out.println("Usuario eliminado: " + eliminar);
                    } else {
                        System.out.println("Usuario no encontrado");
                    }
                    System.out.println("Usuarios después de la eliminación");
                    System.out.println(Arrays.toString(crud.readAll()));
                    break;

                case 6:
                    // Guardar en archivo
                    op.serealizar(crud.readAll(), path, file);
                    System.out.println("Archivo guardado con éxito");
                    break;

                case 7:
                    // Leer desde archivo
                    crud.setUsuarios(op.deserilizar(path, file));
                    System.out.println("Lectura desde archivo: " + Arrays.toString(op.deserilizar(path, file)));
                    break;

                case 8:
                    // Salir del programa
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }

        datos.close();
        opciones.close();
    }
}