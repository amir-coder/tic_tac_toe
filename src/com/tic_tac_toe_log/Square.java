package com.tic_tac_toe_log;

public class Square {
    private char value = ' ';
    private int index = 0;

    //constructor
    public Square(int i,char value) {
        this.index = i;
        this.value = value;
    }

    public char getValue() {
        return this.value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public void setIndex(int index) {
        this.index = index;
        value = Main.symbols.get(index);
    }

    public int getIndex() {
        return this.index;
    }

}
