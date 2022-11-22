package pe.edu.upc.bienestarfy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;

import java.util.List;


@Repository
public interface ITipoSuscripcionRepository extends JpaRepository<TipoSuscripcion,Integer> {
    //JPQL
    @Query("FROM TipoSuscripcion p " + "WHERE p.nombreTipoSuscripcion like %:nombreTipoSuscripcion%")
    List<TipoSuscripcion> buscarNombre(@Param("nombreTipoSuscripcion") String nombreTipoSuscripcion);

    @Query(value ="select * from tipo_suscripcion ts where ts.descuento_tipo_suscripcion = (select MAX(descuento_tipo_suscripcion) from tipo_suscripcion)",nativeQuery = true)
    List<TipoSuscripcion> buscarDescuento();
}
