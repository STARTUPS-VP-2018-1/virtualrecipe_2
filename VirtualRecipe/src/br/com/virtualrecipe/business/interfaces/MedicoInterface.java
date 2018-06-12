/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.virtualrecipe.business.interfaces;

import br.com.virtualrecipe.dominio.Medico;
import java.util.List;




/**
 *
 * @author melis_000
 */
public interface MedicoInterface {
    public Medico cadastrarMedico(Medico medico);
    public Medico buscarMedico(Integer id);
    public List<Medico> buscarFarmaceuticoPorNome(String nome);
    public List<Medico> buscarTodosMedicos();
    
}
