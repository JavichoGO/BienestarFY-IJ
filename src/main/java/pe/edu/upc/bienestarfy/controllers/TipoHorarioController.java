package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.TipoActividad;
import pe.edu.upc.bienestarfy.entities.TipoHorario;
import pe.edu.upc.bienestarfy.serviceinterfaces.ITipoHorarioService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

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
    public List<TipoHorario> buscar(@RequestBody String nombreTipoHorario) throws ParseException
    {        List<TipoHorario> listaTipoHorarios;
    listaTipoHorarios = pService.search(nombreTipoHorario);
        return listaTipoHorarios;
    }
    @GetMapping("/{id}")
    public Optional<TipoHorario> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}
