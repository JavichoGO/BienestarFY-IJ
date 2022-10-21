package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.Role;
import pe.edu.upc.bienestarfy.serviceinterfaces.IRoleService;

import java.util.List;

@RestController
@RequestMapping("/role")

public class RoleController {
    @Autowired
    private IRoleService pService;
    @PostMapping
    public void registrar(@RequestBody Role p) {
        pService.Insert(p);
    }
    @GetMapping
    public List<Role> listar() {
        return pService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Role p) {
        pService.Insert(p);
    }
    @PostMapping("/buscar")
    public List<Role> buscar(@RequestBody Role p) {
        return pService.search(p.getNombreRole());
    }
}
