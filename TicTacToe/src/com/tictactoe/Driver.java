package com.tictactoe;

import com.tictactoe.service.BoardService;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Player Names: ");

        String player1, player2;
        player1 = scanner.next();
        player2 = scanner.next();

        System.out.println("Player 1: " + player1 + " " + "X");
        System.out.println("Player 2: " + player2 + " " + "O");

        System.out.println("Enter Board Size: ");
        int boardSize = scanner.nextInt();

        BoardService boardService = new BoardService(boardSize, player1, player2);

        int flag = 0;

        while(!boardService.isGameOver){
            if(flag == 0) System.out.println(player1 + ": ");
            else System.out.println(player2 + ": ");

            String symbol, player;

            if(flag == 0){
                symbol = "X";
                player = player1;
            }
            else{
                symbol = "O";
                player = player2;
            }

            int xCoordinate = scanner.nextInt();
            int yCoordinate = scanner.nextInt();

            boardService.playTheGame(player, xCoordinate, yCoordinate, symbol);

            if(flag == 0) flag = 1;
            else flag = 0;
        }
    }
}
