/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javito;


import model.Model;
import view.View;


public class Lampa {
    int villogas=0;
    int minőseg=100;
    int töltöttseg=100;
    
    public Lampa() {
        Model mod=new Model(villogas);
        View view=new View(villogas);
    }
    public int getVillogas() {
        return villogas;
    }

    public void setVillogas(int villogas) {
        this.villogas = villogas;
    }

    public int getMinőseg() {
        return minőseg;
    }

    public void setMinőseg(int minőseg) {
        this.minőseg = minőseg;
    }

    public int getTöltöttseg() {
        return töltöttseg;
    }

    public void setTöltöttseg(int töltöttseg) {
        this.töltöttseg = töltöttseg;
    }
     public int kapcsolas(int villogas){
        villogas++;
        if (villogas==6){
            villogas=0;
        }
        return villogas;
    }
    public int hasznalat(int minőseg, int töltöttség){
        if(villogas==0){
            
        }
    }
    
}
