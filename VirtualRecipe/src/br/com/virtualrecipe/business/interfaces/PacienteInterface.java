/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.virtualrecipe.business.interfaces;

import br.com.virtualrecipe.dominio.Paciente;
import br.com.virtualrecipe.dominio.PacienteExames;
import br.com.virtualrecipe.dominio.PacienteReceitas;
import java.util.List;


/**
 *
 * @author melis_000
 */
public interface PacienteInterface {
    public Paciente cadastrarPaciente(Paciente paciente);
    public Paciente buscaPaciente(Integer id);
    public List<Paciente> buscarPacientePorNome(String nome);
    public List<Paciente> buscarTodosPacientes();
    public List<PacienteReceitas> buscarReceitaPaciente(Integer id);
    public List<PacienteExames> buscarExamePaciente(Integer id);
}
