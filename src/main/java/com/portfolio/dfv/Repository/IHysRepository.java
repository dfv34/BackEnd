
package com.portfolio.dfv.Repository;

import com.portfolio.dfv.Entity.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHysRepository extends JpaRepository<Hys, Integer> {
      public Optional<Hys> findBynombreSk(String nombreSk);

    public boolean existsBynombreSk(String nombreSk);
    
}
