/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;


import br.com.virtualrecipe.banco.conexaoBancoVirtualRecipe;
import br.com.virtualrecipe.business.interfaces.PacienteInterface;
import br.com.virtualrecipe.dominio.Paciente;
import br.com.virtualrecipe.dominio.PacienteExames;
import br.com.virtualrecipe.dominio.PacienteReceitas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melis_000
 */
public class PacienteBusiness implements PacienteInterface {
    Connection con = null;
    
    
    public Paciente cadastrarPaciente(Paciente paciente) {
        con = conexaoBancoVirtualRecipe.conexao();
        
       String query = ("INSERT INTO paciente (nomePaciente, dataNascimento,genero,cpf,telefone,user,senha)VALUES(?,?,?,?,?,?,?)");
       
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
    return null;
    }
    /*
    
    @Override
    public Paciente buscaPaciente(Integer cpf) {
    for (Paciente paciente: BancoDeDados.pacienteBDFake){
    if(paciente.getCpf() == cpf){
    return paciente;
    }
    }return null;
    }
    
    @Override
    public List<Paciente> buscarPacientePorNome(String nome) {
    List<Paciente> listaDePacienteEncontrados = new ArrayList<Paciente>();
    
    for(int i = 0; i< BancoDeDados.pacienteBDFake.size();i++){
    Paciente paciente = BancoDeDados.pacienteBDFake.get(i);
    if(paciente.getNomePaciente().startsWith(nome)){
    listaDePacienteEncontrados.add(paciente);
    }
    }
    return listaDePacienteEncontrados;
    }
    
    @Override
    public List<Paciente> buscarTodosPacientes() {
    return BancoDeDados.pacienteBDFake;
    }
    
    @Override
    public List<PacienteReceitas> buscarReceitaPaciente(Integer id) {
    for (PacienteReceitas receita: BancoDeDados.pacienteReceitasBDFake){
    if (if(paciente.getCpf() == cpf){
    if(receita.getIdReceita() == id){
    return receita;
    }
    }
    
    }return null;
    }
    
    @Override
    public List<PacienteExames> buscarExamePaciente(Integer id) {
    for (PacienteExames exame: BancoDeDados.pacienteExamesBDFake){
    if(exame.getIdExame() == id){
    return exame;
    }
    }return null;
    }*/

    @Override
    public Paciente buscaPaciente(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paciente> buscarPacientePorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paciente> buscarTodosPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PacienteReceitas> buscarReceitaPaciente(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PacienteExames> buscarExamePaciente(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
