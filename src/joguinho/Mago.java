/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joguinho;

/**
 *
 * @author 20201038060005
 */
public class Mago extends Heroi{
    private int inte;
    private int manaAtual;
    private int manaMaxima;

    public Mago(String name, int atak, int defe, int sped, int vidaMaxima, int inte, int manaMaxima) {
        super(name, atak, defe, sped, vidaMaxima);
        this.inte = inte;
        this.manaAtual = manaMaxima;
        this.manaMaxima = manaMaxima;
    }
    
    public int atacar(Vilao alvo) {
        int dano = this.inte * 2;
            if ((this.manaAtual - 35)>0){
                return 0;
            } else {
                this.manaAtual = this.manaAtual - 35;
                if(this.manaAtual < 0){
                    this.manaAtual = 0;
                }
                int danoFinal = alvo.receberDano(dano);
                return danoFinal;
            }
            
    }
    
    public int receberDano(int dano) {
        int danoFinal = (int) ((dano * 1.2) - this.getDefe());
        if (danoFinal < 0){
            this.setVidaAtual(this.getVidaAtual()- 1);
            return danoFinal;
        } else {
            this.setVidaAtual(this.getVidaAtual()-danoFinal);
            return danoFinal;
        }
    }
    
}
