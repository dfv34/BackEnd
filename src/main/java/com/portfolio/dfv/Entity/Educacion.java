
package com.portfolio.dfv.Entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEdu;
    @Column(name = "tituloEdu", length = 60, nullable = false)
    private String tituloEdu;
    @Column(name = "fechainicioEdu", length = 4, nullable = false)
    private Date fechainicioEdu;
    @Column(name = "fechafinEdu", length = 4, nullable = true)
    private Date fechafinEdu;
    @Column(name = "descEdu", length = 60, nullable = false)
    private String descEdu;
    @Column(name = "imagenEdu", length = 150, nullable = true )
    private String imagenEdu;
    
    
    
    
    public Educacion(){
}

   

    public Educacion(String tituloEdu, Date fechainicioEdu, Date fechafinEdu, String descEdu, String imagenEdu) {
       this.tituloEdu = tituloEdu;
        this.fechainicioEdu = fechainicioEdu;
        this.fechafinEdu = fechafinEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
        
           }

   

   
    public int getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(int idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public Date getFechainicioEdu() {
        return fechainicioEdu;
    }

    public void setFechainicioEdu(Date fechainicioEdu) {
        this.fechainicioEdu = fechainicioEdu;
    }

    public Date getFechafinEdu() {
        return fechafinEdu;
    }

    public void setFechafinEdu(Date fechafinEdu) {
        this.fechafinEdu = fechafinEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }
    
}
