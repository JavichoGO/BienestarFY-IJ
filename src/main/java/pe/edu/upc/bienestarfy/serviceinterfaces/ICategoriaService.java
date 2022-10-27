package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.Categoria;

import java.util.List;

public interface ICategoriaService {
    public void insert(Categoria categoria);
    List<Categoria> list();
    public void delete(int idCategoria);
    List<Categoria>search(String nombreCategoria);
}
