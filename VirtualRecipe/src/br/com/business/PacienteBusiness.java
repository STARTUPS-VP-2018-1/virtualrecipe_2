/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;


import br.com.virtualrecipe.banco.conexaoBancoVirtualRecipe;
import br.com.virtualrecipe.business.interfaces.PacienteInterface;
import br.com.virtualrecipe.business.interfaces.ReceitaInterface;
import br.com.virtualrecipe.dominio.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author melis_000
 */
public class PacienteBusiness implements PacienteInterface {
    Connection con = null;
    
    
    @Override
    public Paciente cadastrarPaciente(Paciente paciente) {
        con = conexaoBancoVirtualRecipe.conexao();
        ReceitaInterface validarcpf= new ReceitaBusiness();
        
        if(validarcpf.validarCpf(String.valueOf(paciente.getCpf()))){
           String query = ("insert INTO paciente (nomePaciente, dataNascimento,genero,cpf,telefone,user,senha)VALUES(?,?,?,?,?,?,?)");
       
        try {
            PreparedStatement smtp = con.prepareStatement(query);
            smtp.setString(1, paciente.getNomePaciente());
            smtp.setString(2, paciente.getDataDeNascimento());
            smtp.setString(3, paciente.getGenero());
            smtp.setString(4, String.valueOf(paciente.getCpf()));
            smtp.setString(5, String.valueOf(paciente.getTelefone()));
            smtp.setString(6, paciente.getUser());
            smtp.setString(7, paciente.getSenha());

            smtp.executeUpdate();
            conexaoBancoVirtualRecipe.fecharConexao(con, smtp);

        } catch (SQLException ex) {
            Logger.getLogger(PacienteBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }      
        }else{
            JOptionPane.showMessageDialog(null,"Usuario não cadastrado");
    }
    return null;
    }

    @Override
    public Paciente buscaPaciente(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
