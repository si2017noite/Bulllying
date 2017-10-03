package bullying.Dao;

import Connection.GerenciadorConexao;
import bullying.Class.Aluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
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
public class DaoAluno {
    GerenciadorConexao conex = new GerenciadorConexao();
    Aluno A = new Aluno();
    
    public void adicionar(Aluno A){
    conex.Conexão();
        PreparedStatement pst;
        try {
            pst = conex.con.prepareCall("insert into aluno(aluno_id,aluno_nome, aluno_sexo,aluno_data,aluno_serie)values(?,?,?,?,?)");
                pst.setInt(1,A.getMatricula());
                pst.setString(2, A.getNome());
                pst.setString(3, A.getSexo());
                pst.setString(4,A.getIdade());
                pst.setInt(5,A.getSerie());
                pst.execute();
         JOptionPane.showMessageDialog(null,"Feito com sucesso!");         
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Ocorreu algum erro!" + ex);
        }
        conex.Desconexão();
    }
    public void remover(Aluno A){
            conex.Conexão();
        PreparedStatement pst;
        
        try {
            pst = conex.con.prepareStatement("DELETE FROM serie WHERE aluno_matricula=? ");
          
              pst.setInt(1, A.getMatricula());
              pst.execute();
               } catch (SQLException ex) {
            Logger.getLogger(DaoSerie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void alterar(Aluno A){
    conex.Conexão();
        PreparedStatement pst;
        
     
        try {
            pst = conex.con.prepareStatement("UPDATE aluno_nome=?, aluno_sexo=?,aluno_serie=? WHERE aluno_id=?");
        
                  pst.setString(1,A.getNome());
              pst.setString(2,A.getSexo());
              pst.setInt(3,A.getSerie());
              pst.setInt(4,A.getMatricula());
              pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoSerie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList<Aluno> listar(){
          conex.Conexão();
        ArrayList<Aluno> Alunos =  new ArrayList<>();
   PreparedStatement pst;
       try{
            pst = conex.con.prepareStatement("select* from aluno");
         ResultSet rs = pst.executeQuery();
    while(rs.next()){
        
        A.setMatricula(rs.getInt("aluno_id"));
        A.setNome(rs.getString("aluno_nome"));
        A.setSexo(rs.getString("aluno_sexo"));
        A.setIdade(rs.getString("aluno_data"));
        A.setSerie(rs.getInt("aluno_serie"));
        
        Alunos.add(A);
         return Alunos;
    }
           
    } catch (SQLException ex) {
            Logger.getLogger(DaoAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
              conex.Desconexão();
 return  null;
 
    }
public Aluno ListarPorMatricula(Aluno A){
 conex.Conexão();
        PreparedStatement pst;
        try {
     
         pst = conex.con.prepareStatement("select* from aluno where aluno_id =?");
     
              pst.setInt(1, A.getMatricula());
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
public Aluno ListarPorNome(Aluno A){
 conex.Conexão();
        PreparedStatement pst;
        try {
pst = conex.con.prepareStatement("select* from aluno where aluno_nome  like '%i%'");
     
              pst.setString(1, A.getNome());
              ResultSet rs = pst.executeQuery();
    while(rs.next()){
        A.setMatricula(rs.getInt("aluno_id"));
        A.setNome(rs.getString("aluno_nome"));
        A.setSexo(rs.getString("aluno_sexo"));
        A.setIdade(rs.getString("aluno_data"));
        }
            conex.Desconexão();
            return A;
        }catch (SQLException ex) {
         Logger.getLogger(DaoAluno.class.getName()).log(Level.SEVERE, null, ex);
     }
    return null;    
}    
}

        
    

