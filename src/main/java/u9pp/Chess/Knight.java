package u9pp.Chess;

class Knight extends ChessPiece{
  private int[] xPos = {2,1,-1,-2,-2,-1,1,2};
  private int[] yPos = {1,2,2,1,-1,-2,-2,-1};
  
  Knight(ChessPiece[][] newBoard, int rows, int cols, boolean isWhites){
  super(newBoard, rows, cols, isWhites); 
  }

  public boolean canMoveTo(int rows, int cols){
  if(super.canMoveTo(rows, cols) == true){
    if(knightMoves(rows, cols)== true){
      if(board[rows][cols] == null || (this.isWhite != board[rows][cols].isWhite)){
          return true;
        }
     }
  }
    return false;
}

  public String toString(){
    if(this.isWhite == true){
      return "N";
    }
    else if(this.isWhite == false){
      return "n";
    }
    return "";
  }

  public boolean knightMoves(int rows, int cols){
    flor(int i = 0; i < xPos.length; i++){
      if(super.canMoveTo((this.row + yPos[i]),(this.col + xPos[i])) == true){
        if(board[(this.row + yPos[i])][(this.col + xPos[i])]== null || board[(this.row + yPos[i])][(this.col + xPos[i])].isWhite != this.isWhite){
          if((this.row + yPos[i]) == rows && (this.col + xPos[i]) == cols ){
          return true;
          }
        }
      }
    }
    return false;
  }
  
}