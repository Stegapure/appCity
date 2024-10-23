package co.edu.poli.pif.servicios;
import co.edu.poli.pif.modelo.Usuario;

public interface Operacion {

    public String create (Usuario x);
    public Usuario read (String id);
    public Usuario [] readAll ();
    public String update (Usuario x, String id);
    public Usuario delete (String id);
    public String serealizar (Usuario [] usuarios, String path, String name);
    public Usuario [] deserilizar (String path, String name);

}
