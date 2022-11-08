package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.Reserva;
import pe.edu.upc.bienestarfy.serviceinterfaces.IReservaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    //pruebacommit
    @Autowired
    private IReservaService pService;
    @PostMapping
    public void registrar(@RequestBody Reserva p) {
        pService.Insert(p);
    }
    @GetMapping
    public List<Reserva> listar() {
        return pService.list();
    }
    @PutMapping
    public void modificar(@RequestBody Reserva p) {
        pService.Insert(p);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Reserva> buscar(@RequestBody Reserva v) throws ParseException {
        List<Reserva> listaReservas;
        listaReservas = pService.search(v.getNombreReserva());
        if (listaReservas.isEmpty()) {
            listaReservas = pService.searchUsuario(v.getUsuario().getNombreUsuario());
        }
        return listaReservas;
    }
    @GetMapping("/{id}")
    public Optional<Reserva> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}
