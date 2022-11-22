package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.bienestarfy.entities.RespuestaSuscripcion;
import pe.edu.upc.bienestarfy.entities.RespuestaUsuarioMenorEdad;
import pe.edu.upc.bienestarfy.entities.Usuario;
import pe.edu.upc.bienestarfy.serviceinterfaces.IUsuarioService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/usuario")

public class UsuarioController {
    @Autowired
    private IUsuarioService pService;
    @PostMapping
    public void registrar(@RequestBody Usuario p) {
        pService.Insert(p);
    }
    @GetMapping
    public List<Usuario> listar() {
        return pService.list();
    }
    @PutMapping
    public void modificar(@RequestBody Usuario p) {
        pService.Insert(p);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.delete(id);
    }



    @PostMapping("/buscar")
    public List<Usuario> buscar(@RequestBody Usuario v) throws ParseException {
        List<Usuario> listaUsuarios;
        listaUsuarios = pService.search(v.getNombreUsuario());
        if (listaUsuarios.isEmpty()) {
            listaUsuarios = pService.search(v.getRole().getNombreRole());
            listaUsuarios = pService.search(v.getCategoria().getNombreCategoria());
            listaUsuarios = pService.search(v.getSuscripcion().getNombreSuscripcion());
        }
        return listaUsuarios;
    }
    @GetMapping("/{id}")
    public Optional<Usuario> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
    @GetMapping("/cantidadusuario")
    public List<RespuestaSuscripcion> buscarCantidadUsuarios(){
        return pService.buscarCantidadUsuarios();
    }
    @GetMapping("/MenorEdadUsuario")
    public List<RespuestaUsuarioMenorEdad>MenorEdadUsuario(){return pService.MenorEdadUsuario();}

}