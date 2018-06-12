/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.BancoDeDados;
import br.com.virtualrecipe.business.interfaces.ReceitaInterface;
import br.com.virtualrecipe.dominio.PacienteReceitas;

/**
 *
 * @author melis_000
 */
public class ReceitaBusiness implements ReceitaInterface {

    @Override
    public PacienteReceitas cadastrarReceita(PacienteReceitas receita) {
        BancoDeDados.pacienteReceitasBDFake.add(receita);
        return receita;
            
    }

   
}

    
    
    
