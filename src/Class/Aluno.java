/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bullying.Class;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Italo
 */
public class Aluno {
    private int matricula;
    private String nome;
    private String sexo;
    private String idade;
    private int serie;

    public Aluno() {
    }

    public Aluno(int matricula, String nome, String sexo, String idade, int serie) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.serie = serie;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.matricula;
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.sexo);
        hash = 23 * hash + Objects.hashCode(this.idade);
        hash = 23 * hash + this.serie;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        if (this.serie != other.serie) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        return true;
    }

   
 public void idade(){
    Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        String Dataformata = formato.format(data);
      int parseInt = Integer.parseInt(Dataformata);
        int Data = Integer.parseInt(this.idade);
            
System.out.println(parseInt - Data);              
 }   

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
  
}
