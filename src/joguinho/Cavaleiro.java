/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joguinho;

/**
 *
 * @author 20201038060005
 */
public class Cavaleiro extends Heroi{
    private double armor;

    public Cavaleiro(String name, int atak, int defe, int sped, int vidaMaxima, double armor) {
        super(name, atak, defe, sped, vidaMaxima);
        this.armor = armor;
    }
    public int receberDano(int dano){
        int danoFinal = (int) (dano * (1 - this.armor)) - this.getDefe();
        if (danoFinal < 0){
            this.setVidaAtual(this.getVidaAtual()- 1);
            return danoFinal;
        } else {
            this.setVidaAtual(this.getVidaAtual()-danoFinal);
            return danoFinal;
        }
    }
    
    public String getSpriteIdle(){
        return "/sprites/hero_sprites_01.png";
    }
    public String getSpriteRendido() {
        return "/sprites/hero_sprites_08.png";
    }
    public String getSpriteDerrubado() {
        return "/sprites/hero_sprites_06.png";
    }
    public String getSpriteVitoria() {
        return "/sprites/hero_sprites_09.png";
    }

}
