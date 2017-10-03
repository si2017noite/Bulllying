/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bullying.Class;

/**
 *
 * @author Italo
 */
public class Serie {
    private int id;
    private String serie;

    public Serie() {
    }

    public Serie(int id, String serie) {
        this.id = id;
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
