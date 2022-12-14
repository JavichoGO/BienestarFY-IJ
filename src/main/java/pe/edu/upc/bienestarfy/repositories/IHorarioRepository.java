package pe.edu.upc.bienestarfy.repositories;

import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.Horario;


import java.util.List;

public interface IHorarioRepository extends JpaRepository<Horario, Integer>  {

    //JPQL
    @Query("FROM Horario a " + "WHERE a.nombreHorario like %:nombreHorario%")
    List<Horario> buscarNombre(@Param("nombreHorario") String nombreHorario);

    @Query("from Horario a where a.tipoHorario.nombreTipoHorario like %:nombreTipoHorario%")
    List<Horario> searchnombreTipoHorario(@Param("nombreTipoHorario") String nombreTipoHorario);

    @Query(value = "select h.id_horario, h.nombre_horario, u.nombre_usuario,  c.nombre_categoria from horario h inner join usuario u on h.id_usuario=u.id_usuario inner join categoria c on u.idcategoria= c.id_categoria", nativeQuery = true)
    List<String[]>horariousuario();

}