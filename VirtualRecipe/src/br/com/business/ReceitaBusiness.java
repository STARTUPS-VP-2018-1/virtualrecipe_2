/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.conexaoBancoVirtualRecipe;
import br.com.virtualrecipe.business.interfaces.ReceitaInterface;
import br.com.virtualrecipe.dominio.PacienteReceitas;
import br.com.virtualrecipe.telas.ConsultaReceitasTela;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author melis_000
 */
public class ReceitaBusiness implements ReceitaInterface {

    Connection con;
    PreparedStatement smtp;

    @Override
    public PacienteReceitas cadastrarReceita(PacienteReceitas receita) {

        con = conexaoBancoVirtualRecipe.conexao();

        String query = ("INSERT INTO receita (crmRe,cpfRe,nomePaRe,nomeMeRe,descRe)VALUES(?,?,?,?,?)");

        try {
            PreparedStatement smtp = con.prepareStatement(query);
            smtp.setString(1, String.valueOf(receita.getCrmReceita()));
            smtp.setString(2, String.valueOf(receita.getCpfReceita()));
            smtp.setString(3, receita.getNomePacienteReceita());
            smtp.setString(4, receita.getNomeMedicoReceita());
            smtp.setString(5, receita.getReceita());

            smtp.executeUpdate();
            conexaoBancoVirtualRecipe.fecharConexao(con, smtp);

        } catch (SQLException ex) {
            Logger.getLogger(PacienteBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    public PacienteReceitas buscarRecitaPorCPF(PacienteReceitas receita, ConsultaReceitasTela tela) {
        Connection conn = null;
        PreparedStatement cmd = null;
        ResultSet rs = null;

        conn = conexaoBancoVirtualRecipe.conexao();

        try {
            String query = "SELECT idReceita,nomePaRe,nomeMeRe,descRe FROM receita WHERE cpfRe = ?";
            cmd = conn.prepareStatement(query);
            cmd.setInt(1, receita.getCpfReceita());

            rs = cmd.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tela.jTable1.getModel();
            model.setNumRows(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("idReceita"),
                    rs.getString("nomePaRe"),
                    rs.getString("nomeMeRe"),
                    rs.getString("descRe")
                });
            }
            conexaoBancoVirtualRecipe.fecharfecharConexao(conn, cmd, rs);

        } catch (SQLException ex) {
            Logger.getLogger(ReceitaBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public boolean validarCpf(String cpf) {
        Connection conn = null;
        PreparedStatement cmd = null;
        ResultSet rs = null;
        
        boolean check = false;
        
        conn = conexaoBancoVirtualRecipe.conexao();

        try {
            String query = "select cpfRe from receita where cpfRe = ? group by cpfRe";
            
            cmd = conn.prepareStatement(query);
            cmd.setString(1, String.valueOf(cpf));

            rs = cmd.executeQuery();
            
            while(rs.next()){
                check = true;
            }
            
            conexaoBancoVirtualRecipe.fecharfecharConexao(conn, cmd, rs);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ReceitaBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }

        return check;
    }

}
