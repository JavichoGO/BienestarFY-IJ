package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.bienestarfy.entities.Categoria;
import pe.edu.upc.bienestarfy.entities.Role;
import pe.edu.upc.bienestarfy.repositories.ICategoriaRepository;
import pe.edu.upc.bienestarfy.repositories.IRoleRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.ICategoriaService;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private ICategoriaRepository cR;
    @Override
    public void Insert(Categoria categoria) {
    	cR.save(categoria);
    }
    @Override
    public List<Categoria> list() {
        return cR.findAll();
    }
    @Override
    public void delete(int idCategoria) {
    	cR.deleteById(idCategoria);
    }
    @Override
    public List<Categoria> search(String nombreCategoria) {
        return cR.buscarNombre(nombreCategoria);
    }
    @Override
    public Optional<Categoria> listarId(int idCategoria) {
        return cR.findById(idCategoria);
    }
}
