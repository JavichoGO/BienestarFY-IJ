package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.DetalleReserva;
import pe.edu.upc.bienestarfy.entities.Usuario;
import pe.edu.upc.bienestarfy.serviceinterfaces.IActividadService;
import pe.edu.upc.bienestarfy.serviceinterfaces.IDetalleReservaService;
import pe.edu.upc.bienestarfy.serviceinterfaces.IUsuarioService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detallereserva")
public class DetalleReservaController {
    @Autowired
    private IDetalleReservaService drService;
    @PostMapping
    public void registrar(@RequestBody DetalleReserva dr) {
    	drService.Insert(dr);
    }
    @GetMapping
    public List<DetalleReserva> listar() {
        return drService.list();
    }
    @PutMapping
    public void modificar(@RequestBody DetalleReserva dr) {
    	drService.Insert(dr);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        drService.delete(id);
    }

    @PostMapping("/buscar")
    public List<DetalleReserva> buscar(@RequestBody DetalleReserva dr) throws ParseException {
        List<DetalleReserva> listaDetalleReservas;
        listaDetalleReservas = drService.search(dr.getNombreDetalleReserva());
        if (listaDetalleReservas.isEmpty()) {
        	listaDetalleReservas = drService.search(dr.getReserva().getNombreReserva());
        }
        return listaDetalleReservas;
    }
    @GetMapping("/{id}")
    public Optional<DetalleReserva> listarId(@PathVariable("id") Integer id) {
        return drService.listarId(id);
    }

}