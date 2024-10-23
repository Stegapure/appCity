package co.edu.poli.pif.servicios;
import java.io.*;
import java.util.Arrays;

import co.edu.poli.pif.modelo.Usuario;

public class ImplementacionOperaciones implements Operacion{

    private Usuario [] usuarios;
        public ImplementacionOperaciones () {
            usuarios = new Usuario [5];
        }
    
    @Override
    public String create(Usuario x) {
        //Buscar el primer null y agregar el objeto
        for (int i = 0; i < usuarios.length; i++){
            if (usuarios [i] == null){
                usuarios [i] = x;
                return "Usuario agregado en la posicion "+i;
            }
        }
        //si no hay tamnaño de dublipa el espacio de memoria
        usuarios = Arrays.copyOf(usuarios, usuarios.length * 2);
        usuarios [usuarios.length / 2] = x;//se divide para encontrar la mitad que es el nuevo espacio libre
        return "Uusuario agregado en la posicion "+ (usuarios.length / 2);
    }

    @Override
    public Usuario read (String id) {
        //Buscar el usuario por ID
        for (Usuario usuario : usuarios) {
            if (usuario != null && usuario.getId().equals(id)) {
                return usuario; //Retornar el el objeto si se encuentra
            }
        }
        return null; //Retronar null si no encuentra el objeto
    }

    @Override
    public Usuario [] readAll() {
        return usuarios;
    }

    @Override
    public String update (Usuario x, String id) {
        //Buscar objeto con el ID y reemplazar los datos
        for (int i = 0; i<usuarios.length; i++) {
            if (usuarios[i] != null && usuarios[i].getId().equals(id)) {
                usuarios[i] = x; //Reemplazar el objeto
                return "Usuario actualizado en la posicion "+i;
            }
        }
        return "Usuario no encontrado";
    }

    @Override
    public Usuario delete (String id) {
        //Buscar el objeto con su id y eliminarlo dejar null en la memoria
        for (int i = 0; i <usuarios.length; i++) {
            if (usuarios[i] != null && usuarios[i].getId().equals(id)) {
                Usuario eliminado = usuarios[i]; //temporal del usuario eliminado para imprimir
                usuarios[i] = null;//eliminar y dejar null
                return eliminado;//mostrar objeto eliminado
            }
        }
        return null; //si no se encuetra el objeto
    }

    //metodo para actualizar el arreglo de usuarios
    public void setUsuarios (Usuario [] nuevosUsuarios) {
        if (nuevosUsuarios != null) {
            usuarios = Arrays.copyOf(nuevosUsuarios, nuevosUsuarios.length);   
        }else{
            return ;
        }
    }

    //metodo para serealizar y guardar variois usuarios en TXT
    @Override
    public String serealizar (Usuario[] usuarios, String path, String name) {
        try{
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(usuarios);
            oss.close();
            fos.close();
            return "Archivo creado";
        } catch (IOException ioe) {
            return "Error" + ioe.getMessage();
        }
    }

    @Override
    public Usuario[] deserilizar (String path, String name) {
        Usuario [] a = new Usuario [10];

        try{
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream (fis);

            a = (Usuario []) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return a;
    }

}
