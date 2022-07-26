package com.portfolio.dfv.Repository;

import com.portfolio.dfv.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion, Integer> {

    public Optional<Educacion> findBytituloEdu(String tituloEdu);

    public boolean existsBytituloEdu(String tituloEdu);

}
