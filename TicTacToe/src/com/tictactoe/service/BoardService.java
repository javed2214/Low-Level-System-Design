package com.tictactoe.service;

import com.tictactoe.models.Board;
import com.tictactoe.models.Player;

public class BoardService {

    private Board board;
    private Player player1;
    private Player player2;
    public boolean isGameOver = false;

    public BoardService(int boardSize, String player1, String player2){
        board = new Board(boardSize);
        board.printBoard();
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
    }

    public void playTheGame(String player, int xCoordinate, int yCoordinate, String symbol){
        board.addMoveToTheBoard(xCoordinate, yCoordinate, symbol);
        if(board.isGameOver(symbol)){
            isGameOver = true;
            System.out.println("Game Over");
            System.out.println("Result: " + player + " Won!!!");
            return;
        }
        if(board.getNoOfMoves() == board.getBoardSize() * board.getBoardSize()){
            isGameOver = true;
            System.out.println("Game Over");
            System.out.println("Result: Tie");
            return;
        }
    }
}
