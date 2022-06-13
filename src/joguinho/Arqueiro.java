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
public class Arqueiro extends Heroi{
    private int critico;

    public Arqueiro(String name, int atak, int defe, int sped, int vidaMaxima, int critico) {
        super(name, atak, defe, sped, vidaMaxima);
        this.critico = critico;
    }
    public int atacar(Vilao alvo) {
    int dano = (int) (this.getAtak() * (this.getSped()*0.25));

        Random rng = new Random();
        int roleta = rng.nextInt(100);
        if (roleta < this.critico) {
            dano = (int) (dano *1.5);
            System.out.println("CRITICO!!!!");
        }
        int danoFinal = alvo.receberDano(dano);
        return danoFinal;
    }
}
