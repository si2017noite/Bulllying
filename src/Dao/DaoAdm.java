package bullying.Dao;

import Connection.GerenciadorConexao;
import bullying.Class.Adm;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Italo
 */
public class DaoAdm {
    GerenciadorConexao conex = new GerenciadorConexao(); 
    
    public void adicionar( Adm adm){
    conex.Conexão();
        PreparedStatement pst;
        try {
            pst = conex.con.prepareCall("insert into adm (adm_id,adm_nome,adm_profissao)values(?,?,?)");
                pst.setInt(1,adm.getMatricula());
                pst.setString(2, adm.getNome());
                pst.setString(3, adm.getProfissao());
               
                pst.execute();
         JOptionPane.showMessageDialog(null,"Feito com sucesso!");         
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Ocorreu algum erro!" + ex);
        }
        conex.Desconexão();
    }
    public void remover(Adm adm){
         conex.Conexão();
        PreparedStatement pst;
        
        try {
            pst = conex.con.prepareStatement("DELETE FROM adm WHERE adm_id");
          
              pst.setInt(1, adm.getMatricula());
              pst.execute();
               } catch (SQLException ex) {
            Logger.getLogger(DaoSerie.class.getName()).log(Level.SEVERE, null, ex);
               }
    }
      
   
}
