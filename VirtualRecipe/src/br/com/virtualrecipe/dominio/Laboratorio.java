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
public class Laboratorio {
   private String nomeLab;
    private Integer telefone1Lab;
    private Integer telefone2Lab;
    private String responsavelLab;
    private Integer cpfRespLab;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nomeLab);
        hash = 89 * hash + Objects.hashCode(this.telefone1Lab);
        hash = 89 * hash + Objects.hashCode(this.telefone2Lab);
        hash = 89 * hash + Objects.hashCode(this.responsavelLab);
        hash = 89 * hash + Objects.hashCode(this.cpfRespLab);
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
        final Laboratorio other = (Laboratorio) obj;
        if (!Objects.equals(this.nomeLab, other.nomeLab)) {
            return false;
        }
        
        if (!Objects.equals(this.responsavelLab, other.responsavelLab)) {
            return false;
        }
        if (!Objects.equals(this.telefone1Lab, other.telefone1Lab)) {
            return false;
        }
        if (!Objects.equals(this.telefone2Lab, other.telefone2Lab)) {
            return false;
        }
        if (!Objects.equals(this.cpfRespLab, other.cpfRespLab)) {
            return false;
        }
        return true;
    }

    public String getNomeLab() {
        return nomeLab;
    }

    public void setNomeLab(String nomeLab) {
        this.nomeLab = nomeLab;
    }

    public Integer getTelefone1Lab() {
        return telefone1Lab;
    }

    public void setTelefone1Lab(Integer telefone1Lab) {
        this.telefone1Lab = telefone1Lab;
    }

    public Integer getTelefone2Lab() {
        return telefone2Lab;
    }

    public void setTelefone2Lab(Integer telefone2Lab) {
        this.telefone2Lab = telefone2Lab;
    }

    public String getResponsavelLab() {
        return responsavelLab;
    }

    public void setResponsavelLab(String responsavelLab) {
        this.responsavelLab = responsavelLab;
    }

    public Integer getCpfRespLab() {
        return cpfRespLab;
    }

    public void setCpfRespLab(Integer cpfRespLab) {
        this.cpfRespLab = cpfRespLab;
    }

    
  
}
