package pe.edu.upc.bienestarfy.repositories;

import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.bienestarfy.entities.Actividad;


import java.util.List;

public interface IActividadRepository extends JpaRepository<Actividad, Integer> {

    //JPQL
    @Query("FROM Actividad a " + "WHERE a.nombreActividad like %:nombreActividad%")
    List<Actividad> buscarNombre(@Param("nombreActividad") String nombreActividad);

    @Query("from Actividad a where a.tipoActividad.nombreTipoActividad like %:nombreTipoActividad%")
    List<Actividad> searchnombreTipoActividad(@Param("nombreTipoActividad") String nombreTipoActividad);

    @Query(value="select u.nombre_usuario, count(a.id_actividad)from usuario u inner join actividad a on u.id_usuario = a.id_usuario group by u.id_usuario",nativeQuery = true)
    List<String[]>buscarCantidadActividades();
    
    @Query(value ="select * from actividad act where act.duracion_actividad = (select MAX(duracion_actividad) from actividad)",nativeQuery = true)
    List<Actividad> buscarDuracion();

}