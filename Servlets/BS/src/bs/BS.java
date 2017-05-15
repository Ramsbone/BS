/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bs;

import battleship.interfaces.BattleshipsPlayer;
import tournament.player.PlayerFactory;

/**
 *
 * @author GertLehmann
 */
public class BS implements PlayerFactory<BattleshipsPlayer> {

    public BS(){}


    @Override
    public BattleshipsPlayer getNewInstance() {
        return new MyShooter();
    }

    @Override
    public String getID() {
        return "G04";   
    }

    @Override
    public String getName() {
        return "Perfect BS Shooter";
    }

    @Override
    public String[] getAuthors() {
        return new String[] {"Lene","Christian","Gert"};
    }
    
}
