package u9pp.Chess;

public class Rook extends ChessPiece{
  
  public Rook(ChessPiece[][] newBoard, int rows, int cols, boolean isWhites){
    super(newBoard, rows, cols, isWhites);
  }
  public void doMove(int rows, int cols){
  super.doMove(rows,cols);
}

  public boolean canMoveTo(int rows, int cols){
    if(upLeftPosMoves(rows, cols) == true){
      return true;
    }
    return false;
  }

  public String toString(){
    if(this.isWhite == true){
      return "R";
    }
    else if(this.isWhite == false){
      return "r";
    }
    return "";
  }

  public boolean upLeftPosMoves(int rows, int cols){
    if(super.canMoveTo(rows,cols) == true){

      for(int j = 1; j < board.length; j++){
        
        // Up Direction
        if(super.canMoveTo((this.row - j),this.col) == true){
            if(board[(this.row - j)][this.col] == null){
              if((this.row - j) == rows && this.col == cols){
                return true;
              }
            }
            else if(board[(this.row - j)][this.col] != null){
              if(this.isWhite != board[(this.row - j)][this.col].isWhite){
                if((this.row - j) == rows && this.col == cols){
                  return true;
                }
                else{
                  return false;
                }
              }
              else if(this.isWhite == board[(this.row - j)][this.col].isWhite){
                return false;
              }
            }
          }
        // Down Direction
        if(super.canMoveTo((this.row + j),this.col) == true){
            if(board[(this.row + j)][this.col] == null){
              if((this.row + j) == rows && this.col == cols){
                return true;
              }
            }
            else if(board[(this.row + j)][this.col] != null){
              if(this.isWhite != board[(this.row + j)][this.col].isWhite){
                if((this.row + j) == rows && this.col == cols){
                  return true;
                }
                else{
                  return false;
                }
              }
              else if(this.isWhite == board[(this.row + j)][this.col].isWhite){
                return false;
              }
            }
          }
        
        // Left Direction
        if(super.canMoveTo(this.row,(this.col - j)) == true){
            if(board[this.row][this.col - j] == null){
              if(this.row == rows && (this.col - j) == cols){
                return true;
              }
            }
            else if(board[this.row][(this.col - j)] != null){
              if(this.isWhite != board[this.row][(this.col - j)].isWhite){
                if(this.row == rows && (this.col - j) == cols){
                  return true;
                }
                else{
                  return false;
                }
              }
              else if(this.isWhite == board[this.row][(this.col - j)].isWhite){
                return false;
              }
            }
          }
        
        // Right Direction
        if(super.canMoveTo(this.row,(this.col + j)) == true){
            if(board[this.row][this.col + j] == null){
              if(this.row == rows && (this.col + j) == cols){
                return true;
              }
            }
            else if(board[this.row][(this.col + j)] != null){
              if(this.isWhite != board[this.row][(this.col + j)].isWhite){
                if(this.row == rows && (this.col + j) == cols){
                  return true;
                }
                else{
                  return false;
                }
              }
              else if(this.isWhite == board[this.row][(this.col + j)].isWhite){
                return false;
              }
            }
          }
      }
    }
    return false;
  }


  
} 