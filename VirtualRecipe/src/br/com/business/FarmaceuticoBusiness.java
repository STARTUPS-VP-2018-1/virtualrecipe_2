/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.conexaoBancoVirtualRecipe;
import br.com.virtualrecipe.business.interfaces.FarmaceuticoInterface;
import br.com.virtualrecipe.dominio.Farmaceutico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melis_000
 */
public class FarmaceuticoBusiness implements FarmaceuticoInterface{
    Connection con = null;
    @Override
    public Farmaceutico cadastrarFarmaceutico(Farmaceutico farmaceutico) {
    con = conexaoBancoVirtualRecipe.conexao();
        
       String query = ("INSERT INTO farmaceutico (nomeFarmaceutico, telefoneFarm, cpfFarm, crf, emailFarm)VALUES(?,?,?,?,?)");
       
    try {
        PreparedStatement smtp = con.prepareStatement(query);
        smtp.setString(1, farmaceutico.getNomeFarmaceutico());
        smtp.setString(2, String.valueOf(farmaceutico.getTelefoneFarm()));
        smtp.setString(3, String.valueOf(farmaceutico.getCpfFarm()));
        smtp.setString(4, String.valueOf(farmaceutico.getCrf()));
        smtp.setString(5, farmaceutico.getEmailFarm());

        
        smtp.executeUpdate();
        conexaoBancoVirtualRecipe.fecharConexao(con, smtp);
 
    } catch (SQLException ex) {
        Logger.getLogger(PacienteBusiness.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }

    
    
}