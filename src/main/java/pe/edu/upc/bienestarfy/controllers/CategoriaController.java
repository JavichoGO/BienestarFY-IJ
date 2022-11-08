package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.Categoria;
import pe.edu.upc.bienestarfy.entities.Role;
import pe.edu.upc.bienestarfy.serviceinterfaces.ICategoriaService;

import java.util.List;
@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private ICategoriaService cService;
    @PostMapping
    public void registrar(@RequestBody Categoria c) {

        cService.insert(c);
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
        cService.insert(p);
    }
    @PostMapping("/buscar")
    public List<Categoria> buscar(@RequestBody Categoria p) {
        return cService.search(p.getNombreCategoria());
    }
}