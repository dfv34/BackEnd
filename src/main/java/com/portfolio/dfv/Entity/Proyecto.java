
package com.portfolio.dfv.Entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

   private int idPro;
    @Column(name = "nombrePro", length = 60, nullable = false)
    private String nombrePro;
    @Column(name = "fechaPro", length = 10, nullable = false)
    private Date fechaPro;
    @Column(name = "descPro", length = 60, nullable = false)
    private String descPro;
    @Column(name = "imagenPro", length = 150, nullable = true )
    private String imagenPro;  

    public Proyecto() {
    }

    public Proyecto(String nombrePro, Date fechaPro, String descPro, String imagenPro) {
        this.nombrePro = nombrePro;
        this.fechaPro = fechaPro;
        this.descPro = descPro;
        this.imagenPro = imagenPro;
    }

    public int getIdPro() {
        return idPro;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public Date getFechaPro() {
        return fechaPro;
    }

    public void setFechaPro(Date fechaPro) {
        this.fechaPro = fechaPro;
    }

    public String getDescPro() {
        return descPro;
    }

    public void setDescPro(String descPro) {
        this.descPro = descPro;
    }

    public String getImagenPro() {
        return imagenPro;
    }

    public void setImagenPro(String imagenPro) {
        this.imagenPro = imagenPro;
    }
    
    
}
