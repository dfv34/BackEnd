
package com.portfolio.dfv.Security.Repository;

import com.portfolio.dfv.Security.Entity.Rol;
import com.portfolio.dfv.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
    
    
}
