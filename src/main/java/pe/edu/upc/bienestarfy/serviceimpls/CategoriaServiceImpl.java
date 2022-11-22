package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.Categoria;
import pe.edu.upc.bienestarfy.entities.CategoriaUsuario;
import pe.edu.upc.bienestarfy.entities.Role;
import pe.edu.upc.bienestarfy.entities.TADetalleReserva;
import pe.edu.upc.bienestarfy.repositories.ICategoriaRepository;
import pe.edu.upc.bienestarfy.repositories.IRoleRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.ICategoriaService;

import java.util.ArrayList;
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
    @Override
    public List<CategoriaUsuario> contadorUsuario() {
        List<CategoriaUsuario> lista=new ArrayList<>();
        cR.contadorUsuario().forEach(
                y->{
                	CategoriaUsuario r= new CategoriaUsuario();
                    r.setNombreCategoria(y[0]);
                    r.setCantidad(Integer.valueOf(y[1]));
                    lista.add(r);
                }
        );
        return lista;
    }
}
