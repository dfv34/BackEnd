
package com.portfolio.dfv.Controller;

import com.portfolio.dfv.Dto.dtoHys;
import com.portfolio.dfv.Entity.Hys;
import com.portfolio.dfv.Security.Controller.Mensaje;
import com.portfolio.dfv.Service.SHys;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hyslab")
@CrossOrigin(origins = "https://portfoliodfv-83217.web.app")
public class CHys {
  @Autowired
    SHys sHys; 
  @GetMapping("/lista")
    public ResponseEntity<List<Hys>> list(){
        List<Hys> list = sHys.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Hys> getById(@PathVariable("id") int id){
        if(!sHys.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Hys hys = sHys.getOne(id).get();
        return new ResponseEntity(hys, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sHys.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sHys.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHys dtohys){      
        if(StringUtils.isBlank(dtohys.getNombreSk()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sHys.existsBynombreSk(dtohys.getNombreSk()))
            return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        
       Hys hys = new Hys(dtohys.getNombreSk(),dtohys.getFotoSk(),dtohys.getPorcentSk());
        sHys.save(hys);
        
        return new ResponseEntity(new Mensaje("Habilidad agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHys dtohys){
        //Validamos si existe el ID
        if(!sHys.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencias
        if(sHys.existsBynombreSk(dtohys.getNombreSk()) && sHys.getBynombreSk(dtohys.getNombreSk()).get().getIdSk() != id)
            return new ResponseEntity(new Mensaje("Esa Habilidad ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtohys.getNombreSk()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Hys hys = sHys.getOne(id).get();
        hys.setNombreSk(dtohys.getNombreSk());
        hys.setPorcentSk((dtohys.getPorcentSk()));
        hys.setFotoSk((dtohys.getFotoSk()));
        
        sHys.save(hys);
        return new ResponseEntity(new Mensaje("Habilidad actualizada"), HttpStatus.OK);
             
    }
    
}
