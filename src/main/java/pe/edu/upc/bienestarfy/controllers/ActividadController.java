package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.Usuario;
import pe.edu.upc.bienestarfy.serviceinterfaces.IActividadService;
import pe.edu.upc.bienestarfy.serviceinterfaces.IUsuarioService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/actividad")
public class ActividadController {
    @Autowired
    private IActividadService aService;
    @PostMapping
    public void registrar(@RequestBody Actividad a) {
        aService.Insert(a);
    }
    @GetMapping
    public List<Actividad> listar() {
        return aService.list();
    }
    @PutMapping
    public void modificar(@RequestBody Actividad a) {
        aService.Insert(a);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        aService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Actividad> buscar(@RequestBody Actividad a) throws ParseException {
        List<Actividad> listaActividades;
        listaActividades = aService.search(a.getNombreActividad());
        if (listaActividades.isEmpty()) {
            listaActividades = aService.search(a.getTipoactividad().getNombreTipoActividad());
        }
        return listaActividades;
    }
    @GetMapping("/{id}")
    public Optional<Actividad> listarId(@PathVariable("id") Integer id) {
        return aService.listarId(id);
    }

}