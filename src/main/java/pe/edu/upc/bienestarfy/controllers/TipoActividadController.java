package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.bienestarfy.entities.ReservaUsuario;
import pe.edu.upc.bienestarfy.entities.Role;
import pe.edu.upc.bienestarfy.entities.TADetalleReserva;
import pe.edu.upc.bienestarfy.entities.TipoActividad;
import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;
import pe.edu.upc.bienestarfy.serviceinterfaces.ITipoActividadService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipoactividad")

public class TipoActividadController {
    @Autowired
    private ITipoActividadService pService;

    @PostMapping
    public void registrar(@RequestBody TipoActividad p) {
        pService.Insert(p);
    }
    @GetMapping
    public List<TipoActividad> listar() {
        return pService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody TipoActividad p) {
        pService.Insert(p);
    }
    @PostMapping("/buscar")
    public List<TipoActividad> buscar(@RequestBody String nombreTipoActividad) throws ParseException
    {        List<TipoActividad> listaTipoActividades;
    listaTipoActividades = pService.search(nombreTipoActividad);
        return listaTipoActividades;
    }
    @GetMapping("/{id}")
    public Optional<TipoActividad> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
    @GetMapping("/contadorTipoActividad")
    public List<TADetalleReserva> contadorTipoActividad(){
        return pService.contadorTipoActividad();
    }
    
}