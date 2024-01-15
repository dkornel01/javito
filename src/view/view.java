/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author dobrocsi.kornel
 */
public class view {
    int villogas=0;
    public view() {
        
    }

    public int getVillogas() {
        return villogas;
    }

    public void setVillogas(int villogas) {
        this.villogas = villogas;
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
    public void kapcsolas(){
        villogas++;
        if (villogas==6){
            villogas=0;
        }
    }
}
