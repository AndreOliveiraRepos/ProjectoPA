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
public class PaO extends Carta{

    
    
    private String year1;
    private String year2;
    public PaO(){
        this.setNome("Peace and Order");
        this.year1 = "No Event";
        this.year2 = "No Event";
    }
    
    
    public String getYear1(){return this.year1;}
    public String getYear2(){return this.year2;}
    
     @Override
    public void doEffect(Jogo j){
        
        
    }


    @Override
    public String EscreveCarta() {
        String s;
        s = "Peace & Order-> 1:" + this.getYear1() + " 2:" +this.getYear2();
        return s;
    }
    
}
