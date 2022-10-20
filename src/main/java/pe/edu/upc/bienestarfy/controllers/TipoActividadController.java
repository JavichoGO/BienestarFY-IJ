package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.TipoActividad;
import pe.edu.upc.bienestarfy.serviceinterfaces.ITipoActividadService;

import java.util.List;

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
}
