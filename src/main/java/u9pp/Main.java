package u9pp;

import java.util.*;

// import u9pp.MonsterFighter.MonsterFighterGame;
import u9pp.Chess.*;
import u9pp.Chess.Pawn;

public class Main 
{
    public static void main( String[] args ) {

        // Scanner scanner = new Scanner(System.in);

        // String prompt = "Welcome to u9pp :)\nAvailable games:\n"
        //     + "1: Monster Fighter\n"
        //     + "2: Chess\n"
        //     + "Select a game: ";
        // int gameSelection = InputHelper.getValidNumberInput(scanner, prompt, 1, 2);

        // if(gameSelection == 1) 
        // {
        //     MonsterFighterGame game = new MonsterFighterGame();
        //     game.play(scanner);
        // } 
        // else if (gameSelection == 2) 
        // {
        //     Chess chess = new Chess();
        //     chess.play(scanner);
        // }
        
        // scanner.close();\

      ChessPiece[][] board = new ChessPiece[8][8];
      board[5][5] = new Queen(board, 5,5,true);
      board[7][5] = new Pawn(board, 7,5,false);
      board[0][5] = new Pawn(board, 0,5,false);
      board[5][0] = new Pawn(board, 5,0,false);
      board[5][7] = new Pawn(board, 5,7,false);
      // System.out.println(board[5][5].canMoveTo(7,5));
      System.out.println(board[5][5].canMoveTo(0,5));
      System.out.println(board[5][5].canMoveTo(5,0));
      System.out.println(board[5][5].canMoveTo(5,7));
    }
}

