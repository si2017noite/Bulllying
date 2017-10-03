
package bullying.Dao;

import Connection.GerenciadorConexao;
import bullying.Class.Aluno;
import bullying.Class.Serie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Italo
 */
public class DaoSerie {
    GerenciadorConexao conex = new GerenciadorConexao();
    Serie s = new Serie();
     Aluno A = new Aluno();
     
    public void adicionar(Serie s){
     conex.Conexão();
        PreparedStatement pst;
        try {
            pst = conex.con.prepareCall("insert into serie(serie_id, serie)values(?,?)");
                pst.setInt(1,s.getId());
                pst.setString(2, A.getIdade());
                pst.execute();
         JOptionPane.showMessageDialog(null,"Feito com sucesso!");         
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Ocorreu algum erro!" + ex);
        }
        conex.Desconexão();
    }
    
    public void alterar(Serie s){
        
    conex.Conexão();
        PreparedStatement pst;
        
     
        try {
            pst = conex.con.prepareStatement("UPDATE serir SET serie'?' WHERE serie_id ");
        
                  pst.setInt(2, s.getId());
              pst.setString(1,s.getSerie());
              pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoSerie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void remover(Serie s){
    
    conex.Conexão();
        PreparedStatement pst;
        
        try {
            pst = conex.con.prepareStatement("DELETE FROM serie WHERE Serie_id=? ");
          
              pst.setString(1, s.getSerie());
              pst.execute();
               } catch (SQLException ex) {
            Logger.getLogger(DaoSerie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
public Aluno ListarPorSerie(Aluno A){
 
    conex.Conexão();
        PreparedStatement pst;
        try {
     
         pst = conex.con.prepareStatement("select * from aluno a join serie s on s.serie_id = a.aluno_serie where serie = '?' ");
     
              pst.setString(1, s.getSerie());
              ResultSet rs = pst.executeQuery();
    while(rs.next()){
        A.setMatricula(rs.getInt("aluno_id"));
        A.setNome(rs.getString("aluno_nome"));
        A.setSexo(rs.getString("aluno_sexo"));
        A.setIdade(rs.getString("aluno_data"));
        A.setSerie(rs.getInt("aluno_serie"));
    }
            conex.Desconexão();
            return A;
        }catch (SQLException ex) {
         Logger.getLogger(DaoAluno.class.getName()).log(Level.SEVERE, null, ex);
     }
        return null;
}
}
