/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estado;
import Jogo.*;

import Cartas.*;
import Technologies.Technology;
import java.util.ArrayList;



/**
 *
 * @author red_f
 */
public interface IEstado {
    IEstado DrawClose();
    IEstado DrawDistant();
    IEstado Conquer(int v);
    IEstado Pass();
    IEstado Research(int x, int y);
    IEstado BuildRecruit();
    IEstado DrawEvent();  
    IEstado Commerce(int v);
    IEstado Begin();
    IEstado End();
}

