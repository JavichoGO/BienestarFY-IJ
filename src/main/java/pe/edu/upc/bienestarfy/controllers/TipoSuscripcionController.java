package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;
import pe.edu.upc.bienestarfy.serviceinterfaces.ITipoSuscripcionService;

import java.util.List;

@RestController
@RequestMapping("/tiposuscripcion")
public class TipoSuscripcionController {
    //pruebacommit
    @Autowired
    private ITipoSuscripcionService tsService;

    @PostMapping
    public void registrar(@RequestBody TipoSuscripcion ts) {

        tsService.insert(ts);
    }
    @GetMapping
    public List<TipoSuscripcion> listar() {
        return tsService.list();
    }
}