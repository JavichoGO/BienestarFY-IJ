package pe.edu.upc.bienestarfy.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.bienestarfy.entities.TipoActividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITipoActividadRepository extends JpaRepository<TipoActividad,Integer> {
    //JPQL
    @Query("FROM TipoActividad p " + "WHERE p.nombreTipoActividad like %:nombreTipoActividad%")
    List<TipoActividad> buscarNombre(@Param("nombreTipoActividad") String nombreTipoActividad);
    
    @Query(value="Select ta.nombre_tipo_actividad as \"nombre de TipoActividad\", count(dr.id_actividad) as \"cantidad Recomendados\" from tipo_actividad ta   inner join actividad a on ta.id_tipo_actividad = a.id_tipo_actividad inner join detalle_reserva dr on a.id_actividad = dr.id_actividad group by ta.nombre_tipo_actividad order by 2 desc",nativeQuery = true)
    List<String[]> contadorTipoActividad();
}

