
package com.portfolio.dfv.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHys {
   @NotBlank
    private int idSk;
    @NotBlank
    private String nombreSk;
    @NotBlank
    private String fotoSk;
    @NotBlank
    private int porcentSk; 
      //Constructores

    public dtoHys() {
    }

    public dtoHys(String nombreSk, String fotoSk, int porcentSk) {
        this.nombreSk = nombreSk;
        this.fotoSk = fotoSk;
        this.porcentSk = porcentSk;
    }
    
    //Getters & Setters

    public int getIdSk() {
        return idSk;
    }

    public void setIdSk(int idSk) {
        this.idSk = idSk;
    }

    public String getNombreSk() {
        return nombreSk;
    }

    public void setNombreSk(String nombreSk) {
        this.nombreSk = nombreSk;
    }

    public String getFotoSk() {
        return fotoSk;
    }

    public void setFotoSk(String fotoSk) {
        this.fotoSk = fotoSk;
    }

    public int getPorcentSk() {
        return porcentSk;
    }

    public void setPorcentSk(int porcentSk) {
        this.porcentSk = porcentSk;
    }
    
}
