package pe.edu.upc.bienestarfy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.Horario;
import pe.edu.upc.bienestarfy.entities.RespuestaUsuarioHorario;
import pe.edu.upc.bienestarfy.entities.Usuario;
import pe.edu.upc.bienestarfy.serviceinterfaces.IActividadService;
import pe.edu.upc.bienestarfy.serviceinterfaces.IHorarioService;
import pe.edu.upc.bienestarfy.serviceinterfaces.IUsuarioService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/horario")
public class HorarioController {
	   @Autowired
	    private IHorarioService hService;
	    @PostMapping
	    public void registrar(@RequestBody Horario h) {
	    	hService.Insert(h);
	    }
	    @GetMapping
	    public List<Horario> listar() {
	        return hService.list();
	    }
	    @PutMapping
	    public void modificar(@RequestBody Horario h ) {
	    	hService.Insert(h);
	    }
	    @DeleteMapping("/{id}")
	    public void eliminar(@PathVariable("id") Integer id) {
	    	hService.delete(id);
	    }

	    @PostMapping("/buscar")
	    public List<Horario> buscar(@RequestBody Horario h) throws ParseException {
	        List<Horario> listaHorarios;
	        listaHorarios = hService.search(h.getNombreHorario());
	        if (listaHorarios.isEmpty()) {
	            listaHorarios = hService.search(h.getTipoHorario().getNombreTipoHorario());
	        }
	        return listaHorarios;
	    }
	    @GetMapping("/{id}")
	    public Optional<Horario> listarId(@PathVariable("id") Integer id) {
	        return hService.listarId(id);
	    }

		@GetMapping("/horariousuario")
		public List<RespuestaUsuarioHorario> horariousuario(){
		return hService.horariousuario();
	}
		}