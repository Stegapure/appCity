package co.edu.poli.pif.vista;

import java.util.Scanner;

import co.edu.poli.pif.modelo.Mascota;
import co.edu.poli.pif.modelo.Ubicacion;
import co.edu.poli.pif.servicios.ImplementacionOperaciones;

public class Principal {

    public static void main(String[] args) {
        
        //Crear una ubicacion
        Ubicacion ubi1 = new Ubicacion ("U01", 4.45, 74.55);
        
        //Creacion de 1 mascota
        Mascota mas1 = new Mascota("M01", "Pedro", 4, "Perro") {
        };

        //creacion de arreglo de mascotas
        Mascota[] mascotas = new Mascota[3];
        mascotas[0] = mas1;
    

        //Archivo para Usuarios
        String path = "";
        String file = "Usuarios.txt";
        ImplementacionOperaciones op = new ImplementacionOperaciones();
        ImplementacionOperaciones crud = new ImplementacionOperaciones();
        //menu de usuario
        Scanner opciones = new Scanner (System.in);
        Scanner datos = new Scanner (System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("------------------------------");
            System.out.println("\n\n Menú de opciones:");
            System.out.println("------------------------------");
            System.out.println("1. Crear ");
            System.out.println("2. Leer ");
            System.out.println("3. Leer todo");
            System.out.println("4. Actualizar ");
            System.out.println("5. Eliminar ");
            System.out.println("6. Guardar archivo ");
            System.out.println("7. Leer el archivo ");
            System.out.println("8. Salir ");
            System.out.println("Seleccione una opción ");
            System.out.println("------------------------------");

            int opcion = opciones.nextInt();
            //Limpiar el buffer
            opciones.nextLine();
            switch (opcion) {
                //create
                case 1:
                    //quemar datos
                    
                    break;
            
                default:
                    break;
            }
        }

    }
}
