
package com.portfolio.dfv.Service;

import com.portfolio.dfv.Entity.Hys;
import com.portfolio.dfv.Repository.IHysRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHys {
    @Autowired
    IHysRepository iHysRepository;
    public List<Hys> list(){
         return iHysRepository.findAll();
     }
     
     public Optional<Hys> getOne(int id){
         return iHysRepository.findById(id);
     }
     
     public Optional<Hys> getBynombreSk(String nombreSk){
         return iHysRepository.findBynombreSk(nombreSk);
     }
     
     public void save(Hys hyss){
         iHysRepository.save(hyss);
     }
     
     public void delete(int id){
         iHysRepository.deleteById(id);
     }
     
     public boolean existsById(int id){
         return iHysRepository.existsById(id);
     }
     
     public boolean existsBynombreSk(String nombreSk){
         return iHysRepository.existsBynombreSk(nombreSk);
     }
    
}
