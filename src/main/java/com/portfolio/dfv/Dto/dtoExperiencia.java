
package com.portfolio.dfv.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    
    @NotBlank
    private String nombree;
    @NotBlank
    private String descripcione;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombree, String descripcione) {
        this.nombree = nombree;
        this.descripcione = descripcione;
    }
    //Getters & Setters

    public String getNombree() {
        return nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }

    public String getDescripcione() {
        return descripcione;
    }

    public void setDescripcione(String descripcione) {
        this.descripcione = descripcione;
    }
    
}
