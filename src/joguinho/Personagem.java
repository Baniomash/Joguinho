/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joguinho;

import java.util.Random;

/**
 *
 * @author 20201038060005
 */
public abstract class Personagem <T extends Personagem> {
    private String name;
    private int atak;
    private int defe;
    private int sped;
    private int vidaMaxima;
    private int vidaAtual;

    public Personagem(String name, int atak, int defe, int sped, int vidaMaxima) {
        this.name = name;
        this.atak = atak;
        this.defe = defe;
        this.sped = sped;
        this.vidaAtual = vidaMaxima;
        this.vidaMaxima = vidaMaxima;
    }
    
    public boolean estaVivo(){
        return this.getVidaAtual() > 0;
    }
    
    public abstract int atacar(T alvo);
    public abstract int receberDano(int dano);
    
    public String status() {
        String saida = "";
        saida += "Nome: " + this.name;
        saida += ": " + this.vidaAtual + "/" +
                this.vidaMaxima;
        return saida;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtak() {
        return atak;
    }

    public void setAtak(int atak) {
        this.atak = atak;
    }

    public int getDefe() {
        return defe;
    }
    
    public void setDefe(int defe) {
        this.defe = defe;
    }
    
    public int getSped() {
        return sped;
    }
    
    public void setSped(int sped) {
        this.sped = sped;
    }
    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        if (vidaAtual < 0){
            this.vidaAtual = 0;
        } else {
            this.vidaAtual = vidaAtual;
        }
    }
    
    public int spdDisputa(Personagem alvo){
        Random rng = new Random();
        int difSped = this.sped-alvo.getSped();
        if(((difSped-alvo.getSped())*-1) >= (rng.nextInt(100))){
//        int difSped = (this.sped + rng.nextInt(100))-alvo.getSped();
//        if(difSped < (alvo.getSped()+rng.nextInt(20))){
            return 0;
        }else{
            if(difSped<1){
                return ((difSped%10)*-1)+rng.nextInt(7);
            }else{
                return difSped%10+rng.nextInt(7);
            }
        }
//        int totalThisSpd = (rng.nextInt(20))+this.sped;
//        int totalAlvoSpd = (rng.nextInt(10))+alvo.getSped();
//        return totalThisSpd - totalAlvoSpd;
    }
    
}
