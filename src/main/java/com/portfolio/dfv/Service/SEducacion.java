
package com.portfolio.dfv.Service;

import com.portfolio.dfv.Entity.Educacion;
import com.portfolio.dfv.Repository.IEducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
   @Autowired
    IEducacionRepository iEducacionRepository; 
   public List<Educacion> list(){
         return iEducacionRepository.findAll();
     }
     
     public Optional<Educacion> getOne(int id){
         return iEducacionRepository.findById(id);
     }
     
     public Optional<Educacion> getBytituloEdu(String tituloEdu){
         return iEducacionRepository.findBytituloEdu(tituloEdu);
     }
     
     public void save(Educacion educ){
         iEducacionRepository.save(educ);
     }
     
     public void delete(int id){
         iEducacionRepository.deleteById(id);
     }
     
     public boolean existsById(int id){
         return iEducacionRepository.existsById(id);
     }
     
     public boolean existsBytituloEdu(String tituloEdu){
         return iEducacionRepository.existsBytituloEdu(tituloEdu);
     }
}
