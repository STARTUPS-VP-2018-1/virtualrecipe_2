/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.BancoDeDados;
import br.com.virtualrecipe.business.interfaces.ExameInterface;
import br.com.virtualrecipe.dominio.PacienteExames;

/**
 *
 * @author melis_000
 */
public class ExameBusiness implements ExameInterface{

    @Override
    public PacienteExames cadastrarExame(PacienteExames exames) {
        BancoDeDados.pacienteExamesBDFake.add(exames);
        return exames;
            
    }
    
}
