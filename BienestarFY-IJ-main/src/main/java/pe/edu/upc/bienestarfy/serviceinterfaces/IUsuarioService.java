package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.Role;
import pe.edu.upc.bienestarfy.entities.Usuario;

import java.util.List;
import java.util.Optional;
public interface IUsuarioService {
    public boolean Insert(Usuario Usuario);
    public void delete(int idUsuario);
    Optional<Usuario> listarId(int idUsuario);
    List<Usuario> list();
    List<Usuario>search(String nombreUsuario);
    List<Usuario>searchRole(String roleUsuario);

}
