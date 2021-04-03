package com.tic_tac_toe_log;

import java.util.Scanner;

public class Game{

    public static int[][] winningTemplate = {{0 ,0 ,0 },{0 ,0 ,0 },{0 ,0 ,0 },{0 ,0 ,0 },{0 ,0 ,0 },{0 ,0 ,0 },{0 ,0 ,0 },{0 ,0 ,0 },};
    private Board myGameBoard = new Board();
    private boolean thereIsWinner;
    private char currentPlayer;
    private int playCounter = 0;

    public Game(){
        this.thereIsWinner = false;
        chargeVect(winningTemplate,1,new int[]{1,2,3});
    }


    private void chargeVect(int[][] table, int index_in_table,int [] vector){
        for(int i=0; i<3; i++){
            table[index_in_table][i]= vector[i];
        }
    }

    public void showGameState(){
        System.out.println();
        this.myGameBoard.printContent();
        System.out.println("Player:"+currentPlayer);
    }
    private boolean newMove(){
        playCounter++;
        if(playCounter>9) return false;
        checkForWinner();
        return true;
    }

    private void checkForWinner(){
        thereIsWinner = myGameBoard.isWinner(currentPlayer);
    }

    public void startGame(){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        while (!thereIsWinner){
            currentPlayer = (currentPlayer=='X')?'O' :'X';
            //show game State
            this.showGameState();
            //get Player input
            System.out.print("Where do you want to play ? (Example: 2 1): ");
            x = sc.nextInt();
            y = sc.nextInt();
            if (this.myGameBoard.onChangeSquareValue(this.currentPlayer,x,y)){
                System.out.println("Nice move");
                if(!newMove()){
                    System.out.println();
                    System.out.println("***************");
                    System.out.println("**End of Game**");
                    System.out.println("***************");
                    System.out.println();
                    break;
                };
            }else{
                System.out.println("You can't play here, Try Again");
                continue;
            }

        }if(thereIsWinner){
            System.out.println();
            System.out.println("***The winner is:" + currentPlayer);
        }
    }

}
