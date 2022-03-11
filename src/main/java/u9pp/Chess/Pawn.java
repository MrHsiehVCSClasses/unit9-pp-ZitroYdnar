package u9pp.Chess;

public class Pawn extends ChessPiece{
  private boolean firstTurn = true;
  private int direction = 1;
  
 public Pawn(ChessPiece[][] newBoard, int rows, int cols, boolean isWhites){
    super(newBoard, rows, cols, isWhites);
   if(this.isWhite == true){
     direction = -1;
   }
  } 

    public boolean canMoveTo(int rows, int cols){
    if(super.canMoveTo(rows, cols) == true){
      
      if(firstTurn == true && this.row + (2 * direction) == rows && this.col == cols){
        if(board[rows][cols] == null && board[this.row + (2 * direction)][this.col] == null){
          return true;
          }
      }
    else if(this.row + direction == rows && this.col == cols){
        if(board[rows][cols] == null && board[this.row + direction][this.col] == null){
          return true;
        }
      }
      else if(this.row + direction == rows && this.col + -1 == cols){
        if(board[this.row + direction][this.col + -1] != null && board[rows][cols].isWhite !=this.isWhite){
         return true; 
        }
      }
      else if(this.row + direction == rows && this.col + 1 == cols){
        if(board[this.row + direction][this.col + 1] != null && board[rows][cols].isWhite !=this.isWhite){
         return true; 
        }
      }
    }
      
      return false;
  }

  public void doMove(int rows, int cols){
    super.doMove(rows, cols);
  firstTurn = false;
  }

  public String toString(){
    if(this.isWhite == true){
      return "P";
    }
    else if(this.isWhite == false){
      return "p";
    }
    return "";
  }


  
  
}