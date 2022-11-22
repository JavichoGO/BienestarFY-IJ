package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.Categoria;
import pe.edu.upc.bienestarfy.entities.Role;
import pe.edu.upc.bienestarfy.entities.TipoHorario;
import pe.edu.upc.bienestarfy.serviceinterfaces.IRoleService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

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
    public List<Role> buscar(@RequestBody String nombreRole) throws ParseException
    {        List<Role> listaRoles;
    listaRoles = pService.search(nombreRole);
        return listaRoles;
    }
    @GetMapping("/{id}")
    public Optional<Role> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}