/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.business.interfaces.AdminInterface;
import br.com.virtualrecipe.dominio.Admin;
import br.com.virtualrecipe.telas.MenuP;
import javax.swing.JOptionPane;

/**
 *
 * @author melis_000
 */
public class AdminBusiness implements AdminInterface {

    @Override
    public Admin entra(Admin senha) {
        MenuP mp = new MenuP();
        Admin a = new Admin();
        String aux;
        aux = JOptionPane.showInputDialog("user: admin\nSenha:");
        if (aux.equals(a.getSenha())) {
            mp.admin.setEnabled(true);
        } else if (!aux.equals(a.getSenha())) {
            JOptionPane.showMessageDialog(null, "Senha invalida");
        }
        return null;
    }

}
