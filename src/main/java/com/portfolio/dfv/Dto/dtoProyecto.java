
package com.portfolio.dfv.Dto;

import java.util.Date;
import javax.persistence.Column;
import javax.validation.constraints.NotBlank;


public class dtoProyecto {
     @NotBlank
    private int idPro;
     @NotBlank
    private String nombrePro;
     @NotBlank
    private Date fechaPro;
     @NotBlank
    private String descPro;
     @NotBlank
    private String imagenPro; 

    public dtoProyecto() {
    }

    public dtoProyecto(String nombrePro, Date fechaPro, String descPro, String imagenPro) {
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
