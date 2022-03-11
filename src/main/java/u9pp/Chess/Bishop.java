package u9pp.Chess;

public class Bishop extends ChessPiece{
  
  public Bishop(ChessPiece[][] newBoard, int rows, int cols, boolean isWhites){
    super(newBoard, rows, cols, isWhites);
  }
  public void doMove(int rows, int cols){
  super.doMove(rows,cols);
}

  public boolean canMoveTo(int rows, int cols){
    if(diagPosMoves(rows, cols) == true){
      return true;
    }
    return false;
  }

  public String toString(){
    if(this.isWhite == true){
      return "B";
    }
    else if(this.isWhite == false){
      return "b";
    }
    return "";
  }
  
    public boolean diagPosMoves(int rows, int cols){
      if(super.canMoveTo(rows,cols) == true){
        
        for(int i = 1; i < board.length; i ++){
          
          // Bottom right corner
          if(super.canMoveTo((this.row + i),(this.col + i)) == true){
            if(board[(this.row + i)][(this.col + i)] == null){
              if((this.row + i) == rows && (this.col + i) == cols){
                return true;
              }
            }
            else if(board[(this.row + i)][(this.col + i)] != null){
              if(this.isWhite != board[(this.row + i)][(this.col + i)].isWhite){
                if((this.row + i) == rows && (this.col + i) == cols){
                  return true;
                }
                else{
                  return false;
                }
              }
              else if(this.isWhite == board[(this.row + i)][(this.col + i)].isWhite){
                return false;
              }
            }
          }
          
          //Top Left corner
          if(super.canMoveTo((this.row - i),(this.col - i)) == true){
            if(board[(this.row - i)][(this.col - i)] == null){
              if((this.row - i) == rows && (this.col - i) == cols){
                return true;
              }
            }
            else if(board[(this.row - i)][(this.col - i)] != null){
              if(this.isWhite != board[(this.row - i)][(this.col - i)].isWhite){
                if((this.row - i) == rows && (this.col - i) == cols){
                  return true;
                }
                else{
                  return false;
                }
              }
              else if(this.isWhite == board[(this.row - i)][(this.col - i)].isWhite){
                return false;
              }
            }
          }
          
          // Top Right Corner
          if(super.canMoveTo((this.row - i),(this.col + i)) == true){
            if(board[(this.row - i)][(this.col + i)] == null){
              if((this.row - i) == rows && (this.col + i) == cols){
                return true;
              }
            }
            else if(board[(this.row - i)][(this.col + i)] != null){
              if(this.isWhite != board[(this.row - i)][(this.col + i)].isWhite){
                if((this.row - i) == rows && (this.col + i) == cols){
                  return true;
                }
                else{
                  return false;
                }
              }
              else if(this.isWhite == board[(this.row - i)][(this.col + i)].isWhite){
                return false;
              }
            }
          }
          
          // Bottom Left Corner
          if(super.canMoveTo((this.row + i),(this.col - i)) == true){
            if(board[(this.row + i)][(this.col - i)] == null){
              if((this.row + i) == rows && (this.col - i) == cols){
                
                return true;
              }
            }
            else if(board[(this.row + i)][(this.col - i)] != null){
              if(this.isWhite != board[(this.row + i)][(this.col - i)].isWhite){
                if((this.row + i) == rows && (this.col - i) == cols){
                  return true;
                }
                else{
                  return false;
                }
              }
              else if(this.isWhite == board[(this.row + i)][(this.col - i)].isWhite){
                return false;
              }
            } 
          } 
        }
      }
      return false;
    }
 
} 