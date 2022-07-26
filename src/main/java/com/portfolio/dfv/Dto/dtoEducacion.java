package com.portfolio.dfv.Dto;

import java.util.Date;
import javax.validation.constraints.NotBlank;

public class dtoEducacion {

    @NotBlank
    private String tituloEdu;
    @NotBlank
    private Date fechainicioEdu;
    @NotBlank
    private Date fechafinEdu;
    @NotBlank
    private String descEdu;
    @NotBlank
    private String imagenEdu;

    //Constructores
    public dtoEducacion() {
    }

    public dtoEducacion(String tituloEdu, Date fechainicioEdu, Date fechafinEdu, String descEdu, String imagenEdu) {
        this.tituloEdu = tituloEdu;
        this.fechainicioEdu = fechainicioEdu;
        this.fechafinEdu = fechafinEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
    }
    //Getters & Setters

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
