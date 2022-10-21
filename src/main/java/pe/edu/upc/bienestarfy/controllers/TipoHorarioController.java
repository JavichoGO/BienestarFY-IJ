package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.TipoActividad;
import pe.edu.upc.bienestarfy.entities.TipoHorario;
import pe.edu.upc.bienestarfy.serviceinterfaces.ITipoHorarioService;

import java.util.List;

@RestController
@RequestMapping("/tipohorario")

public class TipoHorarioController {
    @Autowired
    private ITipoHorarioService pService;
    @PostMapping
    public void registrar(@RequestBody TipoHorario p) {
        pService.Insert(p);
    }
    @GetMapping
    public List<TipoHorario> listar() {
        return pService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody TipoHorario p) {
        pService.Insert(p);
    }
    @PostMapping("/buscar")
    public List<TipoHorario> buscar(@RequestBody TipoHorario p) {
        return pService.search(p.getNombreTipoHorario());
    }
}
