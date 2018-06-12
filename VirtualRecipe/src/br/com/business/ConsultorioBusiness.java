/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.BancoDeDados;
import br.com.virtualrecipe.business.interfaces.ConsultorioInterface;
import br.com.virtualrecipe.dominio.Consultorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melis_000
 */
public class ConsultorioBusiness implements ConsultorioInterface {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    @Override
    public Consultorio cadastrarConsultorio(Consultorio consultorio) {
        BancoDeDados.consultorioBDFake.add(consultorio);
        return consultorio;
    }

   

    @Override
    public List<Consultorio> buscarConsultorioPorNome(String nome) {
    List<Consultorio> listaDeConsultorioEncontrados = new ArrayList<Consultorio>();        
        
        for(int i = 0; i< BancoDeDados.consultorioBDFake.size();i++){
            Consultorio consultorio = BancoDeDados.consultorioBDFake.get(i);
            if(consultorio.getNomeConsultorio().startsWith(nome)){
                listaDeConsultorioEncontrados.add(consultorio);
            }           
        }
        return listaDeConsultorioEncontrados;
    }

    @Override
    public List<Consultorio> buscarConsultorioPorTelefone(Integer telefone1) {
         for (Consultorio consultorio: BancoDeDados.consultorioBDFake){
            if(consultorio.getTelefone1Consultorio()== telefone1){
                return (List<Consultorio>) consultorio;
            }
        }return null;
    }

    @Override
    public List<Consultorio> buscarTodosConsultorios() {
     return BancoDeDados.consultorioBDFake;
    }

}


