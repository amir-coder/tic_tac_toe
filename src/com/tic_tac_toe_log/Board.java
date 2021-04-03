package com.tic_tac_toe_log;

import java.util.ArrayList;

public class Board {
    ArrayList<Square> squares = new ArrayList<Square>();

    public Board() {
        int index_to_9 = 1;
        for (index_to_9 = 1; index_to_9 <= 9; index_to_9++) {
            Square mySquare = new Square(index_to_9,Main.symbols.get(0));
            this.squares.add(mySquare);
        }
    }

    public boolean isWinner(Square currentPlayer) {
        return true;
    }

    public void printContent(){
        for(Square s:this.squares){
            System.out.println("Square: "+ s.getIndex() +" has:"+ s.getValue());
        }
    }

}
