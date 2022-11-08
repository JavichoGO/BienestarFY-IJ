package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.Suscripcion;
import pe.edu.upc.bienestarfy.serviceinterfaces.ISuscripcionService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/suscripcion")

public class SuscripcionController {
    @Autowired
    private ISuscripcionService sService;
    @PostMapping
    public void registrar(@RequestBody Suscripcion p) {
        sService.Insert(p);
    }
    @GetMapping
    public List<Suscripcion> listar() {
        return sService.list();
    }
    @PutMapping
    public void modificar(@RequestBody Suscripcion p) {
        sService.Insert(p);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        sService.delete(id);
    }



    @PostMapping("/buscar")
    public List<Suscripcion> buscar(@RequestBody Suscripcion v) throws ParseException {
        List<Suscripcion> listaSuscripcion;
        listaSuscripcion = sService.search(v.getNombreSuscripcion());
        if (listaSuscripcion.isEmpty()) {
            listaSuscripcion = sService.search(v.getTipoSuscripcion().getNombreTipoSuscripcion());
        }
        return listaSuscripcion;
    }
    @GetMapping("/{id}")
    public Optional<Suscripcion> listarId(@PathVariable("id") Integer id) {
        return sService.listarId(id);
    }
}