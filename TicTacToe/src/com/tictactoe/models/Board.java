package com.tictactoe.models;

public class Board {

    private int boardSize;
    private String[][] board;
    private int noOfMoves;

    public Board(int boardSize){
        this.boardSize = boardSize;
        board = new String[boardSize][boardSize];
        this.noOfMoves = 0;
        for(int i = 0; i < this.boardSize; i++){
            for(int j = 0; j < this.boardSize; j++){
                board[i][j] = "-";
            }
        }
    }

    public int getBoardSize(){
        return boardSize;
    }

    public int getNoOfMoves(){
        return noOfMoves;
    }

    public void printBoard(){
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*******************");
    }

    public void addMoveToTheBoard(int xCoordinate, int yCoordinate, String symbol){
        if(xCoordinate < 0 || xCoordinate >= boardSize || yCoordinate < 0 || yCoordinate >= boardSize){
            System.out.println("Invalid Move");
            return;
        }
        if(board[xCoordinate][yCoordinate] != "-"){
            System.out.println("Invalid Move");
            return;
        }
        board[xCoordinate][yCoordinate] = symbol;
        noOfMoves += 1;
        printBoard();
    }

    public boolean isGameOver(String symbol){
        int row1 = 0, row2 = 0, row3 = 0, col1 = 0, col2 = 0, col3 = 0, dia1 = 0, dia2 = 0;

        for(int i = 0;  i < boardSize; i++){
            if(board[i][0] == symbol) row1 += 1;
            if(board[i][1] == symbol) row2 += 1;
            if(board[i][2] == symbol) row3 += 1;
            if(board[i][i] == symbol) dia1 += 1;
            if(board[i][boardSize - i - 1] == symbol) dia2 += 1;
        }

        if(row1 == boardSize || row2 == boardSize || row3 == boardSize || dia1 == boardSize || dia2 == boardSize) return true;

        for(int j = 0; j < boardSize; j++){
            if(board[0][j] == symbol) col1 += 1;
            if(board[1][j] == symbol) col2 += 1;
            if(board[2][j] == symbol) col3 += 1;
        }

        if(col1 == boardSize || col2 == boardSize || col3 == boardSize) return true;

        return false;
    }
}
