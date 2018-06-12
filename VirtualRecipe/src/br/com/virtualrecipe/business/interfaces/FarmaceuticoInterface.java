/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.virtualrecipe.business.interfaces;

import br.com.virtualrecipe.dominio.Farmaceutico;
import java.util.List;

/**
 *
 * @author melis_000
 */
public interface FarmaceuticoInterface {
    
    public Farmaceutico cadastrarFarmaceutico(Farmaceutico farmaceutico);
    public Farmaceutico buscarFarmaceutico(Integer id);
    public List<Farmaceutico> buscarFarmaceuticoPorNome(String nome);
    public List<Farmaceutico> buscarTodosFarmaceuticos();
}
