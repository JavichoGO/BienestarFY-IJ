package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.Role;

import java.util.List;

public interface IRoleService {

    public void Insert(Role role);
    List<Role> list();

}
