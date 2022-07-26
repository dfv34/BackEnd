
package com.portfolio.dfv.Security.Service;

import com.portfolio.dfv.Security.Entity.Rol;
import com.portfolio.dfv.Security.Enums.RolNombre;
import com.portfolio.dfv.Security.Repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        
        return irolRepository.findByRolNombre(rolNombre);
        
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
