/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.BancoDeDados;
import br.com.virtualrecipe.banco.conexaoBancoVirtualRecipe;
import br.com.virtualrecipe.business.interfaces.ExameInterface;
import br.com.virtualrecipe.dominio.PacienteExames;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melis_000
 */
public class ExameBusiness implements ExameInterface{
    Connection con = null;
    @Override
    public PacienteExames cadastrarExame(PacienteExames exames) {
        con = conexaoBancoVirtualRecipe.conexao();
        
       String query = ("INSERT INTO exame (crmEx,cpfEx,nomePaEx,nomeMeEx,descEx)VALUES(?,?,?,?,?,?)");
       
    try {
        PreparedStatement smtp = con.prepareStatement(query);
        smtp.setString(1, String.valueOf(exames.getCrmExame()));
        smtp.setString(2, String.valueOf(exames.getCpfExame()));
        smtp.setString(3, exames.getNomePacienteExame());
        smtp.setString(4, exames.getNomeExame());
        smtp.setString(5, exames.getExame());
        
        smtp.executeUpdate();
        conexaoBancoVirtualRecipe.fecharConexao(con, smtp);
 
    } catch (SQLException ex) {
        Logger.getLogger(PacienteBusiness.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
            
    }
    
}
