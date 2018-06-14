/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.conexaoBancoVirtualRecipe;
import br.com.virtualrecipe.business.interfaces.ConsultorioInterface;
import br.com.virtualrecipe.dominio.Consultorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

Connection con = null;
    @Override
    public Consultorio cadastrarConsultorio(Consultorio consultorio) {
        con = conexaoBancoVirtualRecipe.conexao();
        String query = ("INSERT INTO consultorio (nomeConcultorio,telefone1Cons,telefone2Cons,responsavelCons,cpfRespCons)VALUES(?,?,?,?,?)");
        try {
        PreparedStatement smtp = con.prepareStatement(query);
        smtp.setString(1, consultorio.getNomeConsultorio());
        smtp.setString(2, String.valueOf(consultorio.getTelefone1Consultorio()));
        smtp.setString(3, String.valueOf(consultorio.getTelefone2Consultorio()));
        smtp.setString(4, consultorio.getResponsavelCons());
        smtp.setString(5, String.valueOf(consultorio.getCpfRespCons()));
        
        
        smtp.executeUpdate();
        conexaoBancoVirtualRecipe.fecharConexao(con, smtp);
 
    } catch (SQLException ex) {
        Logger.getLogger(PacienteBusiness.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;

    }

   
}


