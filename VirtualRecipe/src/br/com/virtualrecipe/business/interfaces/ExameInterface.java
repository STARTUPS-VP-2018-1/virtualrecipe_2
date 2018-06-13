/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.virtualrecipe.business.interfaces;

import br.com.virtualrecipe.dominio.PacienteExames;

/**
 *
 * @author melis_000
 */
public interface ExameInterface {
    
    public PacienteExames cadastrarExame(PacienteExames exames);
    public PacienteExames buscarExamePorCPF(PacienteExames exames);
}

