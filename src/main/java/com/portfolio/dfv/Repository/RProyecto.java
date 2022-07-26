
package com.portfolio.dfv.Repository;

import com.portfolio.dfv.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyecto, Integer>{
     public Optional<Proyecto> findBynombrePro(String nombrePro);

    public boolean existsBynombrePro(String nombrePro);
}
