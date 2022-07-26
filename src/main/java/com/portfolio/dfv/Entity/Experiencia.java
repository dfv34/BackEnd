
package com.portfolio.dfv.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombree;
    private String descripcione;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombree, String descripcione) {
        this.nombree = nombree;
        this.descripcione = descripcione;
    }
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
