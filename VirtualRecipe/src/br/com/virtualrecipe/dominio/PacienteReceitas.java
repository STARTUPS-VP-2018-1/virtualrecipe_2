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
public class PacienteReceitas {
    private Integer idReceita;
    private Integer crmReceita;
    private Integer cpfReceita;
    private String nomeMedicoReceita;
    private String nomePacienteReceita;
    private String receita;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idReceita);
        hash = 59 * hash + Objects.hashCode(this.crmReceita);
        hash = 59 * hash + Objects.hashCode(this.cpfReceita);
        hash = 59 * hash + Objects.hashCode(this.nomeMedicoReceita);
        hash = 59 * hash + Objects.hashCode(this.nomePacienteReceita);
        hash = 59 * hash + Objects.hashCode(this.receita);
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
        final PacienteReceitas other = (PacienteReceitas) obj;
        if (!Objects.equals(this.nomeMedicoReceita, other.nomeMedicoReceita)) {
            return false;
        }
        if (!Objects.equals(this.nomePacienteReceita, other.nomePacienteReceita)) {
            return false;
        }
        if (!Objects.equals(this.receita, other.receita)) {
            return false;
        }
        if (!Objects.equals(this.idReceita, other.idReceita)) {
            return false;
        }
        if (!Objects.equals(this.crmReceita, other.crmReceita)) {
            return false;
        }
        if (!Objects.equals(this.cpfReceita, other.cpfReceita)) {
            return false;
        }
        return true;
    }

    public Integer getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(Integer idReceita) {
        this.idReceita = idReceita;
    }

    public Integer getCrmReceita() {
        return crmReceita;
    }

    public void setCrmReceita(Integer crmReceita) {
        this.crmReceita = crmReceita;
    }

    public Integer getCpfReceita() {
        return cpfReceita;
    }

    public void setCpfReceita(Integer cpfReceita) {
        this.cpfReceita = cpfReceita;
    }

    public String getNomeMedicoReceita() {
        return nomeMedicoReceita;
    }

    public void setNomeMedicoReceita(String nomeMedicoReceita) {
        this.nomeMedicoReceita = nomeMedicoReceita;
    }

    public String getNomePacienteReceita() {
        return nomePacienteReceita;
    }

    public void setNomePacienteReceita(String nomePacienteReceita) {
        this.nomePacienteReceita = nomePacienteReceita;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

   
        
}
