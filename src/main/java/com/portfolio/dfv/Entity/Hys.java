
package com.portfolio.dfv.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hys {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSk;
    @Column(name = "nombreSk", length = 30, nullable = false)
    private String nombreSk;
    @Column(name = "fotoSk", length = 100, nullable = false)
    private String fotoSk;
    @Column(name = "porcentaje", length = 3, nullable = false)
    private int porcentSk; 

    public Hys() {
    }

    public Hys(String nombreSk, String fotoSk, int porcentSk) {
        this.nombreSk = nombreSk;
        this.fotoSk = fotoSk;
        this.porcentSk = porcentSk;
    }

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
