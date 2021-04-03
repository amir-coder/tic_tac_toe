package com.tic_tac_toe_log;

import com.tic_tac_toe_log.*;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static HashMap<Integer, Character> symbols = new HashMap<Integer, Character> ();
    public static void main(String[] args) {
        Main.symbols.put(0,' ');
        Main.symbols.put(1,'X');
        Main.symbols.put(2,'O');
        Game myGame = new Game();
        myGame.startGame();
    }
}


