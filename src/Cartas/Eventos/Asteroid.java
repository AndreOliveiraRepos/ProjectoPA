/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cartas.Eventos;

import Cartas.Carta;
import Jogo.Jogador;
import Jogo.Jogo;

/**
 *
 * @author red_f
 */
public class Asteroid extends Carta{
    
    private String year1;
    private String year2;
    public Asteroid(){
        this.year1 = "Gain 1 Wealth";
        this.year2 = "Gain 1 Wealth";
        this.setNome("Asteroid");
    }

    
    @Override
    public void doEffect(Jogo j){
        if(j.getPlayer().getTotWealth() < 5)
            j.getPlayer().setWealth(1);
        else
            j.setMensagemSistema("[SISTEMA] Armazenamento cheio");
    }
    
    
    public String getYear1(){return this.year1;}
    public String getYear2(){return this.year2;}
      
    
  

    @Override
    public String EscreveCarta() {
        String s;
        s = "Asteroid-> 1:" + this.getYear1() + " 2:" +this.getYear2();
        return s;
    }

    
    
    
}
