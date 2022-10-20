package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.Categoria;
import pe.edu.upc.bienestarfy.serviceinterfaces.ICategoriaService;

import java.util.List;
@RestController
@RequestMapping("/categorias")
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
}