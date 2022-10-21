package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.bienestarfy.entities.Categoria;
import pe.edu.upc.bienestarfy.entities.Role;
import pe.edu.upc.bienestarfy.repositories.IRoleRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.IRoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleRepository rR;
    @Override
    public void Insert(Role role) {
        rR.save(role);
    }
    @Override
    public List<Role> list() {
        return rR.findAll();
    }
    @Override
    public void delete(int idRole) {
        rR.deleteById(idRole);
    }
    @Override
    public List<Role> search(String nombreRole) {
        return rR.buscarNombre(nombreRole);
    }
}
