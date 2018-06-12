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
public class Medico {
    private String nomeMedico;
    private Integer telResMedico;
    private Integer telCelMedico;
    private Integer rgMedico;
    private Integer cpfMedico;
    private Integer crm;
    private String especializacaoMedico;
    private String conveniosMedico;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nomeMedico);
        hash = 17 * hash + Objects.hashCode(this.telResMedico);
        hash = 17 * hash + Objects.hashCode(this.telCelMedico);
        hash = 17 * hash + Objects.hashCode(this.rgMedico);
        hash = 17 * hash + Objects.hashCode(this.cpfMedico);
        hash = 17 * hash + Objects.hashCode(this.crm);
        hash = 17 * hash + Objects.hashCode(this.especializacaoMedico);
        hash = 17 * hash + Objects.hashCode(this.conveniosMedico);
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
        final Medico other = (Medico) obj;
        if (!Objects.equals(this.nomeMedico, other.nomeMedico)) {
            return false;
        }
        if (!Objects.equals(this.especializacaoMedico, other.especializacaoMedico)) {
            return false;
        }
        if (!Objects.equals(this.conveniosMedico, other.conveniosMedico)) {
            return false;
        }
        if (!Objects.equals(this.telResMedico, other.telResMedico)) {
            return false;
        }
        if (!Objects.equals(this.telCelMedico, other.telCelMedico)) {
            return false;
        }
        if (!Objects.equals(this.rgMedico, other.rgMedico)) {
            return false;
        }
        if (!Objects.equals(this.cpfMedico, other.cpfMedico)) {
            return false;
        }
        if (!Objects.equals(this.crm, other.crm)) {
            return false;
        }
        return true;
    }

    public Integer getTelResMedico() {
        return telResMedico;
    }

    public void setTelResMedico(Integer telResMedico) {
        this.telResMedico = telResMedico;
    }

    public Integer getTelCelMedico() {
        return telCelMedico;
    }

    public void setTelCelMedico(Integer telCelMedico) {
        this.telCelMedico = telCelMedico;
    }

    public Integer getRgMedico() {
        return rgMedico;
    }

    public void setRgMedico(Integer rgMedico) {
        this.rgMedico = rgMedico;
    }

    public Integer getCpfMedico() {
        return cpfMedico;
    }

    public void setCpfMedico(Integer cpfMedico) {
        this.cpfMedico = cpfMedico;
    }

    public String getEspecializacaoMedico() {
        return especializacaoMedico;
    }

    public void setEspecializacaoMedico(String especializacaoMedico) {
        this.especializacaoMedico = especializacaoMedico;
    }

    public String getConveniosMedico() {
        return conveniosMedico;
    }

    public void setConveniosMedico(String conveniosMedico) {
        this.conveniosMedico = conveniosMedico;
    }
    

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

   
}