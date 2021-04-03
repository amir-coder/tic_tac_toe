package com.tic_tac_toe_log;

import com.tic_tac_toe_log.*;

import java.util.HashMap;


public class Main {
    public static HashMap<Integer, Character> symbols = new HashMap<Integer, Character> ();
    public static void main(String[] args) {
        Main.symbols.put(0,'N');
        Main.symbols.put(1,'X');
        Main.symbols.put(2,'O');
        Game myGame = new Game();
        myGame.showGameState();
    }
}


class Game{

    private int[][] winningTemplate = {{0 ,0 ,0 },{0 ,0 ,0 },{0 ,0 ,0 },{0 ,0 ,0 },{0 ,0 ,0 },{0 ,0 ,0 },{0 ,0 ,0 },{0 ,0 ,0 },};
    public Game(){

        chargeVect(winningTemplate,1,new int[]{1,2,3});
    }
    private void chargeVect(int[][] table, int index_in_table,int [] vector){
        for(int i=0; i<3; i++){
            table[index_in_table][i]= vector[i];
        }
    }

    public void showGameState(){
        this.myGameBoard.printContent();
    }

    private Board myGameBoard = new Board();

}

