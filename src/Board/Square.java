package Board;

import Pieces.Piece;

public class Square {
    private char letter;
    private int number;
    private Piece piece = null;
    private Square upperLeft;
    private Square upper;
    private  Square upperRight;
    private Square left;
    private Square right;
    private Square bottomLeft;
    private Square bottom;
    private  Square bottomRight;


    public Square(char letter,int number){
        this.letter=letter;
        this.number=number;
    }

    public boolean isFree(){
        return piece==null;
    }
    public void setUpperLeft(Square square){
        this.upperLeft=square;
    }
    public void setUpper(Square square){
        this.upper=square;
    }
    public void setUpperRight(Square square){
        this.upperRight=square;
    }
    public void setLeft(Square square){
        this.left=square;
    }
    public void setRight(Square square){
        this.right=square;
    }
    public void setBottomLeft(Square square){
        this.bottomLeft=square;
    }
    public void setBottom(Square square){
        this.bottom=square;
    }
    public void setBottomRight(Square square){
        this.bottomRight=square;
    }
}
