package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.bienestarfy.entities.Role;
import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;
import pe.edu.upc.bienestarfy.serviceinterfaces.ITipoSuscripcionService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tiposuscripcion")
public class TipoSuscripcionController {
    //pruebacommit
    @Autowired
    private ITipoSuscripcionService tsService;

    @PostMapping
    public void registrar(@RequestBody TipoSuscripcion ts) {

        tsService.Insert(ts);
    }
    @GetMapping
    public List<TipoSuscripcion> listar() {
        return tsService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        tsService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody TipoSuscripcion p) {
        tsService.Insert(p);
    }
    @PostMapping("/buscar")
    public List<TipoSuscripcion> buscar(@RequestBody String nombreTipoSuscripcion) throws ParseException
    {        List<TipoSuscripcion> listaTipoSuscripciones;
    listaTipoSuscripciones = tsService.search(nombreTipoSuscripcion);
        return listaTipoSuscripciones;
    }
    @GetMapping("/{id}")
    public Optional<TipoSuscripcion> listarId(@PathVariable("id") Integer id) {
        return tsService.listarId(id);
    }
