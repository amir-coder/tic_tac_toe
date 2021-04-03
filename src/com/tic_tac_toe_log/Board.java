package com.tic_tac_toe_log;

import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares = new ArrayList<Square>();

    public Board() {
        int index_to_9 = 1;
        for (index_to_9 = 1; index_to_9 <= 9; index_to_9++) {
            Square mySquare = new Square(index_to_9,Main.symbols.get(0));
            this.squares.add(mySquare);
        }
    }

    public boolean onChangeSquareValue(char value, int x, int y){
        int index = 3*(y-1) +1 + (x-1) ;
        if(!squares.get(index).isEmpty()){
            return false;
        }
        squares.get(index-1).setValue(value);
        return true;
    }

    public boolean isWinner(char currentPlayer) {
        for(int[] vect: Game.winningTemplate){
            if(
                    (squares.get(vect[0]-1).getValue()==currentPlayer)&&(squares.get(vect[1]-1).getValue()==currentPlayer)&&(squares.get(vect[3]-1).getValue()==currentPlayer)
            )return true;
        }
        return false;
    }

    public void printContent(){
        System.out.println(" -------------");
        System.out.println(" | "+squares.get(0).getValue()+" | "+squares.get(1).getValue()+" | "+squares.get(2).getValue()+" | ");
        System.out.println(" -------------");
        System.out.println(" | "+squares.get(3).getValue()+" | "+squares.get(4).getValue()+" | "+squares.get(5).getValue()+" | ");
        System.out.println(" -------------");
        System.out.println(" | "+squares.get(6).getValue()+" | "+squares.get(7).getValue()+" | "+squares.get(8).getValue()+" | ");
        System.out.println(" -------------");
    }

}
