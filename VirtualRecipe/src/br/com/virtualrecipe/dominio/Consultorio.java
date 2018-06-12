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
public class Consultorio {
    private String nomeConsultorio;
    private Integer telefone1Consultorio;
    private Integer telefone2Consultorio;
    private String enderecoCons;
    private Integer numeroEndCons;
    private String complEndCons;
    private String responsavelCons;
    private Integer cpfRespCons;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nomeConsultorio);
        hash = 71 * hash + Objects.hashCode(this.telefone1Consultorio);
        hash = 71 * hash + Objects.hashCode(this.telefone2Consultorio);
        hash = 71 * hash + Objects.hashCode(this.enderecoCons);
        hash = 71 * hash + Objects.hashCode(this.numeroEndCons);
        hash = 71 * hash + Objects.hashCode(this.complEndCons);
        hash = 71 * hash + Objects.hashCode(this.responsavelCons);
        hash = 71 * hash + Objects.hashCode(this.cpfRespCons);
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
        final Consultorio other = (Consultorio) obj;
        if (!Objects.equals(this.nomeConsultorio, other.nomeConsultorio)) {
            return false;
        }
        if (!Objects.equals(this.enderecoCons, other.enderecoCons)) {
            return false;
        }
        if (!Objects.equals(this.complEndCons, other.complEndCons)) {
            return false;
        }
        if (!Objects.equals(this.responsavelCons, other.responsavelCons)) {
            return false;
        }
        if (!Objects.equals(this.telefone1Consultorio, other.telefone1Consultorio)) {
            return false;
        }
        if (!Objects.equals(this.telefone2Consultorio, other.telefone2Consultorio)) {
            return false;
        }
        if (!Objects.equals(this.numeroEndCons, other.numeroEndCons)) {
            return false;
        }
        if (!Objects.equals(this.cpfRespCons, other.cpfRespCons)) {
            return false;
        }
        return true;
    }

    public String getNomeConsultorio() {
        return nomeConsultorio;
    }

    public void setNomeConsultorio(String nomeConsultorio) {
        this.nomeConsultorio = nomeConsultorio;
    }

    public Integer getTelefone1Consultorio() {
        return telefone1Consultorio;
    }

    public void setTelefone1Consultorio(Integer telefone1Consultorio) {
        this.telefone1Consultorio = telefone1Consultorio;
    }

    public Integer getTelefone2Consultorio() {
        return telefone2Consultorio;
    }

    public void setTelefone2Consultorio(Integer telefone2Consultorio) {
        this.telefone2Consultorio = telefone2Consultorio;
    }

    public String getEnderecoCons() {
        return enderecoCons;
    }

    public void setEnderecoCons(String enderecoCons) {
        this.enderecoCons = enderecoCons;
    }

    public Integer getNumeroEndCons() {
        return numeroEndCons;
    }

    public void setNumeroEndCons(Integer numeroEndCons) {
        this.numeroEndCons = numeroEndCons;
    }

    public String getComplEndCons() {
        return complEndCons;
    }

    public void setComplEndCons(String complEndCons) {
        this.complEndCons = complEndCons;
    }

    public String getResponsavelCons() {
        return responsavelCons;
    }

    public void setResponsavelCons(String responsavelCons) {
        this.responsavelCons = responsavelCons;
    }

    public Integer getCpfRespCons() {
        return cpfRespCons;
    }

    public void setCpfRespCons(Integer cpfRespCons) {
        this.cpfRespCons = cpfRespCons;
    }
    

    
    
}
