/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.virtualrecipe.dominio;

import java.util.Objects;

/**
 *
 * @author melis_000
 */
public class Farmaceutico {
    private String nomeFarmaceutico;
    private Integer crf;
    private Integer cpfFarm;
    private Integer telefoneFarm;
    private String emailFarm;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.nomeFarmaceutico);
        hash = 61 * hash + Objects.hashCode(this.crf);
        hash = 61 * hash + Objects.hashCode(this.cpfFarm);
        hash = 61 * hash + Objects.hashCode(this.telefoneFarm);
        hash = 61 * hash + Objects.hashCode(this.emailFarm);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Farmaceutico other = (Farmaceutico) obj;
        if (!Objects.equals(this.nomeFarmaceutico, other.nomeFarmaceutico)) {
            return false;
        }
        if (!Objects.equals(this.emailFarm, other.emailFarm)) {
            return false;
        }
        if (!Objects.equals(this.crf, other.crf)) {
            return false;
        }
        if (!Objects.equals(this.cpfFarm, other.cpfFarm)) {
            return false;
        }
        if (!Objects.equals(this.telefoneFarm, other.telefoneFarm)) {
            return false;
        }
        return true;
    }

    public String getNomeFarmaceutico() {
        return nomeFarmaceutico;
    }

    public void setNomeFarmaceutico(String nomeFarmaceutico) {
        this.nomeFarmaceutico = nomeFarmaceutico;
    }

    public Integer getCrf() {
        return crf;
    }

    public void setCrf(Integer crf) {
        this.crf = crf;
    }

    public Integer getCpfFarm() {
        return cpfFarm;
    }

    public void setCpfFarm(Integer cpfFarm) {
        this.cpfFarm = cpfFarm;
    }

    public Integer getTelefoneFarm() {
        return telefoneFarm;
    }

    public void setTelefoneFarm(Integer telefoneFarm) {
        this.telefoneFarm = telefoneFarm;
    }

    public String getEmailFarm() {
        return emailFarm;
    }

    public void setEmailFarm(String emailFarm) {
        this.emailFarm = emailFarm;
    }
    
    

    
    
}
