package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.Categoria;
import pe.edu.upc.bienestarfy.entities.CategoriaUsuario;
import pe.edu.upc.bienestarfy.entities.Role;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService {

    
    public void Insert(Categoria categoria);
    List<Categoria> list();
    public void delete(int idCategoria);

    public Optional<Categoria> listarId(int idCategoria);
    List<Categoria>search(String nombreCategoria);

    List<CategoriaUsuario> contadorUsuario();
}