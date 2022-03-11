package u9pp.Chess;

public class Queen extends ChessPiece{
  
  public Queen(ChessPiece[][] newBoard, int rows, int cols, boolean isWhites){
    super(newBoard, rows, cols, isWhites);
  }
  public void doMove(int rows, int cols){
  super.doMove(rows,cols);
  }  

  public boolean canMoveTo(int rows, int cols){
    if(diagPosMoves(rows, cols) == true || upLeftPosMoves(rows, cols) == true){
      return true;
    }
    return false;
  }

  public String toString(){
    if(this.isWhite == true){
      return "Q";
    }
    else if(this.isWhite == false){
      return "q";
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
 
 