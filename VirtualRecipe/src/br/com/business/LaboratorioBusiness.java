/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.BancoDeDados;
import br.com.virtualrecipe.banco.conexaoBancoVirtualRecipe;
import br.com.virtualrecipe.business.interfaces.LaboratorioInterface;
import br.com.virtualrecipe.dominio.Laboratorio;
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
public class LaboratorioBusiness implements LaboratorioInterface {
    Connection con = null;
    @Override
    public Laboratorio cadastrarLaboratorio(Laboratorio laboratorio) {
        con = conexaoBancoVirtualRecipe.conexao();
        
       String query = ("INSERT INTO laboratorio (nomeLab,telefone1Lab,telefone2Lab,responsavelLab,cpfRespLab)VALUES(?,?,?,?,?)");
       
    try {
        PreparedStatement smtp = con.prepareStatement(query);
        smtp.setString(1, laboratorio.getNomeLab());
        smtp.setString(2, String.valueOf(laboratorio.getTelefone1Lab()));
        smtp.setString(3, String.valueOf(laboratorio.getTelefone2Lab()));
        smtp.setString(4, laboratorio.getResponsavelLab());
        smtp.setString(5, String.valueOf(laboratorio.getCpfRespLab()));
        
        
        smtp.executeUpdate();
        conexaoBancoVirtualRecipe.fecharConexao(con, smtp);
 
    } catch (SQLException ex) {
        Logger.getLogger(PacienteBusiness.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;

    }
   

    @Override
    public List<Laboratorio> buscarLaboratorioPorNome(String nome) {
        List<Laboratorio> listaDeLaboratorioEncontrados = new ArrayList<Laboratorio>();        
        
        for(int i = 0; i< BancoDeDados.laboratoriBDFake.size();i++){
            Laboratorio laboratorio = BancoDeDados.laboratoriBDFake.get(i);
            if(laboratorio.getNomeLab().startsWith(nome)){
                listaDeLaboratorioEncontrados.add(laboratorio);
            }           
        }
        return listaDeLaboratorioEncontrados;
    }


    @Override
    public List<Laboratorio> buscarLaboratorioPorTelefone(Integer telefone) {
          for (Laboratorio laboratorio: BancoDeDados.laboratoriBDFake){
            if(laboratorio.getTelefone1Lab()== telefone){
                return (List<Laboratorio>) laboratorio;
            }
        }return null;
    }

    @Override
    public List<Laboratorio> buscarTodosLaboratorios() {
        return BancoDeDados.laboratoriBDFake;
    }
    
    
}