/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javito;


public class Lampa {
    int villogas=0;
    int minoseg=100;
    int toltottseg=100;
    
    public Lampa() {
        
    }
    public int getVillogas() {
        return villogas;
    }

    public void setVillogas(int villogas) {
        this.villogas = villogas;
    }

    public int getMinoseg() {
        return minoseg;
    }

    public void setMinoseg(int minoseg) {
        this.minoseg = minoseg;
    }

    public int getToltottseg() {
        return toltottseg;
    }

    public void setToltottseg(int toltottseg) {
        this.toltottseg = toltottseg;
    }
     public void kapcsolas(){
        if (toltottseg>0 && minoseg>0){
            villogas++;
            if (villogas==6){
                villogas=0;
            }
        }

    }
    public void hasznalat(){
        if(villogas==0){
            toltottseg=toltottseg-1;
        }
        else {
            if (toltottseg>3){
                if (minoseg>3){
                toltottseg=toltottseg-5;
                minoseg=minoseg-3;
                }
                else{
                System.out.println("javitani kell");
                minoseg=0;
                }
            }
            else {
            System.out.println("lemerult");
            toltottseg=0;
            }
        }
    }
    public void elemcsere(){
        toltottseg=100;
    }
    public void javitas(){
        minoseg=100;
    }
    
    public void kiiras(){
        if (villogas==0){
            System.out.println("nem világit");
        }
        else if (villogas==1){
            System.out.println("világit");
        }
        else if (villogas==2){
            System.out.println("lassan villog");
        }
        else if (villogas==3){
            System.out.println("közepesesn villog");
        }
        else if (villogas==4){
            System.out.println("gyorsan villog");
        }
        else if (villogas==5){
            System.out.println("folyamatosan villog");
        }
    }

    @Override
    public String toString() {
        return "Lampa{" + "villogas=" + villogas + ", minoseg=" + minoseg + ", toltottseg=" + toltottseg + '}';
    }
}
