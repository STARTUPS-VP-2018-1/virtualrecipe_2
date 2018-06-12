/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.BancoDeDados;
import br.com.virtualrecipe.banco.conexaoBancoVirtualRecipe;
import br.com.virtualrecipe.business.interfaces.MedicoInterface;
import br.com.virtualrecipe.dominio.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melis_000
 */
public class MedicoBusiness implements MedicoInterface {
        Connection con = null;

    @Override
    public Medico cadastrarMedico(Medico medico) {
     con = conexaoBancoVirtualRecipe.conexao();
        
       String query = ("INSERT INTO medico (nomeMedico, telefone1Med,telefone2Med,rgMed,cpfMed,crm,especializacao,conveniosAceitos)VALUES(?,?,?,?,?,?,?)");
       
    try {
        PreparedStatement smtp = con.prepareStatement(query);
        smtp.setString(1, medico.getNomeMedico());
        smtp.setString(2, String.valueOf(medico.getTelResMedico()));
        smtp.setString(3, String.valueOf(medico.getTelCelMedico()));
        smtp.setString(4, String.valueOf(medico.getRgMedico()));
        smtp.setString(5, String.valueOf(medico.getCpfMedico()));
        smtp.setString(6, medico.getEspecializacaoMedico());
        smtp.setString(7, medico.getEspecializacaoMedico());
        
        smtp.executeUpdate();
        conexaoBancoVirtualRecipe.fecharConexao(con, smtp);
 
    } catch (SQLException ex) {
        Logger.getLogger(PacienteBusiness.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }

    @Override
    public Medico buscarMedico(Integer crm) {
        for (Medico medico: BancoDeDados.medicoBDFake){
            if(medico.getCrm() == crm){
                return medico;
            }
        }return null;
    }

    @Override
    public List<Medico> buscarFarmaceuticoPorNome(String nome) {
        List<Medico> listaDeMedicoEncontrados = new ArrayList<Medico>();        
        
        for(int i = 0; i< BancoDeDados.medicoBDFake.size();i++){
            Medico medico = BancoDeDados.medicoBDFake.get(i);
            if(medico.getNomeMedico().startsWith(nome)){
                listaDeMedicoEncontrados.add(medico);
            }           
        }
        return listaDeMedicoEncontrados;
    }

    @Override
    public List<Medico> buscarTodosMedicos() {
        return BancoDeDados.medicoBDFake;
    }
  
        
}
