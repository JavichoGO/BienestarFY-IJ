package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.Categoria;
import pe.edu.upc.bienestarfy.entities.Role;
import pe.edu.upc.bienestarfy.entities.Suscripcion;
import pe.edu.upc.bienestarfy.serviceinterfaces.ICategoriaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private ICategoriaService cService;
    @PostMapping
    public void registrar(@RequestBody Categoria c) {

        cService.Insert(c);
    }
    @GetMapping
    public List<Categoria> listar() {
        return cService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Categoria p) {
        cService.Insert(p);
    }


    @PostMapping("/buscar")
    public List<Categoria> buscar(@RequestBody String nombreCategoria) throws ParseException {
        List<Categoria> listaCategorias;
        listaCategorias = cService.search(nombreCategoria);
        return listaCategorias;
    }
    @GetMapping("/{id}")
    public Optional<Categoria> listarId(@PathVariable("id") Integer id) {
        return cService.listarId(id);
    }
}