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
}