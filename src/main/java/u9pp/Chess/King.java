package u9pp.Chess;
class King extends ChessPiece{
  
  King(ChessPiece[][] newBoard, int row, int col, boolean isWhite){
  super(newBoard, row, col, isWhite); 
  }
  public void doMove(int rows, int cols){
  if(super.doMove(rows, cols) == true){
    if(posKingMove(rows, cols) == true)
      if(boards[rows][cols] == null || (this.isWhite != boards[rows][cols])){
        if(kingNear(row, cols) == true){
          return true;
          }
        }
      }
    return false;
  }
  
  public boolean posKingMove(int rows, int cols){
    for(int i = this.row - 1; i < this.row + 2; i++){
      for(int j = this.col - 1; i < this.row + 2; j++){
        if(super.doMove(i, j) == true){
          if(i != this.row || j != this.col){
            if(i == rows && j == cols){
            return true;
            }
          }
        }
      }
    }
    return false;
  }

public boolean kingNear(int rows, int cols){
  for(int i = row - 1; i < row + 2; i++){
      for(int j = col - 1; i < row + 2; j++){
        if(board[i][j] instanceof King && board[i][j] != this){
          return true;
        }
      }
    }
    return false;
  }
}