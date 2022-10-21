package pe.edu.upc.bienestarfy.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.bienestarfy.entities.Categoria;
import pe.edu.upc.bienestarfy.entities.Role;

import java.util.List;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Integer> {
    //JPQL
    @Query("FROM Role p " + "WHERE p.nombreRole like %:nombreRole")
    List<Role> buscarNombre(@Param("nombreRole") String nombreRole);
}
