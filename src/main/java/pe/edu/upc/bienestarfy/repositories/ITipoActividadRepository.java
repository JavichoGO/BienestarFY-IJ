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
}

