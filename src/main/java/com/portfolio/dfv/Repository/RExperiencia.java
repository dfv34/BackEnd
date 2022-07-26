
package com.portfolio.dfv.Repository;

import com.portfolio.dfv.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByNombree(String nombree);
    public boolean existsByNombree(String nombree);
}

