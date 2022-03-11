package u9pp.Chess;
public class ChessPiece{
  
public int row;
public int col;
public boolean isWhite;
public ChessPiece[][] board;
  
  public ChessPiece(ChessPiece[][] newBoard, int rows, int cols, boolean isWhites){

    board = newBoard;
    row = rows;
    col = cols;
    isWhite = isWhites;
    
  }
  public boolean canMoveTo(int rows, int col){
    if((rows >= 0 && rows < board.length) && (col >= 0 && col < board[0].length)){
      return true;
    }
    return false;
  }
  
  public void doMove(int rows, int cols){
    ChessPiece temp = board[this.row][this.col];
    board[rows][cols] = temp;
    board[this.row][this.col] = null;
    this.row = row;
    this.col = cols;
    
  }
  
  
  public boolean isWhite(){
    
    if(this.isWhite == true){
      return true;
    }
    return false;
  }
  
}