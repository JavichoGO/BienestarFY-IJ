package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.Horario;
import pe.edu.upc.bienestarfy.entities.RespuestaUsuarioHorario;
import pe.edu.upc.bienestarfy.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface IHorarioService {

    public boolean Insert(Horario horario);
    public void delete(int idHorario);
    Optional<Horario> listarId(int idHorario);
    List<Horario> list();
    List<Horario>search(String nombreHorario);

    List<Horario>searchTipoHorario(String horTipo);
    List<RespuestaUsuarioHorario> horariousuario();

}