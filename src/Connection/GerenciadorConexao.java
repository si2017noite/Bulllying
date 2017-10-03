
package Connection;

/**
 *
 * @author Italo
 */
import java.beans.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GerenciadorConexao {
   public Statement smt; // para efetuar pesquisas
   public ResultSet rst; // para guardar o resultado das pesquisas
   private String driver ="org.mysql.driver" ;
   private String caminho ="jdbc:mysql://localhost:3306/teste";
   private String usuario ="root";
   private String senha ="1234";
   public Connection con; // para realizar conexão
   
   public void Conexão(){
   
       try {
          System.setProperty("jdbc.drivers", driver);//setar a propriedade do driver se conexão
           con =DriverManager.getConnection(caminho, usuario, senha);
           JOptionPane.showMessageDialog(null,"Conexão efetuada!!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Conexão não efetuada Erro: \n"+ ex);
       }
   
   
             
}
   
   public void Desconexão(){
       try {
           con.close();
       JOptionPane.showMessageDialog(null,"Desligado com sucesso!");
       }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro:"+ ex);
       }
}
}