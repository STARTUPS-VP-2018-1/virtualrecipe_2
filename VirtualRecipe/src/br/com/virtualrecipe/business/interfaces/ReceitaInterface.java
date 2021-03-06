/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.virtualrecipe.business.interfaces;

import br.com.virtualrecipe.dominio.PacienteReceitas;
import br.com.virtualrecipe.telas.ConsultaReceitasTela;

/**
 *
 * @author melis_000
 */
public interface ReceitaInterface{
    public PacienteReceitas cadastrarReceita(PacienteReceitas receita);
    public PacienteReceitas buscarRecitaPorCPF(PacienteReceitas receita,ConsultaReceitasTela tela);
    public boolean  validarCpf(String cpf);
    
}
