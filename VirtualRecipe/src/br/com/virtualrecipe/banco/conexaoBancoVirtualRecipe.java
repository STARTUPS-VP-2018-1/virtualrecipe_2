/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.virtualrecipe.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author melis_000
 */
public class conexaoBancoVirtualRecipe {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://127.0.0.1/virtualrecipe?useTimezone=true&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASS = "root";
    
    public static Connection conexao (){
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL,USER,PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Erro para conexao no banco", ex);
        }
    
    }
    
    public static void fecharConexao(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Erro na classe do con");
            }
        }
    }
    public static void fecharConexao(Connection con,PreparedStatement stmp){
        if(stmp!=null){
            try {
                stmp.close();
            } catch (SQLException ex) {
                System.out.println("Erro na classe do stmp");
            }
        }
    }
    public static void fecharfecharConexao(Connection con,PreparedStatement stmp, ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Erro na classe do rs");
            }
        }
    }
}
