package pe.edu.upc.bienestarfy.serviceinterfaces;


import pe.edu.upc.bienestarfy.entities.Role;

import java.util.List;
import java.util.Optional;

public interface IRoleService {

    public void Insert(Role role);
    List<Role> list();
    public void delete(int idRole);

    public Optional<Role> listarId(int idRole);
    List<Role>search(String nombreRole);




}