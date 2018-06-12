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
public class PacienteExames {
    private Integer idExame;
    private Integer crmExame;
    private Integer cpfExame;
    private String nomeExame;
    private String nomePacienteExame;
    private String exame;

    public Integer getCrmExame() {
        return crmExame;
    }

    public void setCrmExame(Integer crmExame) {
        this.crmExame = crmExame;
    }

    public Integer getCpfExame() {
        return cpfExame;
    }

    public void setCpfExame(Integer cpfExame) {
        this.cpfExame = cpfExame;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public String getNomePacienteExame() {
        return nomePacienteExame;
    }

    public void setNomePacienteExame(String nomePacienteExame) {
        this.nomePacienteExame = nomePacienteExame;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public Integer getIdExame() {
        return idExame;
    }

    public void setIdExame(Integer idExame) {
        this.idExame = idExame;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.idExame);
        hash = 43 * hash + Objects.hashCode(this.crmExame);
        hash = 43 * hash + Objects.hashCode(this.cpfExame);
        hash = 43 * hash + Objects.hashCode(this.nomeExame);
        hash = 43 * hash + Objects.hashCode(this.nomePacienteExame);
        hash = 43 * hash + Objects.hashCode(this.exame);
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
        final PacienteExames other = (PacienteExames) obj;
        if (!Objects.equals(this.nomeExame, other.nomeExame)) {
            return false;
        }
        if (!Objects.equals(this.nomePacienteExame, other.nomePacienteExame)) {
            return false;
        }
        if (!Objects.equals(this.exame, other.exame)) {
            return false;
        }
        if (!Objects.equals(this.idExame, other.idExame)) {
            return false;
        }
        if (!Objects.equals(this.crmExame, other.crmExame)) {
            return false;
        }
        if (!Objects.equals(this.cpfExame, other.cpfExame)) {
            return false;
        }
        return true;
    }

    
    
}
