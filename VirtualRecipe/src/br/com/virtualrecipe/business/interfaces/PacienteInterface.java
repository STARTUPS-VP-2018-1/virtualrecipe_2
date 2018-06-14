/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.virtualrecipe.business.interfaces;

import br.com.virtualrecipe.dominio.Paciente;


/**
 *
 * @author melis_000
 */
public interface PacienteInterface {
    public Paciente cadastrarPaciente(Paciente paciente);
    public Paciente buscaPaciente(Integer id);
    
}
