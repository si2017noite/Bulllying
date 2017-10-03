/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bullying.Dao;

import Connection.GerenciadorConexao;
import bullying.Class.Login;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Italo
 */
public class DaoLogin {
    GerenciadorConexao conex = new GerenciadorConexao();
     
    public void adicionar(Login l){
     conex.Conexão();
        PreparedStatement pst;
        try {
            pst = conex.con.prepareCall("insert into login (login ,senha)values(?,?)");
                pst.setInt(1,l.getSenha());
                pst.setString(2,l.getLogin());           
                pst.execute();
         JOptionPane.showMessageDialog(null,"Feito com sucesso!");         
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Ocorreu algum erro!" + ex);
        }
        conex.Desconexão();
        
    }
    public void remover(Login l){
       conex.Conexão();
        PreparedStatement pst;
        
        try {
            pst = conex.con.prepareStatement("DELETE FROM login WHERE senha ");
          
              pst.setInt(1, l.getSenha());
              pst.execute();
               } catch (SQLException ex) {
            Logger.getLogger(DaoSerie.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    public void alterar(Login l){
    conex.Conexão();
        PreparedStatement pst;
            
        try {
            pst = conex.con.prepareStatement("UPDATE senha=? WHERE senha=?");
        
                  pst.setInt(1,l.getSenha());
              pst.setInt(2,l.getSenha());
              pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoSerie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
