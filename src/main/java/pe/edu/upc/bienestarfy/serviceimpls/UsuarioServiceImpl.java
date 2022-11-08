package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.bienestarfy.entities.Usuario;
import pe.edu.upc.bienestarfy.repositories.IUsuarioRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.IUsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private IUsuarioRepository rU;
    @Override
    @Transactional
    public boolean Insert(Usuario usuario) {
        Usuario objUsuario = rU.save(usuario);
        if (objUsuario == null) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public List<Usuario> list() {
        return rU.findAll();
    }
    @Override
    @Transactional
    public void delete(int idUsuario) {
        rU.deleteById(idUsuario);
    }
    @Override
    public List<Usuario> search(String nombreUsuario) {
        return rU.buscarNombre(nombreUsuario);
    }
    @Override
    public List<Usuario> searchRole(String roleUsuario) {
        return rU.buscarnombreRole(roleUsuario);
    }
    @Override
    public Optional<Usuario> listarId(int idUsuario) {
        return rU.findById(idUsuario);
    }

}
